package c.a.a.a.k;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private final int f949a;

    /* renamed from: b  reason: collision with root package name */
    private final int f950b;

    /* renamed from: c  reason: collision with root package name */
    private int f951c;

    public w(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        } else if (i <= i2) {
            this.f949a = i;
            this.f950b = i2;
            this.f951c = i;
        } else {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
    }

    public void a(int i) {
        if (i < this.f949a) {
            throw new IndexOutOfBoundsException("pos: " + i + " < lowerBound: " + this.f949a);
        } else if (i <= this.f950b) {
            this.f951c = i;
        } else {
            throw new IndexOutOfBoundsException("pos: " + i + " > upperBound: " + this.f950b);
        }
    }

    public boolean a() {
        return this.f951c >= this.f950b;
    }

    public int b() {
        return this.f951c;
    }

    public int c() {
        return this.f950b;
    }

    public String toString() {
        return '[' + Integer.toString(this.f949a) + '>' + Integer.toString(this.f951c) + '>' + Integer.toString(this.f950b) + ']';
    }
}
