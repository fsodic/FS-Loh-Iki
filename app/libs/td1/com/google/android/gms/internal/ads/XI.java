package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class XI implements AbstractC2000qH<C2615zC, SR, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3484a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3485b;

    /* renamed from: c  reason: collision with root package name */
    private final CC f3486c;

    public XI(Context context, Executor executor, CC cc) {
        this.f3484a = context;
        this.f3485b = executor;
        this.f3486c = cc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ C2615zC a(BR br, C1941pR pRVar, C1931pH<SR, ZH> pHVar) {
        BC a2 = this.f3486c.a(new C2054qt(br, pRVar, pHVar.f5210a), new AC(new _I(pHVar)));
        a2.a().a(new C1294fr(pHVar.f5211b), this.f3485b);
        ((ZH) pHVar.f5212c).a((AbstractC2304uf) a2.m());
        return a2.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<SR, ZH> pHVar) {
        try {
            GR gr = br.f1610a.f5888a;
            if (gr.n.f5512a == C2492xR.f5983c) {
                pHVar.f5211b.c(this.f3484a, gr.d, pRVar.s.toString(), (AbstractC2304uf) pHVar.f5212c);
            } else {
                pHVar.f5211b.b(this.f3484a, gr.d, pRVar.s.toString(), (AbstractC2304uf) pHVar.f5212c);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(pHVar.f5210a);
            C0745Vl.c(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }
}
