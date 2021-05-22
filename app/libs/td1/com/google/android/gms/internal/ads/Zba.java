package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

final class Zba extends Uba {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Yba n;

    private Zba(InputStream inputStream, int i2) {
        super();
        this.m = Integer.MAX_VALUE;
        this.n = null;
        C2230tca.a((Object) inputStream, "input");
        this.f = inputStream;
        this.g = new byte[i2];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private final byte A() {
        if (this.j == this.h) {
            g(1);
        }
        byte[] bArr = this.g;
        int i2 = this.j;
        this.j = i2 + 1;
        return bArr[i2];
    }

    private final byte[] a(int i2, boolean z) {
        byte[] i3 = i(i2);
        if (i3 != null) {
            return i3;
        }
        int i4 = this.j;
        int i5 = this.h;
        int i6 = i5 - i4;
        this.l += i5;
        this.j = 0;
        this.h = 0;
        List<byte[]> j2 = j(i2 - i6);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.g, i4, bArr, 0, i6);
        for (byte[] bArr2 : j2) {
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }

    private final void f(int i2) {
        int i3 = this.h;
        int i4 = this.j;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.j = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.l;
            int i6 = this.j;
            int i7 = i5 + i6 + i2;
            int i8 = this.m;
            if (i7 <= i8) {
                this.l = i5 + i6;
                int i9 = this.h - i6;
                this.h = 0;
                this.j = 0;
                while (i9 < i2) {
                    try {
                        long j2 = (long) (i2 - i9);
                        long skip = this.f.skip(j2);
                        if (skip >= 0 && skip <= j2) {
                            if (skip == 0) {
                                break;
                            }
                            i9 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.f.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.l += i9;
                        z();
                        throw th;
                    }
                }
                this.l += i9;
                z();
                if (i9 < i2) {
                    int i10 = this.h;
                    int i11 = i10 - this.j;
                    this.j = i10;
                    while (true) {
                        g(1);
                        int i12 = i2 - i11;
                        int i13 = this.h;
                        if (i12 > i13) {
                            i11 += i13;
                            this.j = i13;
                        } else {
                            this.j = i12;
                            return;
                        }
                    }
                }
            } else {
                f((i8 - i5) - i6);
                throw Bca.a();
            }
        } else {
            throw Bca.b();
        }
    }

    private final void g(int i2) {
        if (h(i2)) {
            return;
        }
        if (i2 > (this.f3254c - this.l) - this.j) {
            throw Bca.g();
        }
        throw Bca.a();
    }

    private final boolean h(int i2) {
        do {
            int i3 = this.j;
            int i4 = i3 + i2;
            int i5 = this.h;
            if (i4 > i5) {
                int i6 = this.f3254c;
                int i7 = this.l;
                if (i2 > (i6 - i7) - i3 || i7 + i3 + i2 > this.m) {
                    return false;
                }
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.g;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.l += i3;
                    this.h -= i3;
                    this.j = 0;
                }
                InputStream inputStream = this.f;
                byte[] bArr2 = this.g;
                int i8 = this.h;
                int read = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.f3254c - this.l) - i8));
                if (read == 0 || read < -1 || read > this.g.length) {
                    String valueOf = String.valueOf(this.f.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.h += read;
                    z();
                }
            } else {
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("refillBuffer() called when ");
                sb2.append(i2);
                sb2.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb2.toString());
            }
        } while (this.h < i2);
        return true;
    }

    private final byte[] i(int i2) {
        if (i2 == 0) {
            return C2230tca.f5628c;
        }
        if (i2 >= 0) {
            int i3 = this.l;
            int i4 = this.j;
            int i5 = i3 + i4 + i2;
            if (i5 - this.f3254c <= 0) {
                int i6 = this.m;
                if (i5 <= i6) {
                    int i7 = this.h - i4;
                    int i8 = i2 - i7;
                    if (i8 >= 4096 && i8 > this.f.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.g, this.j, bArr, 0, i7);
                    this.l += this.h;
                    this.j = 0;
                    this.h = 0;
                    while (i7 < bArr.length) {
                        int read = this.f.read(bArr, i7, i2 - i7);
                        if (read != -1) {
                            this.l += read;
                            i7 += read;
                        } else {
                            throw Bca.a();
                        }
                    }
                    return bArr;
                }
                f((i6 - i3) - i4);
                throw Bca.a();
            }
            throw Bca.g();
        }
        throw Bca.b();
    }

    private final List<byte[]> j(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            byte[] bArr = new byte[Math.min(i2, 4096)];
            int i3 = 0;
            while (i3 < bArr.length) {
                int read = this.f.read(bArr, i3, bArr.length - i3);
                if (read != -1) {
                    this.l += read;
                    i3 += read;
                } else {
                    throw Bca.a();
                }
            }
            i2 -= bArr.length;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Zba.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Zba.w():long");
    }

    private final int x() {
        int i2 = this.j;
        if (this.h - i2 < 4) {
            g(4);
            i2 = this.j;
        }
        byte[] bArr = this.g;
        this.j = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final long y() {
        int i2 = this.j;
        if (this.h - i2 < 8) {
            g(8);
            i2 = this.j;
        }
        byte[] bArr = this.g;
        this.j = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final void z() {
        this.h += this.i;
        int i2 = this.l;
        int i3 = this.h;
        int i4 = i2 + i3;
        int i5 = this.m;
        if (i4 > i5) {
            this.i = i4 - i5;
            this.h = i3 - this.i;
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
        if (this.k != i2) {
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
                    byte[] bArr = this.g;
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
            int i3 = i2 + this.l + this.j;
            int i4 = this.m;
            if (i3 <= i4) {
                this.m = i3;
                z();
                return i4;
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
                String str = new String(this.g, i3, v, C2230tca.f5626a);
                this.j += v;
                return str;
            }
        }
        if (v == 0) {
            return BuildConfig.FLAVOR;
        }
        if (v > this.h) {
            return new String(a(v, false), C2230tca.f5626a);
        }
        g(v);
        String str2 = new String(this.g, this.j, v, C2230tca.f5626a);
        this.j += v;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int d() {
        if (s()) {
            this.k = 0;
            return 0;
        }
        this.k = v();
        int i2 = this.k;
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
        byte[] bArr;
        int v = v();
        int i2 = this.j;
        int i3 = 0;
        if (v <= this.h - i2 && v > 0) {
            bArr = this.g;
            this.j = i2 + v;
            i3 = i2;
        } else if (v == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (v <= this.h) {
                g(v);
                bArr = this.g;
                this.j = v;
            } else {
                bArr = a(v, false);
            }
        }
        return Yda.b(bArr, i3, v);
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final Iba l() {
        int v = v();
        int i2 = this.h;
        int i3 = this.j;
        if (v <= i2 - i3 && v > 0) {
            Iba a2 = Iba.a(this.g, i3, v);
            this.j += v;
            return a2;
        } else if (v == 0) {
            return Iba.f2236a;
        } else {
            byte[] i4 = i(v);
            if (i4 != null) {
                return Iba.a(i4);
            }
            int i5 = this.j;
            int i6 = this.h;
            int i7 = i6 - i5;
            this.l += i6;
            this.j = 0;
            this.h = 0;
            List<byte[]> j2 = j(v - i7);
            byte[] bArr = new byte[v];
            System.arraycopy(this.g, i5, bArr, 0, i7);
            for (byte[] bArr2 : j2) {
                System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
                i7 += bArr2.length;
            }
            return Iba.b(bArr);
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
        return this.j == this.h && !h(1);
    }

    @Override // com.google.android.gms.internal.ads.Uba
    public final int t() {
        return this.l + this.j;
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
