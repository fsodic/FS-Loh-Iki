package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.uda  reason: case insensitive filesystem */
final class C2301uda implements Iterator<Pba> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<C2232tda> f5737a;

    /* renamed from: b  reason: collision with root package name */
    private Pba f5738b;

    private C2301uda(Iba iba) {
        Pba pba;
        if (iba instanceof C2232tda) {
            C2232tda tda = (C2232tda) iba;
            this.f5737a = new ArrayDeque<>(tda.o());
            this.f5737a.push(tda);
            pba = a(tda.g);
        } else {
            this.f5737a = null;
            pba = (Pba) iba;
        }
        this.f5738b = pba;
    }

    /* synthetic */ C2301uda(Iba iba, C2163sda sda) {
        this(iba);
    }

    private final Pba a(Iba iba) {
        while (iba instanceof C2232tda) {
            C2232tda tda = (C2232tda) iba;
            this.f5737a.push(tda);
            iba = tda.g;
        }
        return (Pba) iba;
    }

    public final boolean hasNext() {
        return this.f5738b != null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ Pba next() {
        Pba pba;
        Pba pba2 = this.f5738b;
        if (pba2 != null) {
            while (true) {
                ArrayDeque<C2232tda> arrayDeque = this.f5737a;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    pba = a(this.f5737a.pop().h);
                    if (!pba.isEmpty()) {
                        break;
                    }
                } else {
                    pba = null;
                }
            }
            pba = null;
            this.f5738b = pba;
            return pba2;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
