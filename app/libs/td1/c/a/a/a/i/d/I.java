package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.h;
import c.a.a.a.f.n;
import c.a.a.a.f.o;
import c.a.a.a.f.p;
import c.a.a.a.p.a;

public class I implements b {
    @Override // c.a.a.a.f.b
    public String a() {
        return "version";
    }

    @Override // c.a.a.a.f.d
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        if ((cVar instanceof o) && (cVar instanceof c.a.a.a.f.a) && !((c.a.a.a.f.a) cVar).containsAttribute("version")) {
            throw new h("Violates RFC 2965. Version attribute is required.");
        }
    }

    @Override // c.a.a.a.f.d
    public void a(p pVar, String str) {
        int i;
        a.a(pVar, "Cookie");
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i >= 0) {
                pVar.setVersion(i);
                return;
            }
            throw new n("Invalid cookie version.");
        }
        throw new n("Missing value for version attribute");
    }

    @Override // c.a.a.a.f.d
    public boolean b(c cVar, f fVar) {
        return true;
    }
}
