package c.a.a.a.i.e;

import c.a.a.a.g.d;
import c.a.a.a.i.f.f;
import c.a.a.a.i.f.h;
import c.a.a.a.i.f.m;
import c.a.a.a.j.g;
import c.a.a.a.l;
import c.a.a.a.p.a;
import c.a.a.a.q;
import java.io.OutputStream;

@Deprecated
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final d f870a;

    public b(d dVar) {
        a.a(dVar, "Content length strategy");
        this.f870a = dVar;
    }

    /* access modifiers changed from: protected */
    public OutputStream a(g gVar, q qVar) {
        long a2 = this.f870a.a(qVar);
        return a2 == -2 ? new f(gVar) : a2 == -1 ? new m(gVar) : new h(gVar, a2);
    }

    public void a(g gVar, q qVar, l lVar) {
        a.a(gVar, "Session output buffer");
        a.a(qVar, "HTTP message");
        a.a(lVar, "HTTP entity");
        OutputStream a2 = a(gVar, qVar);
        lVar.writeTo(a2);
        a2.close();
    }
}
