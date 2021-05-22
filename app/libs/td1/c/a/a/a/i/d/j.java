package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.p;
import c.a.a.a.p.a;

public class j extends AbstractC0126a implements b {
    @Override // c.a.a.a.f.b
    public String a() {
        return "secure";
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        pVar.setSecure(true);
    }

    @Override // c.a.a.a.f.d, c.a.a.a.i.d.AbstractC0126a
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        return !cVar.isSecure() || fVar.d();
    }
}
