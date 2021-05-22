package b.c.b.a.d.d;

import java.util.Iterator;
import java.util.Map;

final class Qa implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f386a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f387b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f388c;
    private final /* synthetic */ Ia d;

    private Qa(Ia ia) {
        this.d = ia;
        this.f386a = -1;
    }

    /* synthetic */ Qa(Ia ia, Ja ja) {
        this(ia);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f388c == null) {
            this.f388c = this.d.f358c.entrySet().iterator();
        }
        return this.f388c;
    }

    public final boolean hasNext() {
        return this.f386a + 1 < this.d.f357b.size() || (!this.d.f358c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f387b = true;
        int i = this.f386a + 1;
        this.f386a = i;
        return (Map.Entry) (i < this.d.f357b.size() ? this.d.f357b.get(this.f386a) : a().next());
    }

    public final void remove() {
        if (this.f387b) {
            this.f387b = false;
            this.d.f();
            if (this.f386a < this.d.f357b.size()) {
                Ia ia = this.d;
                int i = this.f386a;
                this.f386a = i - 1;
                Object unused = ia.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
