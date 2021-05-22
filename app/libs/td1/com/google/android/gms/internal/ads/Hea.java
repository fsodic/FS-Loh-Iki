package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Hea<E> extends AbstractList<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final Jea f2153a = Jea.a(Hea.class);

    /* renamed from: b  reason: collision with root package name */
    List<E> f2154b;

    /* renamed from: c  reason: collision with root package name */
    Iterator<E> f2155c;

    public Hea(List<E> list, Iterator<E> it) {
        this.f2154b = list;
        this.f2155c = it;
    }

    @Override // java.util.List, java.util.AbstractList
    public E get(int i) {
        if (this.f2154b.size() > i) {
            return this.f2154b.get(i);
        }
        if (this.f2155c.hasNext()) {
            this.f2154b.add(this.f2155c.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public Iterator<E> iterator() {
        return new Gea(this);
    }

    public int size() {
        f2153a.a("potentially expensive size() call");
        f2153a.a("blowup running");
        while (this.f2155c.hasNext()) {
            this.f2154b.add(this.f2155c.next());
        }
        return this.f2154b.size();
    }
}
