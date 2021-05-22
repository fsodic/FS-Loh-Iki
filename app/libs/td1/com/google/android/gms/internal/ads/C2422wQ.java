package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.wQ  reason: case insensitive filesystem */
public final class C2422wQ implements Sea<AbstractC1940pQ<CC, C2615zC>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5885a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1873oS> f5886b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<HS> f5887c;

    public C2422wQ(_ea<Context> _ea, _ea<C1873oS> _ea2, _ea<HS> _ea3) {
        this.f5885a = _ea;
        this.f5886b = _ea2;
        this.f5887c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        AbstractC1940pQ pQVar;
        Context context = this.f5885a.get();
        C1873oS oSVar = this.f5886b.get();
        HS hs = this.f5887c.get();
        if (((Integer) C2392voa.e().a(C2474x.me)).intValue() > 0) {
            FS a2 = hs.a(EnumC2493xS.Rewarded, context, oSVar, new XP(new SP()));
            pQVar = new TP(new C1595kQ(new C1389hQ()), new C0976bQ(a2.f1960a, C0875_l.f3755a), a2.f1961b, C0875_l.f3755a);
        } else {
            pQVar = new C1389hQ();
        }
        Xea.a(pQVar, "Cannot return null from a non-@Nullable @Provides method");
        return pQVar;
    }
}
