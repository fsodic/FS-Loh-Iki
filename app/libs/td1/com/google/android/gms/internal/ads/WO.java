package com.google.android.gms.internal.ads;

import java.util.List;

public final class WO implements AbstractC1180eO<XO> {

    /* renamed from: a  reason: collision with root package name */
    AbstractC1509j f3411a;

    /* renamed from: b  reason: collision with root package name */
    private VW f3412b;

    /* renamed from: c  reason: collision with root package name */
    List<String> f3413c;

    public WO(AbstractC1509j jVar, VW vw, List<String> list) {
        this.f3411a = jVar;
        this.f3412b = vw;
        this.f3413c = list;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<XO> a() {
        return this.f3412b.a(new ZO(this));
    }
}
