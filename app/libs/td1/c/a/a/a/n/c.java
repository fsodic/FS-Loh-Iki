package c.a.a.a.n;

import c.a.a.a.p.a;

@Deprecated
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e f961a;

    /* renamed from: b  reason: collision with root package name */
    private final e f962b;

    public c(e eVar, e eVar2) {
        a.a(eVar, "HTTP context");
        this.f961a = eVar;
        this.f962b = eVar2;
    }

    @Override // c.a.a.a.n.e
    public Object getAttribute(String str) {
        Object attribute = this.f961a.getAttribute(str);
        return attribute == null ? this.f962b.getAttribute(str) : attribute;
    }

    @Override // c.a.a.a.n.e
    public void setAttribute(String str, Object obj) {
        this.f961a.setAttribute(str, obj);
    }

    public String toString() {
        return "[local: " + this.f961a + "defaults: " + this.f962b + "]";
    }
}
