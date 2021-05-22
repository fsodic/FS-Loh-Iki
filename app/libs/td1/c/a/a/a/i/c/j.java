package c.a.a.a.i.c;

import c.a.a.a.e.a.g;
import c.a.a.a.e.b.b;
import c.a.a.a.e.b.d;
import c.a.a.a.e.c.i;
import c.a.a.a.n;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.r;
import java.net.InetAddress;

@Deprecated
public class j implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final i f825a;

    public j(i iVar) {
        a.a(iVar, "Scheme registry");
        this.f825a = iVar;
    }

    @Override // c.a.a.a.e.b.d
    public b a(o oVar, r rVar, e eVar) {
        a.a(rVar, "HTTP request");
        b b2 = g.b(rVar.getParams());
        if (b2 != null) {
            return b2;
        }
        c.a.a.a.p.b.a(oVar, "Target host");
        InetAddress c2 = g.c(rVar.getParams());
        o a2 = g.a(rVar.getParams());
        try {
            boolean d = this.f825a.b(oVar.f()).d();
            return a2 == null ? new b(oVar, c2, d) : new b(oVar, c2, a2, d);
        } catch (IllegalStateException e) {
            throw new n(e.getMessage());
        }
    }
}
