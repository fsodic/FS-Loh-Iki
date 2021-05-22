package com.google.android.gms.internal.ads;

import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;

final class LH extends AbstractBinderC0869_f {

    /* renamed from: a  reason: collision with root package name */
    private C1931pH<AbstractC1755mg, ZH> f2469a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ KH f2470b;

    private LH(KH kh, C1931pH<AbstractC1755mg, ZH> pHVar) {
        this.f2470b = kh;
        this.f2469a = pHVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0929ag
    public final void b(String str) {
        ((ZH) this.f2469a.f5212c).b(0, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0929ag
    public final void s(a aVar) {
        this.f2470b.f2386c = (View) b.Q(aVar);
        ((ZH) this.f2469a.f5212c).a();
    }
}
