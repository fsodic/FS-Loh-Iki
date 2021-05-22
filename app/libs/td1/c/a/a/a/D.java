package c.a.a.a;

import c.a.a.a.p.a;
import java.io.Serializable;

public class D implements Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    protected final String f587a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f588b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f589c;

    public D(String str, int i, int i2) {
        a.a((Object) str, "Protocol name");
        this.f587a = str;
        a.a(i, "Protocol minor version");
        this.f588b = i;
        a.a(i2, "Protocol minor version");
        this.f589c = i2;
    }

    public int a(D d) {
        a.a(d, "Protocol version");
        a.a(this.f587a.equals(d.f587a), "Versions for different protocols cannot be compared: %s %s", this, d);
        int c2 = c() - d.c();
        return c2 == 0 ? d() - d.d() : c2;
    }

    public D a(int i, int i2) {
        return (i == this.f588b && i2 == this.f589c) ? this : new D(this.f587a, i, i2);
    }

    public boolean b(D d) {
        return d != null && this.f587a.equals(d.f587a);
    }

    public final int c() {
        return this.f588b;
    }

    public final boolean c(D d) {
        return b(d) && a(d) <= 0;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public final int d() {
        return this.f589c;
    }

    public final String e() {
        return this.f587a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return this.f587a.equals(d.f587a) && this.f588b == d.f588b && this.f589c == d.f589c;
    }

    public final int hashCode() {
        return (this.f587a.hashCode() ^ (this.f588b * 100000)) ^ this.f589c;
    }

    public String toString() {
        return this.f587a + '/' + Integer.toString(this.f588b) + '.' + Integer.toString(this.f589c);
    }
}
