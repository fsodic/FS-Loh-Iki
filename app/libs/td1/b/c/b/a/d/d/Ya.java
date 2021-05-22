package b.c.b.a.d.d;

import b.c.b.a.d.d.M;
import java.util.Arrays;

public final class Ya {

    /* renamed from: a  reason: collision with root package name */
    private static final Ya f398a = new Ya(0, new int[0], new Object[0], false);

    /* renamed from: b  reason: collision with root package name */
    private int f399b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f400c;
    private Object[] d;
    private int e;
    private boolean f;

    private Ya() {
        this(0, new int[8], new Object[8], true);
    }

    private Ya(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.f399b = i;
        this.f400c = iArr;
        this.d = objArr;
        this.f = z;
    }

    static Ya a(Ya ya, Ya ya2) {
        int i = ya.f399b + ya2.f399b;
        int[] copyOf = Arrays.copyOf(ya.f400c, i);
        System.arraycopy(ya2.f400c, 0, copyOf, ya.f399b, ya2.f399b);
        Object[] copyOf2 = Arrays.copyOf(ya.d, i);
        System.arraycopy(ya2.d, 0, copyOf2, ya.f399b, ya2.f399b);
        return new Ya(i, copyOf, copyOf2, true);
    }

    private static void a(int i, Object obj, qb qbVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            qbVar.c(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            qbVar.b(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            qbVar.a(i2, (AbstractC0071i) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                qbVar.c(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(S.c());
        } else if (qbVar.a() == M.d.l) {
            qbVar.b(i2);
            ((Ya) obj).b(qbVar);
            qbVar.a(i2);
        } else {
            qbVar.a(i2);
            ((Ya) obj).b(qbVar);
            qbVar.b(i2);
        }
    }

    public static Ya c() {
        return f398a;
    }

    public final void a() {
        this.f = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(qb qbVar) {
        if (qbVar.a() == M.d.m) {
            for (int i = this.f399b - 1; i >= 0; i--) {
                qbVar.a(this.f400c[i] >>> 3, this.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f399b; i2++) {
            qbVar.a(this.f400c[i2] >>> 3, this.d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f399b; i2++) {
            C0095ua.a(sb, i, String.valueOf(this.f400c[i2] >>> 3), this.d[i2]);
        }
    }

    public final int b() {
        int i;
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f399b; i4++) {
            int i5 = this.f400c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = AbstractC0100x.e(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 1) {
                i = AbstractC0100x.g(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 2) {
                i = AbstractC0100x.c(i6, (AbstractC0071i) this.d[i4]);
            } else if (i7 == 3) {
                i = (AbstractC0100x.b(i6) << 1) + ((Ya) this.d[i4]).b();
            } else if (i7 == 5) {
                i = AbstractC0100x.i(i6, ((Integer) this.d[i4]).intValue());
            } else {
                throw new IllegalStateException(S.c());
            }
            i3 += i;
        }
        this.e = i3;
        return i3;
    }

    public final void b(qb qbVar) {
        if (this.f399b != 0) {
            if (qbVar.a() == M.d.l) {
                for (int i = 0; i < this.f399b; i++) {
                    a(this.f400c[i], this.d[i], qbVar);
                }
                return;
            }
            for (int i2 = this.f399b - 1; i2 >= 0; i2--) {
                a(this.f400c[i2], this.d[i2], qbVar);
            }
        }
    }

    public final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f399b; i3++) {
            i2 += AbstractC0100x.d(this.f400c[i3] >>> 3, (AbstractC0071i) this.d[i3]);
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
        if (obj == null || !(obj instanceof Ya)) {
            return false;
        }
        Ya ya = (Ya) obj;
        int i = this.f399b;
        if (i == ya.f399b) {
            int[] iArr = this.f400c;
            int[] iArr2 = ya.f400c;
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
                Object[] objArr2 = ya.d;
                int i3 = this.f399b;
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
        int i = this.f399b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f400c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.f399b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
