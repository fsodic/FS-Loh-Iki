package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tQ  reason: case insensitive filesystem */
public final class C2215tQ implements Sea<AbstractC1940pQ<AbstractC0569Or, C0725Ur>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5606a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1873oS> f5607b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<HS> f5608c;

    public C2215tQ(_ea<Context> _ea, _ea<C1873oS> _ea2, _ea<HS> _ea3) {
        this.f5606a = _ea;
        this.f5607b = _ea2;
        this.f5608c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        AbstractC1940pQ pQVar;
        Context context = this.f5606a.get();
        C1873oS oSVar = this.f5607b.get();
        HS hs = this.f5608c.get();
        if (((Integer) C2392voa.e().a(C2474x.Ae)).intValue() > 0) {
            FS a2 = hs.a(EnumC2493xS.AppOpen, context, oSVar, new XP(new SP()));
            pQVar = new TP(new C1595kQ(new C1389hQ()), new C0976bQ(a2.f1960a, C0875_l.f3755a), a2.f1961b, C0875_l.f3755a);
        } else {
            pQVar = new C1389hQ();
        }
        Xea.a(pQVar, "Cannot return null from a non-@Nullable @Provides method");
        return pQVar;
    }
}
