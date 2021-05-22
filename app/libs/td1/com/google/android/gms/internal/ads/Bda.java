package com.google.android.gms.internal.ads;

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
public class Bda<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f1625a;

    /* renamed from: b  reason: collision with root package name */
    private List<Gda> f1626b;

    /* renamed from: c  reason: collision with root package name */
    private Map<K, V> f1627c;
    private boolean d;
    private volatile Ida e;
    private Map<K, V> f;
    private volatile Cda g;

    private Bda(int i) {
        this.f1625a = i;
        this.f1626b = Collections.emptyList();
        this.f1627c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    /* synthetic */ Bda(int i, Ada ada) {
        this(i);
    }

    private final int a(K k) {
        int size = this.f1626b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f1626b.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f1626b.get(i2).getKey());
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

    static <FieldDescriptorType extends AbstractC1679lca<FieldDescriptorType>> Bda<FieldDescriptorType, Object> a(int i) {
        return new Ada(i);
    }

    /* access modifiers changed from: private */
    public final V c(int i) {
        f();
        V v = (V) this.f1626b.remove(i).getValue();
        if (!this.f1627c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            this.f1626b.add(new Gda(this, it.next()));
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
        if (this.f1627c.isEmpty() && !(this.f1627c instanceof TreeMap)) {
            this.f1627c = new TreeMap();
            this.f = ((TreeMap) this.f1627c).descendingMap();
        }
        return (SortedMap) this.f1627c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        f();
        int a2 = a(k);
        if (a2 >= 0) {
            return (V) this.f1626b.get(a2).setValue(v);
        }
        f();
        if (this.f1626b.isEmpty() && !(this.f1626b instanceof ArrayList)) {
            this.f1626b = new ArrayList(this.f1625a);
        }
        int i = -(a2 + 1);
        if (i >= this.f1625a) {
            return g().put(k, v);
        }
        int size = this.f1626b.size();
        int i2 = this.f1625a;
        if (size == i2) {
            Gda remove = this.f1626b.remove(i2 - 1);
            g().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.f1626b.add(i, new Gda(this, k, v));
        return null;
    }

    public final boolean a() {
        return this.d;
    }

    public final Map.Entry<K, V> b(int i) {
        return this.f1626b.get(i);
    }

    public void b() {
        if (!this.d) {
            this.f1627c = this.f1627c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1627c);
            this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.d = true;
        }
    }

    public final int c() {
        return this.f1626b.size();
    }

    public void clear() {
        f();
        if (!this.f1626b.isEmpty()) {
            this.f1626b.clear();
        }
        if (!this.f1627c.isEmpty()) {
            this.f1627c.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.Bda<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1627c.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f1627c.isEmpty() ? Fda.a() : this.f1627c.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> e() {
        if (this.g == null) {
            this.g = new Cda(this, null);
        }
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new Ida(this, null);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bda)) {
            return super.equals(obj);
        }
        Bda bda = (Bda) obj;
        int size = size();
        if (size != bda.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != bda.c()) {
            return entrySet().equals(bda.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!b(i).equals(bda.b(i))) {
                return false;
            }
        }
        if (c2 != size) {
            return this.f1627c.equals(bda.f1627c);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.Bda<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? (V) this.f1626b.get(a2).getValue() : this.f1627c.get(comparable);
    }

    public int hashCode() {
        int c2 = c();
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            i += this.f1626b.get(i2).hashCode();
        }
        return this.f1627c.size() > 0 ? i + this.f1627c.hashCode() : i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.Bda<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return (V) c(a2);
        }
        if (this.f1627c.isEmpty()) {
            return null;
        }
        return this.f1627c.remove(comparable);
    }

    public int size() {
        return this.f1626b.size() + this.f1627c.size();
    }
}
