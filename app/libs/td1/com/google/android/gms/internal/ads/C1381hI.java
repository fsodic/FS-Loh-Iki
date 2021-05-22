package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.hI  reason: case insensitive filesystem */
public final class C1381hI implements AbstractC2000qH<C1990py, SR, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4462a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0524My f4463b;

    /* renamed from: c  reason: collision with root package name */
    private final C0823Yl f4464c;
    private final Executor d;

    public C1381hI(Context context, C0823Yl yl, AbstractC0524My my, Executor executor) {
        this.f4462a = context;
        this.f4464c = yl;
        this.f4463b = my;
        this.d = executor;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ C1990py a(BR br, C1941pR pRVar, C1931pH<SR, ZH> pHVar) {
        AbstractC2127ry a2 = this.f4463b.a(new C2054qt(br, pRVar, pHVar.f5210a), new C2059qy(new C1587kI(pHVar)));
        a2.a().a(new C1294fr(pHVar.f5211b), this.d);
        ((ZH) pHVar.f5212c).a((AbstractC2304uf) a2.f());
        return a2.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<SR, ZH> pHVar) {
        if (this.f4464c.f3589c < 4100000) {
            pHVar.f5211b.a(this.f4462a, br.f1610a.f5888a.d, pRVar.s.toString(), (AbstractC2304uf) pHVar.f5212c);
        } else {
            pHVar.f5211b.a(this.f4462a, br.f1610a.f5888a.d, pRVar.s.toString(), C2041ql.a((AbstractC2109rl) pRVar.p), (AbstractC2304uf) pHVar.f5212c);
        }
    }
}
