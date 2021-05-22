package c.a.a.a.i.d;

import c.a.a.a.f.b;
import c.a.a.a.f.d;
import c.a.a.a.f.i;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c.a.a.a.i.d.b  reason: case insensitive filesystem */
public abstract class AbstractC0127b implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, d> f845a;

    public AbstractC0127b() {
        this.f845a = new ConcurrentHashMap(10);
    }

    protected AbstractC0127b(b... bVarArr) {
        this.f845a = new ConcurrentHashMap(bVarArr.length);
        for (b bVar : bVarArr) {
            this.f845a.put(bVar.a(), bVar);
        }
    }

    /* access modifiers changed from: protected */
    public d a(String str) {
        return this.f845a.get(str);
    }

    /* access modifiers changed from: protected */
    public Collection<d> a() {
        return this.f845a.values();
    }
}
