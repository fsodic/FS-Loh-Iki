package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.o;
import c.a.a.a.f.p;

public class D implements b {
    @Override // c.a.a.a.f.b
    public String a() {
        return "discard";
    }

    @Override // c.a.a.a.f.d
    public void a(c cVar, f fVar) {
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        if (pVar instanceof o) {
            ((o) pVar).setDiscard(true);
        }
    }

    @Override // c.a.a.a.f.d
    public boolean b(c cVar, f fVar) {
        return true;
    }
}
