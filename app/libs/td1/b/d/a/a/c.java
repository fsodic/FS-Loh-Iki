package b.d.a.a;

import c.a.a.a.a.h;
import c.a.a.a.a.i;
import c.a.a.a.a.n;
import c.a.a.a.i.a.b;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.r;
import c.a.a.a.s;

/* access modifiers changed from: package-private */
public class c implements s {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f563a;

    c(d dVar) {
        this.f563a = dVar;
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        n a2;
        i iVar = (i) eVar.getAttribute("http.auth.target-scope");
        c.a.a.a.b.i iVar2 = (c.a.a.a.b.i) eVar.getAttribute("http.auth.credentials-provider");
        o oVar = (o) eVar.getAttribute("http.target_host");
        if (iVar.b() == null && (a2 = iVar2.a(new h(oVar.d(), oVar.e()))) != null) {
            iVar.a(new b());
            iVar.a(a2);
        }
    }
}
