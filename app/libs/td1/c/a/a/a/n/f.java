package c.a.a.a.n;

import c.a.a.a.j;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.r;

public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e f965a;

    public f() {
        this.f965a = new a();
    }

    public f(e eVar) {
        this.f965a = eVar;
    }

    public static f a(e eVar) {
        a.a(eVar, "HTTP context");
        return eVar instanceof f ? (f) eVar : new f(eVar);
    }

    public j a() {
        return (j) a("http.connection", j.class);
    }

    public <T> T a(String str, Class<T> cls) {
        a.a(cls, "Attribute class");
        Object attribute = getAttribute(str);
        if (attribute == null) {
            return null;
        }
        return cls.cast(attribute);
    }

    public r b() {
        return (r) a("http.request", r.class);
    }

    public o c() {
        return (o) a("http.target_host", o.class);
    }

    public boolean d() {
        Boolean bool = (Boolean) a("http.request_sent", Boolean.class);
        return bool != null && bool.booleanValue();
    }

    @Override // c.a.a.a.n.e
    public Object getAttribute(String str) {
        return this.f965a.getAttribute(str);
    }

    @Override // c.a.a.a.n.e
    public void setAttribute(String str, Object obj) {
        this.f965a.setAttribute(str, obj);
    }
}
