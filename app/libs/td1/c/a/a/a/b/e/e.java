package c.a.a.a.b.e;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.a.a;
import c.a.a.a.a.c;
import c.a.a.a.a.i;
import c.a.a.a.a.j;
import c.a.a.a.a.m;
import c.a.a.a.a.n;
import c.a.a.a.h.b;
import c.a.a.a.r;
import c.a.a.a.s;
import java.util.Queue;

@Deprecated
abstract class e implements s {

    /* renamed from: a  reason: collision with root package name */
    final b f630a = new b(getClass());

    private AbstractC0121e a(c cVar, n nVar, r rVar, c.a.a.a.n.e eVar) {
        c.a.a.a.p.b.a(cVar, "Auth scheme");
        return cVar instanceof m ? ((m) cVar).a(nVar, rVar, eVar) : cVar.a(nVar, rVar);
    }

    private void a(c cVar) {
        c.a.a.a.p.b.a(cVar, "Auth scheme");
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar, r rVar, c.a.a.a.n.e eVar) {
        c b2 = iVar.b();
        n c2 = iVar.c();
        int i = d.f629a[iVar.d().ordinal()];
        if (i != 1) {
            if (i == 2) {
                a(b2);
                if (b2.isConnectionBased()) {
                    return;
                }
            } else if (i == 3) {
                Queue<a> a2 = iVar.a();
                if (a2 != null) {
                    while (!a2.isEmpty()) {
                        a remove = a2.remove();
                        c a3 = remove.a();
                        n b3 = remove.b();
                        iVar.a(a3, b3);
                        if (this.f630a.a()) {
                            b bVar = this.f630a;
                            bVar.a("Generating response to an authentication challenge using " + a3.getSchemeName() + " scheme");
                        }
                        try {
                            rVar.a(a(a3, b3, rVar, eVar));
                            return;
                        } catch (j e) {
                            if (this.f630a.d()) {
                                b bVar2 = this.f630a;
                                bVar2.d(a3 + " authentication error: " + e.getMessage());
                            }
                        }
                    }
                    return;
                }
                a(b2);
            }
            if (b2 != null) {
                try {
                    rVar.a(a(b2, c2, rVar, eVar));
                } catch (j e2) {
                    if (this.f630a.b()) {
                        b bVar3 = this.f630a;
                        bVar3.b(b2 + " authentication error: " + e2.getMessage());
                    }
                }
            }
        }
    }
}
