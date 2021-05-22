package b.c.b.a.d.d;

import java.util.Iterator;

final class bb implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f411a = _a.a(this.f412b).iterator();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ _a f412b;

    bb(_a _aVar) {
        this.f412b = _aVar;
    }

    public final boolean hasNext() {
        return this.f411a.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f411a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
