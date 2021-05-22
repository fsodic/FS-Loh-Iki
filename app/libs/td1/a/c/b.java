package a.c;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class b<K, V> extends g<K, V> implements Map<K, V> {
    f<K, V> h;

    public b() {
    }

    public b(int i) {
        super(i);
    }

    private f<K, V> b() {
        if (this.h == null) {
            this.h = new a(this);
        }
        return this.h;
    }

    public boolean a(Collection<?> collection) {
        return f.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.c.b<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.g + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
