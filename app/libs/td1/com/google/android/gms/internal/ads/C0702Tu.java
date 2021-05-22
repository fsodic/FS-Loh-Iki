package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Tu  reason: case insensitive filesystem */
public final class C0702Tu extends C0834Yw<AbstractC0624Qu> implements AbstractC0624Qu {
    public C0702Tu(C0806Xu xu, Set<C0523Mx<AbstractC0624Qu>> set, Executor executor) {
        super(set);
        a(xu, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0624Qu
    public final void P() {
        a(C0728Uu.f3301a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0624Qu
    public final void a(Sna sna) {
        a(new C0676Su(sna));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0624Qu
    public final void a(C0810Xy xy) {
        a(new C0754Vu(xy));
    }
}
