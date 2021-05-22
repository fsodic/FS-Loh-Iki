package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b.c.b.a.c.b;

public final class AI implements AbstractC2000qH<C0525Mz, AbstractC1755mg, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1498a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1646kz f1499b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0297Ef f1500c;

    public AI(Context context, AbstractC1646kz kzVar) {
        this.f1498a = context;
        this.f1499b = kzVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ C0525Mz a(BR br, C1941pR pRVar, C1931pH<AbstractC1755mg, ZH> pHVar) {
        if (br.f1610a.f5888a.g.contains(Integer.toString(6))) {
            C0707Tz a2 = C0707Tz.a(this.f1500c);
            if (br.f1610a.f5888a.g.contains(Integer.toString(a2.o()))) {
                AbstractC0837Yz a3 = this.f1499b.a(new C2054qt(br, pRVar, pHVar.f5210a), new C1166eA(a2), new VA(null, null, this.f1500c));
                ((ZH) pHVar.f5212c).a((AbstractC2304uf) a3.g());
                return a3.h();
            }
            throw new SI(YR.f3560a, "No corresponding native ad listener");
        }
        throw new SI(YR.f3561b, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<AbstractC1755mg, ZH> pHVar) {
        try {
            pHVar.f5211b.n(pRVar.R);
            pHVar.f5211b.a(pRVar.L, pRVar.s.toString(), br.f1610a.f5888a.d, b.a(this.f1498a), new CI(this, pHVar), (AbstractC2304uf) pHVar.f5212c);
        } catch (RemoteException e) {
            throw new MR(e);
        }
    }
}
