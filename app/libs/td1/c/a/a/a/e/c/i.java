package c.a.a.a.e.c;

import c.a.a.a.o;
import c.a.a.a.p.a;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, e> f678a = new ConcurrentHashMap<>();

    public final e a(e eVar) {
        a.a(eVar, "Scheme");
        return this.f678a.put(eVar.b(), eVar);
    }

    public final e a(o oVar) {
        a.a(oVar, "Host");
        return b(oVar.f());
    }

    public final e a(String str) {
        a.a((Object) str, "Scheme name");
        return this.f678a.get(str);
    }

    public final e b(String str) {
        e a2 = a(str);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Scheme '" + str + "' not registered.");
    }
}
