package b.c.b.a.d.d;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class Y<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f397a;

    public Y(Iterator<Map.Entry<K, Object>> it) {
        this.f397a = it;
    }

    public final boolean hasNext() {
        return this.f397a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f397a.next();
        return next.getValue() instanceof V ? new X(next) : next;
    }

    public final void remove() {
        this.f397a.remove();
    }
}
