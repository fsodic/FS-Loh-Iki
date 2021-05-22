package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.bca  reason: case insensitive filesystem */
public abstract class AbstractC0991bca extends Fba {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f3911a = Logger.getLogger(AbstractC0991bca.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f3912b = Vda.a();

    /* renamed from: c  reason: collision with root package name */
    C1129dca f3913c;

    /* renamed from: com.google.android.gms.internal.ads.bca$a */
    public static class a extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        a(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0991bca.a.<init>(java.lang.String, java.lang.Throwable):void");
        }

        a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.bca$b */
    public static class b extends AbstractC0991bca {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.d = bArr;
                    this.e = 0;
                    this.g = 0;
                    this.f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        private final void b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final int a() {
            return this.f - this.g;
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(byte b2) {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(int i, Iba iba) {
            a(i, 2);
            b(iba);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(int i, AbstractC0993bda bda) {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(bda);
            a(1, 4);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(int i, AbstractC0993bda bda, AbstractC2439wda wda) {
            a(i, 2);
            AbstractC2642zba zba = (AbstractC2642zba) bda;
            int g2 = zba.g();
            if (g2 == -1) {
                g2 = wda.d(zba);
                zba.a(g2);
            }
            b(g2);
            wda.a((Object) bda, (AbstractC1752mea) this.f3913c);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(int i, String str) {
            a(i, 2);
            b(str);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void a(long j) {
            if (!AbstractC0991bca.f3912b || a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    Vda.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                Vda.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void a(AbstractC0993bda bda) {
            b(bda.e());
            bda.a(this);
        }

        @Override // com.google.android.gms.internal.ads.Fba
        public final void a(byte[] bArr, int i, int i2) {
            b(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void b(int i) {
            if (!AbstractC0991bca.f3912b || Bba.a() || a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                if ((i & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    Vda.a(bArr3, (long) i4, (byte) (i | 128));
                    i >>>= 7;
                    if ((i & -128) != 0) {
                        byte[] bArr4 = this.d;
                        int i5 = this.g;
                        this.g = i5 + 1;
                        Vda.a(bArr4, (long) i5, (byte) (i | 128));
                        i >>>= 7;
                        if ((i & -128) != 0) {
                            byte[] bArr5 = this.d;
                            int i6 = this.g;
                            this.g = i6 + 1;
                            Vda.a(bArr5, (long) i6, (byte) (i | 128));
                            i >>>= 7;
                            if ((i & -128) != 0) {
                                byte[] bArr6 = this.d;
                                int i7 = this.g;
                                this.g = i7 + 1;
                                Vda.a(bArr6, (long) i7, (byte) (i | 128));
                                i >>>= 7;
                            }
                        }
                    }
                }
                byte[] bArr7 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                Vda.a(bArr7, (long) i8, (byte) i);
            }
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void b(int i, Iba iba) {
            a(1, 3);
            c(2, i);
            a(3, iba);
            a(1, 4);
        }

        public final void b(Iba iba) {
            b(iba.size());
            iba.a(this);
        }

        public final void b(String str) {
            int i = this.g;
            try {
                int g2 = AbstractC0991bca.g(str.length() * 3);
                int g3 = AbstractC0991bca.g(str.length());
                if (g3 == g2) {
                    this.g = i + g3;
                    int a2 = Yda.a(str, this.d, this.g, a());
                    this.g = i;
                    b((a2 - i) - g3);
                    this.g = a2;
                    return;
                }
                b(Yda.a(str));
                this.g = Yda.a(str, this.d, this.g, a());
            } catch (C0926aea e2) {
                this.g = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new a(e3);
            }
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void c(long j) {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.d;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.d;
                int i6 = this.g;
                this.g = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.d;
                int i7 = this.g;
                this.g = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void d(int i) {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.d;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.AbstractC0991bca
        public final void e(int i, int i2) {
            a(i, 5);
            d(i2);
        }
    }

    private AbstractC0991bca() {
    }

    public static int a(int i, Kca kca) {
        int e = e(i);
        int b2 = kca.b();
        return e + g(b2) + b2;
    }

    public static int a(Iba iba) {
        int size = iba.size();
        return g(size) + size;
    }

    public static int a(Kca kca) {
        int b2 = kca.b();
        return g(b2) + b2;
    }

    static int a(AbstractC0993bda bda, AbstractC2439wda wda) {
        AbstractC2642zba zba = (AbstractC2642zba) bda;
        int g = zba.g();
        if (g == -1) {
            g = wda.d(zba);
            zba.a(g);
        }
        return g(g) + g;
    }

    public static int a(String str) {
        int i;
        try {
            i = Yda.a(str);
        } catch (C0926aea unused) {
            i = str.getBytes(C2230tca.f5626a).length;
        }
        return g(i) + i;
    }

    public static AbstractC0991bca a(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static int b(double d) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(int i, double d) {
        return e(i) + 8;
    }

    public static int b(int i, float f) {
        return e(i) + 4;
    }

    static int b(int i, AbstractC0993bda bda, AbstractC2439wda wda) {
        return e(i) + a(bda, wda);
    }

    public static int b(int i, String str) {
        return e(i) + a(str);
    }

    public static int b(int i, boolean z) {
        return e(i) + 1;
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(int i, Iba iba) {
        int e = e(i);
        int size = iba.size();
        return e + g(size) + size;
    }

    @Deprecated
    static int c(int i, AbstractC0993bda bda, AbstractC2439wda wda) {
        int e = e(i) << 1;
        AbstractC2642zba zba = (AbstractC2642zba) bda;
        int g = zba.g();
        if (g == -1) {
            g = wda.d(zba);
            zba.a(g);
        }
        return e + g;
    }

    public static int d(int i, long j) {
        return e(i) + e(j);
    }

    public static int d(int i, Iba iba) {
        return (e(1) << 1) + g(2, i) + c(3, iba);
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(int i) {
        return g(i << 3);
    }

    public static int e(int i, long j) {
        return e(i) + e(j);
    }

    public static int e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int f(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int f(int i, int i2) {
        return e(i) + f(i2);
    }

    public static int f(int i, long j) {
        return e(i) + e(i(j));
    }

    public static int f(long j) {
        return e(i(j));
    }

    public static int g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int g(int i, int i2) {
        return e(i) + g(i2);
    }

    public static int g(int i, long j) {
        return e(i) + 8;
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return g(l(i));
    }

    public static int h(int i, int i2) {
        return e(i) + g(l(i2));
    }

    public static int h(int i, long j) {
        return e(i) + 8;
    }

    public static int h(long j) {
        return 8;
    }

    public static int i(int i) {
        return 4;
    }

    public static int i(int i, int i2) {
        return e(i) + 4;
    }

    private static long i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int j(int i) {
        return 4;
    }

    public static int j(int i, int i2) {
        return e(i) + 4;
    }

    public static int k(int i) {
        return f(i);
    }

    public static int k(int i, int i2) {
        return e(i) + f(i2);
    }

    private static int l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public final void a(double d) {
        c(Double.doubleToRawLongBits(d));
    }

    public final void a(float f) {
        d(Float.floatToRawIntBits(f));
    }

    public abstract void a(int i);

    public final void a(int i, double d) {
        c(i, Double.doubleToRawLongBits(d));
    }

    public final void a(int i, float f) {
        e(i, Float.floatToRawIntBits(f));
    }

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, Iba iba);

    public abstract void a(int i, AbstractC0993bda bda);

    /* access modifiers changed from: package-private */
    public abstract void a(int i, AbstractC0993bda bda, AbstractC2439wda wda);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    /* access modifiers changed from: package-private */
    public final void a(String str, C0926aea aea) {
        f3911a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) aea);
        byte[] bytes = str.getBytes(C2230tca.f5626a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new a(e);
        } catch (a e2) {
            throw e2;
        }
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : 0);
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public final void b(int i, long j) {
        a(i, i(j));
    }

    public abstract void b(int i, Iba iba);

    public final void b(long j) {
        a(i(j));
    }

    public final void c(int i) {
        b(l(i));
    }

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void d(int i);

    public final void d(int i, int i2) {
        c(i, l(i2));
    }

    public abstract void e(int i, int i2);
}
