package c.a.a.a.k;

import c.a.a.a.D;
import c.a.a.a.F;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.w;

public class h extends a implements r {

    /* renamed from: c  reason: collision with root package name */
    private final String f923c;
    private final String d;
    private F e;

    public h(F f) {
        a.a(f, "Request line");
        this.e = f;
        this.f923c = f.getMethod();
        this.d = f.getUri();
    }

    public h(String str, String str2, D d2) {
        this(new n(str, str2, d2));
    }

    @Override // c.a.a.a.q
    public D getProtocolVersion() {
        return getRequestLine().getProtocolVersion();
    }

    @Override // c.a.a.a.r
    public F getRequestLine() {
        if (this.e == null) {
            this.e = new n(this.f923c, this.d, w.f);
        }
        return this.e;
    }

    public String toString() {
        return this.f923c + ' ' + this.d + ' ' + this.f905a;
    }
}
