package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yI  reason: case insensitive filesystem */
public final class C2552yI implements AbstractC2000qH<C0525Mz, SR, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6064a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1646kz f6065b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f6066c;

    public C2552yI(Context context, AbstractC1646kz kzVar, Executor executor) {
        this.f6064a = context;
        this.f6065b = kzVar;
        this.f6066c = executor;
    }

    private static boolean a(BR br, int i) {
        return br.f1610a.f5888a.g.contains(Integer.toString(i));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ C0525Mz a(BR br, C1941pR pRVar, C1931pH<SR, ZH> pHVar) {
        C0707Tz tz;
        AbstractC2580yf i = pHVar.f5211b.i();
        AbstractC0271Df j = pHVar.f5211b.j();
        AbstractC0297Ef l = pHVar.f5211b.l();
        if (l != null && a(br, 6)) {
            tz = C0707Tz.a(l);
        } else if (i != null && a(br, 6)) {
            tz = C0707Tz.b(i);
        } else if (i != null && a(br, 2)) {
            tz = C0707Tz.a(i);
        } else if (j != null && a(br, 6)) {
            tz = C0707Tz.b(j);
        } else if (j == null || !a(br, 1)) {
            throw new SI(YR.f3560a, "No native ad mappers");
        } else {
            tz = C0707Tz.a(j);
        }
        if (br.f1610a.f5888a.g.contains(Integer.toString(tz.o()))) {
            AbstractC0837Yz a2 = this.f6065b.a(new C2054qt(br, pRVar, pHVar.f5210a), new C1166eA(tz), new VA(j, i, l));
            ((ZH) pHVar.f5212c).a((AbstractC2304uf) a2.f());
            a2.a().a(new C1294fr(pHVar.f5211b), this.f6066c);
            return a2.h();
        }
        throw new SI(YR.f3560a, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<SR, ZH> pHVar) {
        GR gr = br.f1610a.f5888a;
        pHVar.f5211b.a(this.f6064a, br.f1610a.f5888a.d, pRVar.s.toString(), C2041ql.a((AbstractC2109rl) pRVar.p), (AbstractC2304uf) pHVar.f5212c, gr.i, gr.g);
    }
}
