package com.google.android.gms.internal.ads;

import java.util.ListIterator;

public abstract class VV<E> extends WV<E> implements ListIterator<E> {
    protected VV() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
