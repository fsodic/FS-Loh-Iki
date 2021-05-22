package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class Hca<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f2150a;

    public Hca(Iterator<Map.Entry<K, Object>> it) {
        this.f2150a = it;
    }

    public final boolean hasNext() {
        return this.f2150a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f2150a.next();
        return next.getValue() instanceof Gca ? new Ica(next) : next;
    }

    public final void remove() {
        this.f2150a.remove();
    }
}
