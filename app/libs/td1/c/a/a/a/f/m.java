package c.a.a.a.f;

import c.a.a.a.d.a;
import c.a.a.a.l.g;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class m implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, j> f710a = new ConcurrentHashMap<>();

    public i a(String str, g gVar) {
        c.a.a.a.p.a.a((Object) str, "Name");
        j jVar = this.f710a.get(str.toLowerCase(Locale.ENGLISH));
        if (jVar != null) {
            return jVar.a(gVar);
        }
        throw new IllegalStateException("Unsupported cookie spec: " + str);
    }

    public void a(String str, j jVar) {
        c.a.a.a.p.a.a((Object) str, "Name");
        c.a.a.a.p.a.a(jVar, "Cookie spec factory");
        this.f710a.put(str.toLowerCase(Locale.ENGLISH), jVar);
    }

    @Override // c.a.a.a.d.a
    public k lookup(String str) {
        return new l(this, str);
    }
}
