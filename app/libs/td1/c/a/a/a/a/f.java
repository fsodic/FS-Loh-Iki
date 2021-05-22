package c.a.a.a.a;

import c.a.a.a.n.e;
import c.a.a.a.r;

/* access modifiers changed from: package-private */
public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f595a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f596b;

    f(g gVar, String str) {
        this.f596b = gVar;
        this.f595a = str;
    }

    @Override // c.a.a.a.a.e
    public c a(e eVar) {
        return this.f596b.a(this.f595a, ((r) eVar.getAttribute("http.request")).getParams());
    }
}
