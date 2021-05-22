package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.wo  reason: case insensitive filesystem */
final class C2460wo extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f5931a;

    C2460wo(HttpURLConnection httpURLConnection) {
        super(C0746Vm.a(httpURLConnection));
        this.f5931a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        super.close();
        this.f5931a.disconnect();
    }
}
