package com.google.android.gms.internal.ads;

import android.content.Context;

public final class NO implements AbstractC1180eO<KO> {

    /* renamed from: a  reason: collision with root package name */
    AbstractC2112rma f2661a;

    /* renamed from: b  reason: collision with root package name */
    private VW f2662b;

    /* renamed from: c  reason: collision with root package name */
    Context f2663c;

    public NO(AbstractC2112rma rma, VW vw, Context context) {
        this.f2661a = rma;
        this.f2662b = vw;
        this.f2663c = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<KO> a() {
        return this.f2662b.a(new MO(this));
    }
}
