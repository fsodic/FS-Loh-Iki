package c.a.a.a.b.e;

import c.a.a.a.a.h;
import c.a.a.a.a.i;
import c.a.a.a.a.n;
import c.a.a.a.h.b;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.s;

public class c implements s {

    /* renamed from: a  reason: collision with root package name */
    public b f628a = new b(c.class);

    private void a(o oVar, c.a.a.a.a.c cVar, i iVar, c.a.a.a.b.i iVar2) {
        String schemeName = cVar.getSchemeName();
        if (this.f628a.a()) {
            b bVar = this.f628a;
            bVar.a("Re-using cached '" + schemeName + "' auth scheme for " + oVar);
        }
        n a2 = iVar2.a(new h(oVar, h.f599b, schemeName));
        if (a2 != null) {
            iVar.a("BASIC".equalsIgnoreCase(cVar.getSchemeName()) ? c.a.a.a.a.b.CHALLENGED : c.a.a.a.a.b.SUCCESS);
            iVar.a(cVar, a2);
            return;
        }
        this.f628a.a("No credentials for preemptive authentication");
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        c.a.a.a.a.c b2;
        c.a.a.a.a.c b3;
        b bVar;
        String str;
        a.a(rVar, "HTTP request");
        a.a(eVar, "HTTP context");
        a a2 = a.a(eVar);
        c.a.a.a.b.a e = a2.e();
        if (e == null) {
            bVar = this.f628a;
            str = "Auth cache not set in the context";
        } else {
            c.a.a.a.b.i k = a2.k();
            if (k == null) {
                bVar = this.f628a;
                str = "Credentials provider not set in the context";
            } else {
                c.a.a.a.e.b.e l = a2.l();
                if (l == null) {
                    bVar = this.f628a;
                    str = "Route info not set in the context";
                } else {
                    o c2 = a2.c();
                    if (c2 == null) {
                        bVar = this.f628a;
                        str = "Target host not set in the context";
                    } else {
                        if (c2.e() < 0) {
                            c2 = new o(c2.d(), l.getTargetHost().e(), c2.f());
                        }
                        i o = a2.o();
                        if (!(o == null || o.d() != c.a.a.a.a.b.UNCHALLENGED || (b3 = e.b(c2)) == null)) {
                            a(c2, b3, o, k);
                        }
                        o proxyHost = l.getProxyHost();
                        i m = a2.m();
                        if (proxyHost != null && m != null && m.d() == c.a.a.a.a.b.UNCHALLENGED && (b2 = e.b(proxyHost)) != null) {
                            a(proxyHost, b2, m, k);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        bVar.a(str);
    }
}
