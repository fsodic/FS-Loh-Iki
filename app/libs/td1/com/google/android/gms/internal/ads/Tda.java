package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class Tda implements ListIterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private ListIterator<String> f3189a = this.f3191c.f3256a.listIterator(this.f3190b);

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3190b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Uda f3191c;

    Tda(Uda uda, int i) {
        this.f3191c = uda;
        this.f3190b = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f3189a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f3189a.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.f3189a.next();
    }

    public final int nextIndex() {
        return this.f3189a.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f3189a.previous();
    }

    public final int previousIndex() {
        return this.f3189a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
