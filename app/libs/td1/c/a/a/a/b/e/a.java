package c.a.a.a.b.e;

import c.a.a.a.b.h;
import c.a.a.a.e.b.b;
import c.a.a.a.f.i;
import c.a.a.a.f.k;
import c.a.a.a.n.e;
import c.a.a.a.n.f;

public class a extends f {
    public a() {
    }

    public a(e eVar) {
        super(eVar);
    }

    public static a a(e eVar) {
        return eVar instanceof a ? (a) eVar : new a(eVar);
    }

    private <T> c.a.a.a.d.a<T> b(String str, Class<T> cls) {
        return (c.a.a.a.d.a) a(str, c.a.a.a.d.a.class);
    }

    public void a(c.a.a.a.b.a aVar) {
        setAttribute("http.auth.auth-cache", aVar);
    }

    public c.a.a.a.b.a e() {
        return (c.a.a.a.b.a) a("http.auth.auth-cache", c.a.a.a.b.a.class);
    }

    public c.a.a.a.d.a<c.a.a.a.a.e> f() {
        return b("http.authscheme-registry", c.a.a.a.a.e.class);
    }

    public c.a.a.a.f.f g() {
        return (c.a.a.a.f.f) a("http.cookie-origin", c.a.a.a.f.f.class);
    }

    public i h() {
        return (i) a("http.cookie-spec", i.class);
    }

    public c.a.a.a.d.a<k> i() {
        return b("http.cookiespec-registry", k.class);
    }

    public h j() {
        return (h) a("http.cookie-store", h.class);
    }

    public c.a.a.a.b.i k() {
        return (c.a.a.a.b.i) a("http.auth.credentials-provider", c.a.a.a.b.i.class);
    }

    public c.a.a.a.e.b.e l() {
        return (c.a.a.a.e.b.e) a("http.route", b.class);
    }

    public c.a.a.a.a.i m() {
        return (c.a.a.a.a.i) a("http.auth.proxy-scope", c.a.a.a.a.i.class);
    }

    public c.a.a.a.b.a.a n() {
        c.a.a.a.b.a.a aVar = (c.a.a.a.b.a.a) a("http.request-config", c.a.a.a.b.a.a.class);
        return aVar != null ? aVar : c.a.a.a.b.a.a.f613a;
    }

    public c.a.a.a.a.i o() {
        return (c.a.a.a.a.i) a("http.auth.target-scope", c.a.a.a.a.i.class);
    }
}
