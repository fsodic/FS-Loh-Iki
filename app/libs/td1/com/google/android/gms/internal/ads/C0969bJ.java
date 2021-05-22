package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b.c.b.a.c.b;

/* renamed from: com.google.android.gms.internal.ads.bJ  reason: case insensitive filesystem */
public final class C0969bJ implements AbstractC2000qH<C2615zC, AbstractC1755mg, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3883a;

    /* renamed from: b  reason: collision with root package name */
    private final CC f3884b;

    public C0969bJ(Context context, CC cc) {
        this.f3883a = context;
        this.f3884b = cc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ C2615zC a(BR br, C1941pR pRVar, C1931pH<AbstractC1755mg, ZH> pHVar) {
        C1450iI iIVar = new C1450iI(pRVar, pHVar.f5211b, true);
        BC a2 = this.f3884b.a(new C2054qt(br, pRVar, pHVar.f5210a), new AC(iIVar));
        iIVar.a(a2.d());
        ((ZH) pHVar.f5212c).a((AbstractC2304uf) a2.n());
        return a2.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<AbstractC1755mg, ZH> pHVar) {
        try {
            pHVar.f5211b.n(pRVar.R);
            if (br.f1610a.f5888a.n.f5512a == C2492xR.f5983c) {
                pHVar.f5211b.b(pRVar.L, pRVar.s.toString(), br.f1610a.f5888a.d, b.a(this.f3883a), new BinderC1107dJ(this, pHVar), (AbstractC2304uf) pHVar.f5212c);
            } else {
                pHVar.f5211b.a(pRVar.L, pRVar.s.toString(), br.f1610a.f5888a.d, b.a(this.f3883a), new BinderC1107dJ(this, pHVar), (AbstractC2304uf) pHVar.f5212c);
            }
        } catch (RemoteException e) {
            C1763mk.e("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
