package b.c.b.a.d.d;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b.c.b.a.d.d.x  reason: case insensitive filesystem */
public abstract class AbstractC0100x extends AbstractC0069h {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f458a = Logger.getLogger(AbstractC0100x.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f459b = cb.a();

    /* renamed from: c  reason: collision with root package name */
    C0104z f460c;

    /* renamed from: b.c.b.a.d.d.x$a */
    static class a extends AbstractC0100x {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        a(byte[] bArr, int i, int i2) {
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
            }
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final int a() {
            return this.f - this.g;
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(byte b2) {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(int i) {
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(int i, int i2) {
            k((i << 3) | i2);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(int i, AbstractC0071i iVar) {
            a(i, 2);
            b(iVar);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(int i, AbstractC0089ra raVar) {
            a(1, 3);
            c(2, i);
            a(3, 2);
            c(raVar);
            a(1, 4);
        }

        /* access modifiers changed from: package-private */
        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(int i, AbstractC0089ra raVar, Fa fa) {
            a(i, 2);
            AbstractC0059c cVar = (AbstractC0059c) raVar;
            int h = cVar.h();
            if (h == -1) {
                h = fa.c(cVar);
                cVar.a(h);
            }
            k(h);
            fa.a((Object) raVar, (qb) this.f460c);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(int i, String str) {
            a(i, 2);
            b(str);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void a(long j) {
            if (!AbstractC0100x.f459b || a() < 10) {
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
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    cb.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                cb.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // b.c.b.a.d.d.AbstractC0069h
        public final void a(byte[] bArr, int i, int i2) {
            b(bArr, i, i2);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void b(int i, int i2) {
            a(i, 0);
            j(i2);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void b(int i, AbstractC0071i iVar) {
            a(1, 3);
            c(2, i);
            a(3, iVar);
            a(1, 4);
        }

        public final void b(AbstractC0071i iVar) {
            k(iVar.size());
            iVar.a(this);
        }

        public final void b(String str) {
            int i = this.g;
            try {
                int d2 = AbstractC0100x.d(str.length() * 3);
                int d3 = AbstractC0100x.d(str.length());
                if (d3 == d2) {
                    this.g = i + d3;
                    int a2 = eb.a(str, this.d, this.g, a());
                    this.g = i;
                    k((a2 - i) - d3);
                    this.g = a2;
                    return;
                }
                k(eb.a(str));
                this.g = eb.a(str, this.d, this.g, a());
            } catch (hb e2) {
                this.g = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void c(int i, int i2) {
            a(i, 0);
            k(i2);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        public final void c(AbstractC0089ra raVar) {
            k(raVar.e());
            raVar.a(this);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void e(int i, int i2) {
            a(i, 5);
            a(i2);
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void j(int i) {
            if (i >= 0) {
                k(i);
            } else {
                a((long) i);
            }
        }

        @Override // b.c.b.a.d.d.AbstractC0100x
        public final void k(int i) {
            if (!AbstractC0100x.f459b || C0067g.a() || a() < 5) {
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
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                if ((i & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    cb.a(bArr3, (long) i4, (byte) (i | 128));
                    i >>>= 7;
                    if ((i & -128) != 0) {
                        byte[] bArr4 = this.d;
                        int i5 = this.g;
                        this.g = i5 + 1;
                        cb.a(bArr4, (long) i5, (byte) (i | 128));
                        i >>>= 7;
                        if ((i & -128) != 0) {
                            byte[] bArr5 = this.d;
                            int i6 = this.g;
                            this.g = i6 + 1;
                            cb.a(bArr5, (long) i6, (byte) (i | 128));
                            i >>>= 7;
                            if ((i & -128) != 0) {
                                byte[] bArr6 = this.d;
                                int i7 = this.g;
                                this.g = i7 + 1;
                                cb.a(bArr6, (long) i7, (byte) (i | 128));
                                i >>>= 7;
                            }
                        }
                    }
                }
                byte[] bArr7 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                cb.a(bArr7, (long) i8, (byte) i);
            }
        }
    }

    /* renamed from: b.c.b.a.d.d.x$b */
    public static class b extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.AbstractC0100x.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private AbstractC0100x() {
    }

    public static int a(int i, Z z) {
        int b2 = b(i);
        int b3 = z.b();
        return b2 + d(b3) + b3;
    }

    public static int a(Z z) {
        int b2 = z.b();
        return d(b2) + b2;
    }

    public static int a(AbstractC0071i iVar) {
        int size = iVar.size();
        return d(size) + size;
    }

    public static int a(AbstractC0089ra raVar) {
        int e = raVar.e();
        return d(e) + e;
    }

    static int a(AbstractC0089ra raVar, Fa fa) {
        AbstractC0059c cVar = (AbstractC0059c) raVar;
        int h = cVar.h();
        if (h == -1) {
            h = fa.c(cVar);
            cVar.a(h);
        }
        return d(h) + h;
    }

    public static int a(String str) {
        int i;
        try {
            i = eb.a(str);
        } catch (hb unused) {
            i = str.getBytes(O.f380a).length;
        }
        return d(i) + i;
    }

    public static AbstractC0100x a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b(double d) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(int i) {
        return d(i << 3);
    }

    public static int b(int i, double d) {
        return b(i) + 8;
    }

    public static int b(int i, float f) {
        return b(i) + 4;
    }

    public static int b(int i, Z z) {
        return (b(1) << 1) + g(2, i) + a(3, z);
    }

    public static int b(int i, AbstractC0089ra raVar) {
        return (b(1) << 1) + g(2, i) + b(3) + a(raVar);
    }

    static int b(int i, AbstractC0089ra raVar, Fa fa) {
        return b(i) + a(raVar, fa);
    }

    public static int b(int i, String str) {
        return b(i) + a(str);
    }

    public static int b(int i, boolean z) {
        return b(i) + 1;
    }

    @Deprecated
    public static int b(AbstractC0089ra raVar) {
        return raVar.e();
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return d(length) + length;
    }

    public static int c(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int c(int i, AbstractC0071i iVar) {
        int b2 = b(i);
        int size = iVar.size();
        return b2 + d(size) + size;
    }

    @Deprecated
    static int c(int i, AbstractC0089ra raVar, Fa fa) {
        int b2 = b(i) << 1;
        AbstractC0059c cVar = (AbstractC0059c) raVar;
        int h = cVar.h();
        if (h == -1) {
            h = fa.c(cVar);
            cVar.a(h);
        }
        return b2 + h;
    }

    public static int d(int i) {
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

    public static int d(int i, long j) {
        return b(i) + e(j);
    }

    public static int d(int i, AbstractC0071i iVar) {
        return (b(1) << 1) + g(2, i) + c(3, iVar);
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(int i) {
        return d(m(i));
    }

    public static int e(int i, long j) {
        return b(i) + e(j);
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
        return 4;
    }

    public static int f(int i, int i2) {
        return b(i) + c(i2);
    }

    public static int f(int i, long j) {
        return b(i) + e(i(j));
    }

    public static int f(long j) {
        return e(i(j));
    }

    public static int g(int i) {
        return 4;
    }

    public static int g(int i, int i2) {
        return b(i) + d(i2);
    }

    public static int g(int i, long j) {
        return b(i) + 8;
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return c(i);
    }

    public static int h(int i, int i2) {
        return b(i) + d(m(i2));
    }

    public static int h(int i, long j) {
        return b(i) + 8;
    }

    public static int h(long j) {
        return 8;
    }

    @Deprecated
    public static int i(int i) {
        return d(i);
    }

    public static int i(int i, int i2) {
        return b(i) + 4;
    }

    private static long i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int j(int i, int i2) {
        return b(i) + 4;
    }

    public static int k(int i, int i2) {
        return b(i) + c(i2);
    }

    private static int m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public final void a(double d) {
        c(Double.doubleToRawLongBits(d));
    }

    public final void a(float f) {
        a(Float.floatToRawIntBits(f));
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

    public abstract void a(int i, AbstractC0071i iVar);

    public abstract void a(int i, AbstractC0089ra raVar);

    /* access modifiers changed from: package-private */
    public abstract void a(int i, AbstractC0089ra raVar, Fa fa);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    /* access modifiers changed from: package-private */
    public final void a(String str, hb hbVar) {
        f458a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) hbVar);
        byte[] bytes = str.getBytes(O.f380a);
        try {
            k(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new b(e);
        } catch (b e2) {
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

    public abstract void b(int i, int i2);

    public final void b(int i, long j) {
        a(i, i(j));
    }

    public abstract void b(int i, AbstractC0071i iVar);

    public final void b(long j) {
        a(i(j));
    }

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public final void d(int i, int i2) {
        c(i, m(i2));
    }

    public abstract void e(int i, int i2);

    public abstract void j(int i);

    public abstract void k(int i);

    public final void l(int i) {
        k(m(i));
    }
}
