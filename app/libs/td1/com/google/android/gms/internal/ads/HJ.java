package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class HJ implements AbstractC1793nH<AbstractC0951as> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2116a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2466ws f2117b;

    /* renamed from: c  reason: collision with root package name */
    private final S f2118c;
    private final VW d;
    private final BT e;

    public HJ(Context context, AbstractC2466ws wsVar, BT bt, VW vw, S s) {
        this.f2116a = context;
        this.f2117b = wsVar;
        this.e = bt;
        this.d = vw;
        this.f2118c = s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<AbstractC0951as> a(BR br, C1941pR pRVar) {
        AbstractC1157ds a2 = this.f2117b.a(new C2054qt(br, pRVar, null), new MJ(this, new View(this.f2116a), null, KJ.f2390a, pRVar.r.get(0)));
        LJ k = a2.k();
        C2216tR tRVar = pRVar.p;
        return this.e.a(EnumC2563yT.CUSTOM_RENDER_SYN).a(new JJ(this, new O(k, tRVar.f5610b, tRVar.f5609a)), this.d).a(EnumC2563yT.CUSTOM_RENDER_ACK).a((SW) JW.a(a2.i())).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(O o) {
        this.f2118c.a(o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        C2216tR tRVar;
        return (this.f2118c == null || (tRVar = pRVar.p) == null || tRVar.f5609a == null) ? false : true;
    }
}
