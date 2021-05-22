package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.v;
import java.util.concurrent.Executor;

public final class FH implements AbstractC2000qH<AbstractC0951as, SR, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1937a;

    /* renamed from: b  reason: collision with root package name */
    private final C0823Yl f1938b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC2466ws f1939c;
    private final Executor d;

    public FH(Context context, C0823Yl yl, AbstractC2466ws wsVar, Executor executor) {
        this.f1937a = context;
        this.f1938b = yl;
        this.f1939c = wsVar;
        this.d = executor;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ AbstractC0951as a(BR br, C1941pR pRVar, C1931pH<SR, ZH> pHVar) {
        AbstractC2466ws wsVar = this.f1939c;
        C2054qt qtVar = new C2054qt(br, pRVar, pHVar.f5210a);
        View c2 = pHVar.f5211b.c();
        AdapterT adaptert = pHVar.f5211b;
        adaptert.getClass();
        AbstractC1157ds a2 = wsVar.a(qtVar, new C1433hs(c2, null, IH.a(adaptert), pRVar.r.get(0)));
        a2.j().a(pHVar.f5211b.c());
        a2.a().a(new C1294fr(pHVar.f5211b), this.d);
        ((ZH) pHVar.f5212c).a((AbstractC2304uf) a2.f());
        return a2.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<SR, ZH> pHVar) {
        C1015boa boa = br.f1610a.f5888a.e;
        C1015boa boa2 = boa.n ? new C1015boa(this.f1937a, v.a(boa.e, boa.f3941b)) : JR.a(this.f1937a, pRVar.r);
        if (this.f1938b.f3589c < 4100000) {
            pHVar.f5211b.a(this.f1937a, boa2, br.f1610a.f5888a.d, pRVar.s.toString(), (AbstractC2304uf) pHVar.f5212c);
        } else {
            pHVar.f5211b.a(this.f1937a, boa2, br.f1610a.f5888a.d, pRVar.s.toString(), C2041ql.a((AbstractC2109rl) pRVar.p), (AbstractC2304uf) pHVar.f5212c);
        }
    }
}
