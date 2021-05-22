package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.tl  reason: case insensitive filesystem */
public final class C2247tl extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f5648a;

    /* renamed from: b  reason: collision with root package name */
    private long f5649b;

    C2247tl(InputStream inputStream, long j) {
        super(inputStream);
        this.f5648a = j;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.f5648a - this.f5649b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f5649b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f5649b += (long) read;
        }
        return read;
    }
}
