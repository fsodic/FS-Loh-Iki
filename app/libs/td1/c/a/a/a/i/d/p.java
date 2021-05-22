package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.n;
import c.a.a.a.p.a;

public class p extends AbstractC0126a implements b {
    @Override // c.a.a.a.f.b
    public String a() {
        return "version";
    }

    @Override // c.a.a.a.f.d
    public void a(c.a.a.a.f.p pVar, String str) {
        a.a(pVar, "Cookie");
        if (str != null) {
            int i = 0;
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
            pVar.setVersion(i);
            return;
        }
        throw new n("Missing value for version attribute");
    }
}
