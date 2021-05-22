package c.a.a.a.n;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e f957a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f958b;

    public a() {
        this(null);
    }

    public a(e eVar) {
        this.f958b = new ConcurrentHashMap();
        this.f957a = eVar;
    }

    @Override // c.a.a.a.n.e
    public Object getAttribute(String str) {
        e eVar;
        c.a.a.a.p.a.a((Object) str, "Id");
        Object obj = this.f958b.get(str);
        return (obj != null || (eVar = this.f957a) == null) ? obj : eVar.getAttribute(str);
    }

    @Override // c.a.a.a.n.e
    public void setAttribute(String str, Object obj) {
        c.a.a.a.p.a.a((Object) str, "Id");
        if (obj != null) {
            this.f958b.put(str, obj);
        } else {
            this.f958b.remove(str);
        }
    }

    public String toString() {
        return this.f958b.toString();
    }
}
