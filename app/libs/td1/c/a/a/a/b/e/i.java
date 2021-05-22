package c.a.a.a.b.e;

import c.a.a.a.h.b;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.r;

@Deprecated
public class i extends e {
    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        a.a(rVar, "HTTP request");
        a.a(eVar, "HTTP context");
        if (!rVar.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") && !rVar.containsHeader("Authorization")) {
            c.a.a.a.a.i iVar = (c.a.a.a.a.i) eVar.getAttribute("http.auth.target-scope");
            if (iVar == null) {
                this.f630a.a("Target auth state not set in the context");
                return;
            }
            if (this.f630a.a()) {
                b bVar = this.f630a;
                bVar.a("Target auth state: " + iVar.d());
            }
            a(iVar, rVar, eVar);
        }
    }
}
