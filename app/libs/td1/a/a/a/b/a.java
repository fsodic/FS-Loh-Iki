package a.a.a.b;

import a.a.a.b.b;
import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {
    private HashMap<K, b.c<K, V>> e = new HashMap<>();

    /* access modifiers changed from: protected */
    @Override // a.a.a.b.b
    public b.c<K, V> a(K k) {
        return this.e.get(k);
    }

    @Override // a.a.a.b.b
    public V b(K k, V v) {
        b.c<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f12b;
        }
        this.e.put(k, a(k, v));
        return null;
    }

    public Map.Entry<K, V> b(K k) {
        if (contains(k)) {
            return this.e.get(k).d;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.e.containsKey(k);
    }

    @Override // a.a.a.b.b
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.e.remove(k);
        return v;
    }
}
