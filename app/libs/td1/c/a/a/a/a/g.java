package c.a.a.a.a;

import c.a.a.a.d.a;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class g implements a<e> {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, d> f597a = new ConcurrentHashMap<>();

    public c a(String str, c.a.a.a.l.g gVar) {
        c.a.a.a.p.a.a((Object) str, "Name");
        d dVar = this.f597a.get(str.toLowerCase(Locale.ENGLISH));
        if (dVar != null) {
            return dVar.a(gVar);
        }
        throw new IllegalStateException("Unsupported authentication scheme: " + str);
    }

    public void a(String str, d dVar) {
        c.a.a.a.p.a.a((Object) str, "Name");
        c.a.a.a.p.a.a(dVar, "Authentication scheme factory");
        this.f597a.put(str.toLowerCase(Locale.ENGLISH), dVar);
    }

    @Override // c.a.a.a.d.a
    public e lookup(String str) {
        return new f(this, str);
    }
}
