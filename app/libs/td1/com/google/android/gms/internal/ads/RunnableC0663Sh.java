package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Sh  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC0663Sh implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f3114a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f3115b;

    RunnableC0663Sh(OutputStream outputStream, byte[] bArr) {
        this.f3114a = outputStream;
        this.f3115b = bArr;
    }

    public final void run() {
        C0585Ph.a(this.f3114a, this.f3115b);
    }
}
