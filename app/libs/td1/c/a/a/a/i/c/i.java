package c.a.a.a.i.c;

import c.a.a.a.A;
import c.a.a.a.C;
import c.a.a.a.h.b;
import c.a.a.a.i.f.a;
import c.a.a.a.j.f;
import c.a.a.a.k.v;
import c.a.a.a.k.w;
import c.a.a.a.l.g;
import c.a.a.a.p.d;
import c.a.a.a.t;
import c.a.a.a.u;

public class i extends a<t> {
    public b g = new b(i.class);
    private final u h;
    private final d i;

    @Deprecated
    public i(f fVar, v vVar, u uVar, g gVar) {
        super(fVar, vVar, gVar);
        c.a.a.a.p.a.a(uVar, "Response factory");
        this.h = uVar;
        this.i = new d(128);
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.f.a
    public t a(f fVar) {
        int i2 = 0;
        while (true) {
            this.i.clear();
            int a2 = fVar.a(this.i);
            if (a2 == -1 && i2 == 0) {
                throw new A("The target server failed to respond");
            }
            w wVar = new w(0, this.i.length());
            if (this.d.b(this.i, wVar)) {
                return this.h.a(this.d.a(this.i, wVar), null);
            } else if (a2 != -1 && !a(this.i, i2)) {
                if (this.g.a()) {
                    b bVar = this.g;
                    bVar.a("Garbage in response: " + this.i.toString());
                }
                i2++;
            }
        }
        throw new C("The server failed to respond with a valid HTTP response");
    }

    /* access modifiers changed from: protected */
    public boolean a(d dVar, int i2) {
        return false;
    }
}
