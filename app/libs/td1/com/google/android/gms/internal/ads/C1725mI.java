package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b.c.b.a.c.b;

/* renamed from: com.google.android.gms.internal.ads.mI  reason: case insensitive filesystem */
public final class C1725mI implements AbstractC2000qH<C1990py, AbstractC1755mg, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4930a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0524My f4931b;

    public C1725mI(Context context, AbstractC0524My my) {
        this.f4930a = context;
        this.f4931b = my;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ C1990py a(BR br, C1941pR pRVar, C1931pH<AbstractC1755mg, ZH> pHVar) {
        C1450iI iIVar = new C1450iI(pRVar, pHVar.f5211b, false);
        AbstractC2127ry a2 = this.f4931b.a(new C2054qt(br, pRVar, pHVar.f5210a), new C2059qy(iIVar));
        iIVar.a(a2.d());
        ((ZH) pHVar.f5212c).a((AbstractC2304uf) a2.g());
        return a2.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<AbstractC1755mg, ZH> pHVar) {
        try {
            pHVar.f5211b.n(pRVar.R);
            pHVar.f5211b.a(pRVar.L, pRVar.s.toString(), br.f1610a.f5888a.d, b.a(this.f4930a), new BinderC1863oI(this, pHVar), (AbstractC2304uf) pHVar.f5212c);
        } catch (RemoteException e) {
            throw new MR(e);
        }
    }
}
