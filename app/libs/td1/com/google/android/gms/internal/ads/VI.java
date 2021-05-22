package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class VI<AdT> implements AbstractC2221tW<BR, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final BT f3325a;

    /* renamed from: b  reason: collision with root package name */
    private final C0598Pu f3326b;

    /* renamed from: c  reason: collision with root package name */
    private final LT f3327c;
    private final Executor d;
    private final ScheduledExecutorService e;
    private final AbstractC1021bt<AdT> f;
    private final OI g;

    public VI(BT bt, OI oi, C0598Pu pu, LT lt, AbstractC1021bt<AdT> btVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f3325a = bt;
        this.g = oi;
        this.f3326b = pu;
        this.f3327c = lt;
        this.f = btVar;
        this.d = executor;
        this.e = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(BR br, C1941pR pRVar, AbstractC1793nH nHVar, Throwable th) {
        OI oi = this.g;
        C2078rR rRVar = br.f1611b.f6181b;
        SW a2 = JW.a(nHVar.a(br, pRVar), (long) pRVar.J, TimeUnit.MILLISECONDS, this.e);
        oi.a(rRVar, pRVar, a2);
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final /* synthetic */ SW b(BR br) {
        BR br2 = br;
        C1598kT a2 = this.f3325a.a(EnumC2563yT.RENDER_CONFIG_INIT).a(JW.a((Throwable) new SI(YR.f3562c, "No ad config."))).a();
        this.f3326b.a(new C1500ir(br2, this.f3327c), this.d);
        int i = 0;
        for (C1941pR pRVar : br2.f1611b.f6180a) {
            Iterator<String> it = pRVar.f5229a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                AbstractC1793nH<AdT> a3 = this.f.a(pRVar.f5230b, next);
                if (a3 != null && a3.b(br2, pRVar)) {
                    C2218tT a4 = this.f3325a.a(EnumC2563yT.RENDER_CONFIG_WATERFALL, a2);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 26);
                    sb.append("render-config-");
                    sb.append(i);
                    sb.append("-");
                    sb.append(next);
                    a2 = a4.a(sb.toString()).a(Throwable.class, new UI(this, br2, pRVar, a3)).a();
                    break;
                }
            }
            i++;
        }
        return a2;
    }
}
