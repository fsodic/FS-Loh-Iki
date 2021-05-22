package com.google.android.gms.internal.ads;

import java.util.Iterator;

public abstract class BV<E> {
    BV() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.BV<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public BV<E> a(Iterable<? extends E> iterable) {
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public abstract BV<E> a(E e);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.BV<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public BV<E> a(Iterator<? extends E> it) {
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
