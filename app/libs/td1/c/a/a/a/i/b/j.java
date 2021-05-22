package c.a.a.a.i.b;

import c.a.a.a.AbstractC0122f;
import c.a.a.a.e.g;
import c.a.a.a.k.d;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.t;

public class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final j f768a = new j();

    @Override // c.a.a.a.e.g
    public long a(t tVar, e eVar) {
        a.a(tVar, "HTTP response");
        d dVar = new d(tVar.headerIterator("Keep-Alive"));
        while (dVar.hasNext()) {
            AbstractC0122f nextElement = dVar.nextElement();
            String name = nextElement.getName();
            String value = nextElement.getValue();
            if (value != null && name.equalsIgnoreCase("timeout")) {
                try {
                    return Long.parseLong(value) * 1000;
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        return -1;
    }
}
