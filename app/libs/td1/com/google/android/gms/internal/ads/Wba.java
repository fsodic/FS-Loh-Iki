package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
public final class Wba extends Uba {
    private final byte[] f;
    private final boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    private Wba(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.m = Integer.MAX_VALUE;
        this.f = bArr;
        this.h = i3 + i2;
        this.j = i2;
        this.k = this.j;
        this.g = z;
    }

    private final byte A() {
        int i2 = this.j;
        if (i2 != this.h) {
            byte[] bArr = this.f;
            this.j = i2 + 1;
            return bArr[i2];
        }
        throw Bca.a();
    }

    private final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.h;
            int i4 = this.j;
            if (i2 <= i3 - i4) {
                this.j = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw Bca.b();
        }
        throw Bca.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Wba.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Wba.w():long");
    }

    private final int x() {
        int i2 = this.j;
        if (this.h - i2 >= 4) {
            byte[] bArr = this.f;
            this.j = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw Bca.a();
    }

    private final long y() {
        int i2 = this.j;
        if (this.h - i2 >= 8) {
            byte[] bArr = this.f;
            this.j = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw Bca.a();
    }

    private final void z() {
        this.h += this.i;
        int i2 = this.h;
        int i3 = i2 - this.k;
        int i4 = this.m;
        if (i3 > i4) {
            this.i = i3 - i4;
            this.h = i2 - this.i;
            return;
        }
        this.i = 0;
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final double a() {
        return Double.longBitsToDouble(y());
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final void a(int i2) {
        if (this.l != i2) {
            throw Bca.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final float b() {
        return Float.intBitsToFloat(x());
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final boolean b(int i2) {
        int d;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.h - this.j >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f;
                    int i5 = this.j;
                    this.j = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw Bca.c();
            }
            while (i4 < 10) {
                if (A() < 0) {
                    i4++;
                }
            }
            throw Bca.c();
            return true;
        } else if (i3 == 1) {
            f(8);
            return true;
        } else if (i3 == 2) {
            f(v());
            return true;
        } else if (i3 == 3) {
            do {
                d = d();
                if (d == 0) {
                    break;
                }
            } while (b(d));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                f(4);
                return true;
            }
            throw Bca.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int c(int i2) {
        if (i2 >= 0) {
            int t = i2 + t();
            int i3 = this.m;
            if (t <= i3) {
                this.m = t;
                z();
                return i3;
            }
            throw Bca.a();
        }
        throw Bca.b();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final String c() {
        int v = v();
        if (v > 0) {
            int i2 = this.h;
            int i3 = this.j;
            if (v <= i2 - i3) {
                String str = new String(this.f, i3, v, C2230tca.f5626a);
                this.j += v;
                return str;
            }
        }
        if (v == 0) {
            return BuildConfig.FLAVOR;
        }
        if (v < 0) {
            throw Bca.b();
        }
        throw Bca.a();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int d() {
        if (s()) {
            this.l = 0;
            return 0;
        }
        this.l = v();
        int i2 = this.l;
        if ((i2 >>> 3) != 0) {
            return i2;
        }
        throw Bca.d();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final void d(int i2) {
        this.m = i2;
        z();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final long e() {
        return w();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final long f() {
        return w();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int g() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final long h() {
        return y();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int i() {
        return x();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final boolean j() {
        return w() != 0;
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final String k() {
        int v = v();
        if (v > 0) {
            int i2 = this.h;
            int i3 = this.j;
            if (v <= i2 - i3) {
                String b2 = Yda.b(this.f, i3, v);
                this.j += v;
                return b2;
            }
        }
        if (v == 0) {
            return BuildConfig.FLAVOR;
        }
        if (v <= 0) {
            throw Bca.b();
        }
        throw Bca.a();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final Iba l() {
        byte[] bArr;
        int v = v();
        if (v > 0) {
            int i2 = this.h;
            int i3 = this.j;
            if (v <= i2 - i3) {
                Iba a2 = Iba.a(this.f, i3, v);
                this.j += v;
                return a2;
            }
        }
        if (v == 0) {
            return Iba.f2236a;
        }
        if (v > 0) {
            int i4 = this.h;
            int i5 = this.j;
            if (v <= i4 - i5) {
                this.j = v + i5;
                bArr = Arrays.copyOfRange(this.f, i5, this.j);
                return Iba.b(bArr);
            }
        }
        if (v > 0) {
            throw Bca.a();
        } else if (v == 0) {
            bArr = C2230tca.f5628c;
            return Iba.b(bArr);
        } else {
            throw Bca.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int m() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int n() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int o() {
        return x();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final long p() {
        return y();
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int q() {
        return Uba.e(v());
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final long r() {
        return Uba.a(w());
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final boolean s() {
        return this.j == this.h;
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int t() {
        return this.j - this.k;
    }

    /* access modifiers changed from: package-private */
    public final long u() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte A = A();
            j2 |= ((long) (A & Byte.MAX_VALUE)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
        }
        throw Bca.c();
    }
}
