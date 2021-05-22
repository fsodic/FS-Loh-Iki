package com.google.android.gms.internal.ads;

import java.util.Iterator;

public abstract class WV<E> implements Iterator<E> {
    protected WV() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
