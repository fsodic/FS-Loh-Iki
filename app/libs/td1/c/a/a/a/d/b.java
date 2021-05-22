package c.a.a.a.d;

public class b implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static final b f648a = new a().a();

    /* renamed from: b  reason: collision with root package name */
    private final int f649b;

    /* renamed from: c  reason: collision with root package name */
    private final int f650c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f651a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f652b = -1;

        a() {
        }

        public a a(int i) {
            this.f652b = i;
            return this;
        }

        public b a() {
            return new b(this.f651a, this.f652b);
        }

        public a b(int i) {
            this.f651a = i;
            return this;
        }
    }

    b(int i, int i2) {
        this.f649b = i;
        this.f650c = i2;
    }

    public static a c() {
        return new a();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public b clone() {
        return (b) super.clone();
    }

    public int d() {
        return this.f650c;
    }

    public int e() {
        return this.f649b;
    }

    public String toString() {
        return "[maxLineLength=" + this.f649b + ", maxHeaderCount=" + this.f650c + "]";
    }
}
