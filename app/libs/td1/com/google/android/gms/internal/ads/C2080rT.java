package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.rT  reason: case insensitive filesystem */
public final class C2080rT {

    /* renamed from: a  reason: collision with root package name */
    private final E f5412a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC1805nT f5413b;

    private C2080rT(AbstractC1805nT nTVar, E e) {
        this.f5413b = nTVar;
        this.f5412a = e;
    }

    private final <O> C2218tT<O> a(Callable<O> callable, VW vw) {
        return new C2218tT<>(this.f5413b, this.f5412a, AbstractC1805nT.f5044a, Collections.emptyList(), vw.a(callable));
    }

    public final <O> C2218tT<O> a(SW<O> sw) {
        return new C2218tT<>(this.f5413b, this.f5412a, AbstractC1805nT.f5044a, Collections.emptyList(), sw);
    }

    public final C2218tT<?> a(AbstractC1667lT lTVar, VW vw) {
        return a(new CallableC2012qT(lTVar), vw);
    }

    public final <O> C2218tT<O> a(Callable<O> callable) {
        return a(callable, this.f5413b.f5045b);
    }
}
