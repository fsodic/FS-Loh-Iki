package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

final class Cma extends PushbackInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2526xma f1727a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Cma(C2526xma xma, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f1727a = xma;
    }

    @Override // java.io.FilterInputStream, java.io.PushbackInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final synchronized void close() {
        this.f1727a.f6024c.a();
        super.close();
    }
}
