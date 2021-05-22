package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class Wda implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f3435a = this.f3436b.f3256a.iterator();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Uda f3436b;

    Wda(Uda uda) {
        this.f3436b = uda;
    }

    public final boolean hasNext() {
        return this.f3435a.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f3435a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
