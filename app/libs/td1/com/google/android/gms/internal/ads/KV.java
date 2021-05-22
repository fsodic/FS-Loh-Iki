package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class KV extends WV<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2403a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Object f2404b;

    KV(Object obj) {
        this.f2404b = obj;
    }

    public final boolean hasNext() {
        return !this.f2403a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f2403a) {
            this.f2403a = true;
            return (T) this.f2404b;
        }
        throw new NoSuchElementException();
    }
}
