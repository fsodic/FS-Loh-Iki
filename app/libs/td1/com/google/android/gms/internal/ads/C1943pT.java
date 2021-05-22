package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.pT  reason: case insensitive filesystem */
public final class C1943pT {

    /* renamed from: a  reason: collision with root package name */
    private final E f5233a;

    /* renamed from: b  reason: collision with root package name */
    private final List<SW<?>> f5234b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AbstractC1805nT f5235c;

    private C1943pT(AbstractC1805nT nTVar, E e, List<SW<?>> list) {
        this.f5235c = nTVar;
        this.f5233a = e;
        this.f5234b = list;
    }

    public final <O> C2218tT<O> a(Callable<O> callable) {
        KW c2 = JW.c(this.f5234b);
        SW a2 = c2.a(CallableC1874oT.f5129a, C0875_l.f);
        AbstractC1805nT nTVar = this.f5235c;
        return new C2218tT<>(nTVar, this.f5233a, a2, this.f5234b, c2.a(callable, nTVar.f5045b));
    }
}
