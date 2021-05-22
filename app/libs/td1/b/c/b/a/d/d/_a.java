package b.c.b.a.d.d;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class _a extends AbstractList<String> implements AbstractC0058ba, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0058ba f404a;

    public _a(AbstractC0058ba baVar) {
        this.f404a = baVar;
    }

    @Override // b.c.b.a.d.d.AbstractC0058ba
    public final Object f(int i) {
        return this.f404a.f(i);
    }

    @Override // b.c.b.a.d.d.AbstractC0058ba
    public final List<?> g() {
        return this.f404a.g();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.f404a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new bb(this);
    }

    @Override // b.c.b.a.d.d.AbstractC0058ba
    public final AbstractC0058ba j() {
        return this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new ab(this, i);
    }

    public final int size() {
        return this.f404a.size();
    }
}
