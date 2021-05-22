package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class Gea implements Iterator<E> {

    /* renamed from: a  reason: collision with root package name */
    private int f2054a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hea f2055b;

    Gea(Hea hea) {
        this.f2055b = hea;
    }

    public final boolean hasNext() {
        return this.f2054a < this.f2055b.f2154b.size() || this.f2055b.f2155c.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        while (this.f2054a >= this.f2055b.f2154b.size()) {
            Hea hea = this.f2055b;
            hea.f2154b.add(hea.f2155c.next());
        }
        List<E> list = this.f2055b.f2154b;
        int i = this.f2054a;
        this.f2054a = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
