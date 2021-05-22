package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class Uda extends AbstractList<String> implements Mca, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final Mca f3256a;

    public Uda(Mca mca) {
        this.f3256a = mca;
    }

    @Override // com.google.android.gms.internal.ads.Mca
    public final void a(Iba iba) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.Mca
    public final Object g(int i) {
        return this.f3256a.g(i);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.f3256a.get(i);
    }

    @Override // com.google.android.gms.internal.ads.Mca
    public final List<?> h() {
        return this.f3256a.h();
    }

    @Override // com.google.android.gms.internal.ads.Mca
    public final Mca i() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new Wda(this);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new Tda(this, i);
    }

    public final int size() {
        return this.f3256a.size();
    }
}
