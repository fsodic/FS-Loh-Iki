package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class RH implements AbstractC1793nH<AbstractC0951as> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2466ws f2996a;

    /* renamed from: b  reason: collision with root package name */
    private final C2482xH f2997b;

    /* renamed from: c  reason: collision with root package name */
    private final VW f2998c;
    private final C0598Pu d;
    private final ScheduledExecutorService e;

    public RH(AbstractC2466ws wsVar, C2482xH xHVar, C0598Pu pu, ScheduledExecutorService scheduledExecutorService, VW vw) {
        this.f2996a = wsVar;
        this.f2997b = xHVar;
        this.d = pu;
        this.e = scheduledExecutorService;
        this.f2998c = vw;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<AbstractC0951as> a(BR br, C1941pR pRVar) {
        return this.f2998c.a(new UH(this, br, pRVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        return br.f1610a.f5888a.a() != null && this.f2997b.b(br, pRVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC0951as c(BR br, C1941pR pRVar) {
        return this.f2996a.a(new C2054qt(br, pRVar, null), new C0492Ls(br.f1610a.f5888a.a(), new TH(this, br, pRVar))).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(BR br, C1941pR pRVar) {
        JW.a(JW.a(this.f2997b.a(br, pRVar), (long) pRVar.J, TimeUnit.SECONDS, this.e), new XH(this), this.f2998c);
    }
}
