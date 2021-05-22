package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

public final class Mha implements Oha {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f2607a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1213eka f2608b;

    /* renamed from: c  reason: collision with root package name */
    private final long f2609c;
    private long d;
    private byte[] e = new byte[65536];
    private int f;
    private int g;

    public Mha(AbstractC1213eka eka, long j, long j2) {
        this.f2608b = eka;
        this.d = j;
        this.f2609c = j2;
    }

    private final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.f2608b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private final boolean a(int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, Jka.a(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.g - this.f, i);
        while (min < i) {
            min = a(this.e, this.f, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        this.f += i;
        this.g = Math.max(this.g, this.f);
        return true;
    }

    private final int b(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        e(min);
        return min;
    }

    private final int d(int i) {
        int min = Math.min(this.g, i);
        e(min);
        return min;
    }

    private final void e(int i) {
        this.g -= i;
        this.f = 0;
        byte[] bArr = this.e;
        int i2 = this.g;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.e, i, bArr, 0, this.g);
        this.e = bArr;
    }

    private final void f(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final void a() {
        this.f = 0;
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final void a(int i) {
        int d2 = d(i);
        while (d2 < i && d2 != -1) {
            byte[] bArr = f2607a;
            d2 = a(bArr, -d2, Math.min(i, bArr.length + d2), d2, false);
        }
        f(d2);
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final void a(byte[] bArr, int i, int i2) {
        if (a(i2, false)) {
            System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int b2 = b(bArr, i, i2);
        while (b2 < i2 && b2 != -1) {
            b2 = a(bArr, i, i2, b2, z);
        }
        f(b2);
        return b2 != -1;
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final void b(int i) {
        a(i, false);
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final int c(int i) {
        int d2 = d(i);
        if (d2 == 0) {
            byte[] bArr = f2607a;
            d2 = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        f(d2);
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final long getLength() {
        return this.f2609c;
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final long getPosition() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final int read(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i, i2);
        if (b2 == 0) {
            b2 = a(bArr, i, i2, 0, true);
        }
        f(b2);
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.Oha
    public final void readFully(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }
}
