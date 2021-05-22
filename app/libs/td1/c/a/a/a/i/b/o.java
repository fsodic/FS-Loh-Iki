package c.a.a.a.i.b;

import c.a.a.a.b.c.i;
import c.a.a.a.b.c.j;
import c.a.a.a.b.c.l;
import c.a.a.a.b.p;
import c.a.a.a.n.e;
import c.a.a.a.r;
import c.a.a.a.t;
import java.net.URI;

/* access modifiers changed from: package-private */
@Deprecated
public class o implements p {

    /* renamed from: a  reason: collision with root package name */
    private final c.a.a.a.b.o f776a;

    public o(c.a.a.a.b.o oVar) {
        this.f776a = oVar;
    }

    @Override // c.a.a.a.b.p
    public l a(r rVar, t tVar, e eVar) {
        URI a2 = this.f776a.a(tVar, eVar);
        return rVar.getRequestLine().getMethod().equalsIgnoreCase("HEAD") ? new j(a2) : new i(a2);
    }

    public c.a.a.a.b.o a() {
        return this.f776a;
    }

    @Override // c.a.a.a.b.p
    public boolean b(r rVar, t tVar, e eVar) {
        return this.f776a.b(tVar, eVar);
    }
}
