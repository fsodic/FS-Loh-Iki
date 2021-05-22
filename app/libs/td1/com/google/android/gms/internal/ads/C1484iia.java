package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.iia  reason: case insensitive filesystem */
public final class C1484iia {

    /* renamed from: a  reason: collision with root package name */
    private static final long[] f4584a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f4585b = new byte[8];

    /* renamed from: c  reason: collision with root package name */
    private int f4586c;
    private int d;

    public static int a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f4584a;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f4584a[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long a(Oha oha, boolean z, boolean z2, int i) {
        if (this.f4586c == 0) {
            if (!oha.a(this.f4585b, 0, 1, z)) {
                return -1;
            }
            this.d = a(this.f4585b[0] & 255);
            if (this.d != -1) {
                this.f4586c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.d;
        if (i2 > i) {
            this.f4586c = 0;
            return -2;
        }
        if (i2 != 1) {
            oha.readFully(this.f4585b, 1, i2 - 1);
        }
        this.f4586c = 0;
        return a(this.f4585b, this.d, z2);
    }

    public final void a() {
        this.f4586c = 0;
        this.d = 0;
    }

    public final int b() {
        return this.d;
    }
}
