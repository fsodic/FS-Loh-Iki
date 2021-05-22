package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import java.util.Arrays;

public final class Sda {

    /* renamed from: a  reason: collision with root package name */
    private static final Sda f3104a = new Sda(0, new int[0], new Object[0], false);

    /* renamed from: b  reason: collision with root package name */
    private int f3105b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f3106c;
    private Object[] d;
    private int e;
    private boolean f;

    private Sda() {
        this(0, new int[8], new Object[8], true);
    }

    private Sda(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.f3105b = i;
        this.f3106c = iArr;
        this.d = objArr;
        this.f = z;
    }

    static Sda a(Sda sda, Sda sda2) {
        int i = sda.f3105b + sda2.f3105b;
        int[] copyOf = Arrays.copyOf(sda.f3106c, i);
        System.arraycopy(sda2.f3106c, 0, copyOf, sda.f3105b, sda2.f3105b);
        Object[] copyOf2 = Arrays.copyOf(sda.d, i);
        System.arraycopy(sda2.d, 0, copyOf2, sda.f3105b, sda2.f3105b);
        return new Sda(i, copyOf, copyOf2, true);
    }

    private static void a(int i, Object obj, AbstractC1752mea mea) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            mea.d(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            mea.a(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            mea.a(i2, (Iba) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                mea.b(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(Bca.f());
        } else if (mea.a() == AbstractC2092rca.e.l) {
            mea.a(i2);
            ((Sda) obj).b(mea);
            mea.b(i2);
        } else {
            mea.b(i2);
            ((Sda) obj).b(mea);
            mea.a(i2);
        }
    }

    public static Sda c() {
        return f3104a;
    }

    static Sda d() {
        return new Sda();
    }

    public final void a() {
        this.f = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (this.f) {
            int i2 = this.f3105b;
            if (i2 == this.f3106c.length) {
                int i3 = this.f3105b + (i2 < 4 ? 8 : i2 >> 1);
                this.f3106c = Arrays.copyOf(this.f3106c, i3);
                this.d = Arrays.copyOf(this.d, i3);
            }
            int[] iArr = this.f3106c;
            int i4 = this.f3105b;
            iArr[i4] = i;
            this.d[i4] = obj;
            this.f3105b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void a(AbstractC1752mea mea) {
        if (mea.a() == AbstractC2092rca.e.m) {
            for (int i = this.f3105b - 1; i >= 0; i--) {
                mea.a(this.f3106c[i] >>> 3, this.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f3105b; i2++) {
            mea.a(this.f3106c[i2] >>> 3, this.d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f3105b; i2++) {
            C1337gda.a(sb, i, String.valueOf(this.f3106c[i2] >>> 3), this.d[i2]);
        }
    }

    public final int b() {
        int i;
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3105b; i4++) {
            int i5 = this.f3106c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = AbstractC0991bca.e(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 1) {
                i = AbstractC0991bca.g(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 2) {
                i = AbstractC0991bca.c(i6, (Iba) this.d[i4]);
            } else if (i7 == 3) {
                i = (AbstractC0991bca.e(i6) << 1) + ((Sda) this.d[i4]).b();
            } else if (i7 == 5) {
                i = AbstractC0991bca.i(i6, ((Integer) this.d[i4]).intValue());
            } else {
                throw new IllegalStateException(Bca.f());
            }
            i3 += i;
        }
        this.e = i3;
        return i3;
    }

    public final void b(AbstractC1752mea mea) {
        if (this.f3105b != 0) {
            if (mea.a() == AbstractC2092rca.e.l) {
                for (int i = 0; i < this.f3105b; i++) {
                    a(this.f3106c[i], this.d[i], mea);
                }
                return;
            }
            for (int i2 = this.f3105b - 1; i2 >= 0; i2--) {
                a(this.f3106c[i2], this.d[i2], mea);
            }
        }
    }

    public final int e() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3105b; i3++) {
            i2 += AbstractC0991bca.d(this.f3106c[i3] >>> 3, (Iba) this.d[i3]);
        }
        this.e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Sda)) {
            return false;
        }
        Sda sda = (Sda) obj;
        int i = this.f3105b;
        if (i == sda.f3105b) {
            int[] iArr = this.f3106c;
            int[] iArr2 = sda.f3106c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.d;
                Object[] objArr2 = sda.d;
                int i3 = this.f3105b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f3105b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f3106c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.f3105b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
