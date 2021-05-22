package a.a.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    c<K, V> f8a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f9b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f10c = new WeakHashMap<>();
    private int d = 0;

    /* access modifiers changed from: package-private */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f13c;
        }
    }

    /* renamed from: a.a.a.b.b$b  reason: collision with other inner class name */
    private static class C0000b<K, V> extends e<K, V> {
        C0000b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f13c;
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f11a;

        /* renamed from: b  reason: collision with root package name */
        final V f12b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f13c;
        c<K, V> d;

        c(K k, V v) {
            this.f11a = k;
            this.f12b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11a.equals(cVar.f11a) && this.f12b.equals(cVar.f12b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f11a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12b;
        }

        public int hashCode() {
            return this.f11a.hashCode() ^ this.f12b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f11a) + "=" + ((Object) this.f12b);
        }
    }

    /* access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private c<K, V> f14a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f15b = true;

        d() {
        }

        @Override // a.a.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f14a;
            if (cVar == cVar2) {
                this.f14a = cVar2.d;
                this.f15b = this.f14a == null;
            }
        }

        public boolean hasNext() {
            if (this.f15b) {
                return b.this.f8a != null;
            }
            c<K, V> cVar = this.f14a;
            return (cVar == null || cVar.f13c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f15b) {
                this.f15b = false;
                cVar = b.this.f8a;
            } else {
                c<K, V> cVar2 = this.f14a;
                cVar = cVar2 != null ? cVar2.f13c : null;
            }
            this.f14a = cVar;
            return this.f14a;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f17a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f18b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f17a = cVar2;
            this.f18b = cVar;
        }

        private c<K, V> a() {
            c<K, V> cVar = this.f18b;
            c<K, V> cVar2 = this.f17a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // a.a.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f17a == cVar && cVar == this.f18b) {
                this.f18b = null;
                this.f17a = null;
            }
            c<K, V> cVar2 = this.f17a;
            if (cVar2 == cVar) {
                this.f17a = b(cVar2);
            }
            if (this.f18b == cVar) {
                this.f18b = a();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f18b != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f18b;
            this.f18b = a();
            return cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k) {
        c<K, V> cVar = this.f8a;
        while (cVar != null && !cVar.f11a.equals(k)) {
            cVar = cVar.f13c;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.d++;
        c<K, V> cVar2 = this.f9b;
        if (cVar2 == null) {
            this.f8a = cVar;
            this.f9b = this.f8a;
            return cVar;
        }
        cVar2.f13c = cVar;
        cVar.d = cVar2;
        this.f9b = cVar;
        return cVar;
    }

    public Map.Entry<K, V> a() {
        return this.f8a;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f10c.put(dVar, false);
        return dVar;
    }

    public V b(K k, V v) {
        c<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f12b;
        }
        a(k, v);
        return null;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0000b bVar = new C0000b(this.f9b, this.f8a);
        this.f10c.put(bVar, false);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f8a, this.f9b);
        this.f10c.put(aVar, false);
        return aVar;
    }

    public Map.Entry<K, V> k() {
        return this.f9b;
    }

    public V remove(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.d--;
        if (!this.f10c.isEmpty()) {
            for (f<K, V> fVar : this.f10c.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.d;
        if (cVar != null) {
            cVar.f13c = a2.f13c;
        } else {
            this.f8a = a2.f13c;
        }
        c<K, V> cVar2 = a2.f13c;
        if (cVar2 != null) {
            cVar2.d = a2.d;
        } else {
            this.f9b = a2.d;
        }
        a2.f13c = null;
        a2.d = null;
        return a2.f12b;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
