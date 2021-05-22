package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vV  reason: case insensitive filesystem */
public abstract class AbstractC2358vV<E> extends VV<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f5811a;

    /* renamed from: b  reason: collision with root package name */
    private int f5812b;

    protected AbstractC2358vV(int i, int i2) {
        C1945pV.b(i2, i);
        this.f5811a = i;
        this.f5812b = i2;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i);

    public final boolean hasNext() {
        return this.f5812b < this.f5811a;
    }

    public final boolean hasPrevious() {
        return this.f5812b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f5812b;
            this.f5812b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f5812b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f5812b - 1;
            this.f5812b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f5812b - 1;
    }
}
