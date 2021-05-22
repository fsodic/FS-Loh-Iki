package c.a.a.a.b.e;

import c.a.a.a.a.i;
import c.a.a.a.e.n;
import c.a.a.a.h.b;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.r;

@Deprecated
public class h extends e {
    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        b bVar;
        String str;
        a.a(rVar, "HTTP request");
        a.a(eVar, "HTTP context");
        if (!rVar.containsHeader("Proxy-Authorization")) {
            n nVar = (n) eVar.getAttribute("http.connection");
            if (nVar == null) {
                bVar = this.f630a;
                str = "HTTP connection not set in the context";
            } else if (!nVar.getRoute().isTunnelled()) {
                i iVar = (i) eVar.getAttribute("http.auth.proxy-scope");
                if (iVar == null) {
                    bVar = this.f630a;
                    str = "Proxy auth state not set in the context";
                } else {
                    if (this.f630a.a()) {
                        b bVar2 = this.f630a;
                        bVar2.a("Proxy auth state: " + iVar.d());
                    }
                    a(iVar, rVar, eVar);
                    return;
                }
            } else {
                return;
            }
            bVar.a(str);
        }
    }
}
