package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class Dda implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f1789a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f1790b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bda f1791c;

    private Dda(Bda bda) {
        this.f1791c = bda;
        this.f1789a = this.f1791c.f1626b.size();
    }

    /* synthetic */ Dda(Bda bda, Ada ada) {
        this(bda);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f1790b == null) {
            this.f1790b = this.f1791c.f.entrySet().iterator();
        }
        return this.f1790b;
    }

    public final boolean hasNext() {
        int i = this.f1789a;
        return (i > 0 && i <= this.f1791c.f1626b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List list = this.f1791c.f1626b;
            int i = this.f1789a - 1;
            this.f1789a = i;
            obj = list.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
