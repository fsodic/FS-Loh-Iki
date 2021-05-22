package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import b.c.b.a.c.b;

public final class KH implements AbstractC2000qH<AbstractC0951as, AbstractC1755mg, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2384a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2466ws f2385b;

    /* renamed from: c  reason: collision with root package name */
    private View f2386c;

    public KH(Context context, AbstractC2466ws wsVar) {
        this.f2384a = context;
        this.f2385b = wsVar;
    }

    static final /* synthetic */ AbstractC2532xpa a(C1931pH pHVar) {
        try {
            return pHVar.f5211b.getVideoController();
        } catch (RemoteException e) {
            throw new MR(e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ AbstractC0951as a(BR br, C1941pR pRVar, C1931pH<AbstractC1755mg, ZH> pHVar) {
        AbstractC1157ds a2 = this.f2385b.a(new C2054qt(br, pRVar, pHVar.f5210a), new C1433hs(this.f2386c, null, new JH(pHVar), pRVar.r.get(0)));
        a2.j().a(this.f2386c);
        ((ZH) pHVar.f5212c).a((AbstractC2304uf) a2.g());
        return a2.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<AbstractC1755mg, ZH> pHVar) {
        try {
            pHVar.f5211b.n(pRVar.R);
            pHVar.f5211b.a(pRVar.L, pRVar.s.toString(), br.f1610a.f5888a.d, b.a(this.f2384a), new LH(this, pHVar), (AbstractC2304uf) pHVar.f5212c, br.f1610a.f5888a.e);
        } catch (RemoteException e) {
            throw new MR(e);
        }
    }
}
