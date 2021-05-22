package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.h;
import c.a.a.a.f.n;
import c.a.a.a.f.p;
import c.a.a.a.p.a;

public class B extends AbstractC0126a implements b {
    @Override // c.a.a.a.f.b
    public String a() {
        return "version";
    }

    @Override // c.a.a.a.f.d, c.a.a.a.i.d.AbstractC0126a
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        if (cVar.getVersion() < 0) {
            throw new h("Cookie version may not be negative");
        }
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        a.a(pVar, "Cookie");
        if (str == null) {
            throw new n("Missing value for version attribute");
        } else if (!str.trim().isEmpty()) {
            try {
                pVar.setVersion(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                throw new n("Invalid version: " + e.getMessage());
            }
        } else {
            throw new n("Blank value for version attribute");
        }
    }
}
