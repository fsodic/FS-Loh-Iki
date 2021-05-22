package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jia  reason: case insensitive filesystem */
final class C1553jia {

    /* renamed from: a  reason: collision with root package name */
    private final Dka f4708a = new Dka(8);

    /* renamed from: b  reason: collision with root package name */
    private int f4709b;

    private final long b(Oha oha) {
        int i = 0;
        oha.a(this.f4708a.f1807a, 0, 1);
        int i2 = this.f4708a.f1807a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ -1);
        oha.a(this.f4708a.f1807a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f4708a.f1807a[i] & 255) + (i5 << 8);
        }
        this.f4709b += i4 + 1;
        return (long) i5;
    }

    public final boolean a(Oha oha) {
        long length = oha.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        oha.a(this.f4708a.f1807a, 0, 4);
        long l = this.f4708a.l();
        this.f4709b = 4;
        while (l != 440786851) {
            int i2 = this.f4709b + 1;
            this.f4709b = i2;
            if (i2 == i) {
                return false;
            }
            oha.a(this.f4708a.f1807a, 0, 1);
            l = ((l << 8) & -256) | ((long) (this.f4708a.f1807a[0] & 255));
        }
        long b2 = b(oha);
        long j2 = (long) this.f4709b;
        if (b2 != Long.MIN_VALUE && (length == -1 || j2 + b2 < length)) {
            while (true) {
                int i3 = this.f4709b;
                long j3 = j2 + b2;
                if (((long) i3) < j3) {
                    if (b(oha) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b3 = b(oha);
                    if (b3 < 0 || b3 > 2147483647L) {
                        return false;
                    }
                    if (b3 != 0) {
                        oha.b((int) b3);
                        this.f4709b = (int) (((long) this.f4709b) + b3);
                    }
                } else if (((long) i3) == j3) {
                    return true;
                }
            }
        }
        return false;
    }
}
