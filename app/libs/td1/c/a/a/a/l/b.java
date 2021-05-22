package c.a.a.a.l;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public class b extends a implements Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f953a = new ConcurrentHashMap();

    public void a(g gVar) {
        for (Map.Entry<String, Object> entry : this.f953a.entrySet()) {
            gVar.setParameter(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        b bVar = (b) super.clone();
        a(bVar);
        return bVar;
    }

    @Override // c.a.a.a.l.g
    public Object getParameter(String str) {
        return this.f953a.get(str);
    }

    @Override // c.a.a.a.l.g
    public g setParameter(String str, Object obj) {
        if (str == null) {
            return this;
        }
        if (obj != null) {
            this.f953a.put(str, obj);
        } else {
            this.f953a.remove(str);
        }
        return this;
    }
}
