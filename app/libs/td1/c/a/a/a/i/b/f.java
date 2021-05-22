package c.a.a.a.i.b;

import c.a.a.a.a.h;
import c.a.a.a.a.n;
import c.a.a.a.b.i;
import c.a.a.a.p.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<h, n> f761a = new ConcurrentHashMap<>();

    private static n a(Map<h, n> map, h hVar) {
        n nVar = map.get(hVar);
        if (nVar != null) {
            return nVar;
        }
        int i = -1;
        h hVar2 = null;
        for (h hVar3 : map.keySet()) {
            int a2 = hVar.a(hVar3);
            if (a2 > i) {
                hVar2 = hVar3;
                i = a2;
            }
        }
        return hVar2 != null ? map.get(hVar2) : nVar;
    }

    @Override // c.a.a.a.b.i
    public n a(h hVar) {
        a.a(hVar, "Authentication scope");
        return a(this.f761a, hVar);
    }

    public String toString() {
        return this.f761a.toString();
    }
}
