package a.c;

public class h<E> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f45a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f46b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f47c;
    private Object[] d;
    private int e;

    public h() {
        this(10);
    }

    public h(int i) {
        Object[] objArr;
        this.f46b = false;
        if (i == 0) {
            this.f47c = e.f27a;
            objArr = e.f29c;
        } else {
            int b2 = e.b(i);
            this.f47c = new int[b2];
            objArr = new Object[b2];
        }
        this.d = objArr;
        this.e = 0;
    }

    private void e() {
        int i = this.e;
        int[] iArr = this.f47c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f45a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f46b = false;
        this.e = i2;
    }

    public E a(int i, E e2) {
        int a2 = e.a(this.f47c, this.e, i);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != f45a) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public void a(int i) {
        Object[] objArr;
        Object obj;
        int a2 = e.a(this.f47c, this.e, i);
        if (a2 >= 0 && (objArr = this.d)[a2] != (obj = f45a)) {
            objArr[a2] = obj;
            this.f46b = true;
        }
    }

    public E b(int i) {
        return a(i, null);
    }

    public void b(int i, E e2) {
        int a2 = e.a(this.f47c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = e2;
            return;
        }
        int i2 = a2 ^ -1;
        if (i2 < this.e) {
            Object[] objArr = this.d;
            if (objArr[i2] == f45a) {
                this.f47c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f46b && this.e >= this.f47c.length) {
            e();
            i2 = e.a(this.f47c, this.e, i) ^ -1;
        }
        int i3 = this.e;
        if (i3 >= this.f47c.length) {
            int b2 = e.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.f47c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f47c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f47c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
        }
        this.f47c[i2] = i;
        this.d[i2] = e2;
        this.e++;
    }

    public int c(int i) {
        if (this.f46b) {
            e();
        }
        return this.f47c[i];
    }

    public void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f46b = false;
    }

    @Override // java.lang.Object
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f47c = (int[]) this.f47c.clone();
            hVar.d = (Object[]) this.d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public int d() {
        if (this.f46b) {
            e();
        }
        return this.e;
    }

    public void d(int i) {
        a(i);
    }

    public E e(int i) {
        if (this.f46b) {
            e();
        }
        return (E) this.d[i];
    }

    public String toString() {
        if (d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(c(i));
            sb.append('=');
            E e2 = e(i);
            if (e2 != this) {
                sb.append((Object) e2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
