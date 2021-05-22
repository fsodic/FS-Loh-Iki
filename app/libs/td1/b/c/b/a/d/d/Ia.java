package b.c.b.a.d.d;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public class Ia<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f356a;

    /* renamed from: b  reason: collision with root package name */
    private List<Pa> f357b;

    /* renamed from: c  reason: collision with root package name */
    private Map<K, V> f358c;
    private boolean d;
    private volatile Ra e;
    private Map<K, V> f;
    private volatile La g;

    private Ia(int i) {
        this.f356a = i;
        this.f357b = Collections.emptyList();
        this.f358c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    /* synthetic */ Ia(int i, Ja ja) {
        this(i);
    }

    private final int a(K k) {
        int size = this.f357b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f357b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f357b.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    static <FieldDescriptorType extends H<FieldDescriptorType>> Ia<FieldDescriptorType, Object> a(int i) {
        return new Ja(i);
    }

    /* access modifiers changed from: private */
    public final V c(int i) {
        f();
        V v = (V) this.f357b.remove(i).getValue();
        if (!this.f358c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            this.f357b.add(new Pa(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void f() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> g() {
        f();
        if (this.f358c.isEmpty() && !(this.f358c instanceof TreeMap)) {
            this.f358c = new TreeMap();
            this.f = ((TreeMap) this.f358c).descendingMap();
        }
        return (SortedMap) this.f358c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        f();
        int a2 = a(k);
        if (a2 >= 0) {
            return (V) this.f357b.get(a2).setValue(v);
        }
        f();
        if (this.f357b.isEmpty() && !(this.f357b instanceof ArrayList)) {
            this.f357b = new ArrayList(this.f356a);
        }
        int i = -(a2 + 1);
        if (i >= this.f356a) {
            return g().put(k, v);
        }
        int size = this.f357b.size();
        int i2 = this.f356a;
        if (size == i2) {
            Pa remove = this.f357b.remove(i2 - 1);
            g().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.f357b.add(i, new Pa(this, k, v));
        return null;
    }

    public final boolean a() {
        return this.d;
    }

    public final Map.Entry<K, V> b(int i) {
        return this.f357b.get(i);
    }

    public void b() {
        if (!this.d) {
            this.f358c = this.f358c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f358c);
            this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.d = true;
        }
    }

    public final int c() {
        return this.f357b.size();
    }

    public void clear() {
        f();
        if (!this.f357b.isEmpty()) {
            this.f357b.clear();
        }
        if (!this.f358c.isEmpty()) {
            this.f358c.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: b.c.b.a.d.d.Ia<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f358c.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f358c.isEmpty() ? Ma.a() : this.f358c.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> e() {
        if (this.g == null) {
            this.g = new La(this, null);
        }
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new Ra(this, null);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ia)) {
            return super.equals(obj);
        }
        Ia ia = (Ia) obj;
        int size = size();
        if (size != ia.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != ia.c()) {
            return entrySet().equals(ia.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!b(i).equals(ia.b(i))) {
                return false;
            }
        }
        if (c2 != size) {
            return this.f358c.equals(ia.f358c);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: b.c.b.a.d.d.Ia<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? (V) this.f357b.get(a2).getValue() : this.f358c.get(comparable);
    }

    public int hashCode() {
        int c2 = c();
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            i += this.f357b.get(i2).hashCode();
        }
        return this.f358c.size() > 0 ? i + this.f358c.hashCode() : i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: b.c.b.a.d.d.Ia<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return (V) c(a2);
        }
        if (this.f358c.isEmpty()) {
            return null;
        }
        return this.f358c.remove(comparable);
    }

    public int size() {
        return this.f357b.size() + this.f358c.size();
    }
}
