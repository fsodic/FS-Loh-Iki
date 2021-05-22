package b.c.b.a.d.d;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class Ka implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f364a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f365b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Ia f366c;

    private Ka(Ia ia) {
        this.f366c = ia;
        this.f364a = this.f366c.f357b.size();
    }

    /* synthetic */ Ka(Ia ia, Ja ja) {
        this(ia);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f365b == null) {
            this.f365b = this.f366c.f.entrySet().iterator();
        }
        return this.f365b;
    }

    public final boolean hasNext() {
        int i = this.f364a;
        return (i > 0 && i <= this.f366c.f357b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List list = this.f366c.f357b;
            int i = this.f364a - 1;
            this.f364a = i;
            obj = list.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
