package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.xda  reason: case insensitive filesystem */
final class C2508xda extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private C2301uda f5994a;

    /* renamed from: b  reason: collision with root package name */
    private Pba f5995b;

    /* renamed from: c  reason: collision with root package name */
    private int f5996c;
    private int d;
    private int e;
    private int f;
    private final /* synthetic */ C2232tda g;

    public C2508xda(C2232tda tda) {
        this.g = tda;
        a();
    }

    private final int a(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        while (i4 > 0) {
            b();
            if (this.f5995b == null) {
                break;
            }
            int min = Math.min(this.f5996c - this.d, i4);
            if (bArr != null) {
                this.f5995b.a(bArr, this.d, i3, min);
                i3 += min;
            }
            this.d += min;
            i4 -= min;
        }
        return i2 - i4;
    }

    private final void a() {
        this.f5994a = new C2301uda(this.g, null);
        this.f5995b = (Pba) this.f5994a.next();
        this.f5996c = this.f5995b.size();
        this.d = 0;
        this.e = 0;
    }

    private final void b() {
        int i;
        if (this.f5995b != null && this.d == (i = this.f5996c)) {
            this.e += i;
            this.d = 0;
            if (this.f5994a.hasNext()) {
                this.f5995b = (Pba) this.f5994a.next();
                this.f5996c = this.f5995b.size();
                return;
            }
            this.f5995b = null;
            this.f5996c = 0;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.g.size() - (this.e + this.d);
    }

    public final void mark(int i) {
        this.f = this.e + this.d;
    }

    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        b();
        Pba pba = this.f5995b;
        if (pba == null) {
            return -1;
        }
        int i = this.d;
        this.d = i + 1;
        return pba.h(i) & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            int a2 = a(bArr, i, i2);
            if (a2 == 0) {
                return -1;
            }
            return a2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        a();
        a(null, 0, this.f);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) a(null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }
}
