package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qJ  reason: case insensitive filesystem */
public final class C2002qJ implements AbstractC2000qH<C2615zC, SR, YH> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5303a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5304b;

    /* renamed from: c  reason: collision with root package name */
    private final CC f5305c;

    public C2002qJ(Context context, Executor executor, CC cc) {
        this.f5303a = context;
        this.f5304b = executor;
        this.f5305c = cc;
    }

    /* access modifiers changed from: private */
    public static void c(BR br, C1941pR pRVar, C1931pH<SR, YH> pHVar) {
        try {
            pHVar.f5211b.a(br.f1610a.f5888a.d, pRVar.s.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(pHVar.f5210a);
            C0745Vl.c(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.BR, com.google.android.gms.internal.ads.pR, com.google.android.gms.internal.ads.pH] */
    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final /* synthetic */ C2615zC a(BR br, C1941pR pRVar, C1931pH<SR, YH> pHVar) {
        BC a2 = this.f5305c.a(new C2054qt(br, pRVar, pHVar.f5210a), new AC(new C2208tJ(pHVar)));
        a2.a().a(new C1294fr(pHVar.f5211b), this.f5304b);
        C1780mv b2 = a2.b();
        C0494Lu c2 = a2.c();
        ((YH) pHVar.f5212c).a((AbstractC0326Fi) new BinderC2277uJ(this, a2.i(), c2, b2, a2.l()));
        return a2.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2000qH
    public final void b(BR br, C1941pR pRVar, C1931pH<SR, YH> pHVar) {
        if (!pHVar.f5211b.d()) {
            ((YH) pHVar.f5212c).a(new C2139sJ(this, br, pRVar, pHVar));
            pHVar.f5211b.a(this.f5303a, br.f1610a.f5888a.d, null, (AbstractC0326Fi) pHVar.f5212c, pRVar.s.toString());
            return;
        }
        c(br, pRVar, pHVar);
    }
}
