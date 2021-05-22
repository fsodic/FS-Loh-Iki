package b.c.b.a.d.d;

import java.util.ListIterator;

final class ab implements ListIterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private ListIterator<String> f407a = _a.a(this.f409c).listIterator(this.f408b);

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f408b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ _a f409c;

    ab(_a _aVar, int i) {
        this.f409c = _aVar;
        this.f408b = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f407a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f407a.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.f407a.next();
    }

    public final int nextIndex() {
        return this.f407a.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f407a.previous();
    }

    public final int previousIndex() {
        return this.f407a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
