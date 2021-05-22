package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gJ  reason: case insensitive filesystem */
public final class C1313gJ implements AbstractC1793nH<C2615zC> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4373a;

    /* renamed from: b  reason: collision with root package name */
    private final MC f4374b;

    /* renamed from: c  reason: collision with root package name */
    private final CC f4375c;
    private final GR d;
    private final Executor e;
    private final C0823Yl f;

    public C1313gJ(Context context, C0823Yl yl, GR gr, Executor executor, CC cc, MC mc) {
        this.f4373a = context;
        this.d = gr;
        this.f4375c = cc;
        this.e = executor;
        this.f = yl;
        this.f4374b = mc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<C2615zC> a(BR br, C1941pR pRVar) {
        C1032cD cDVar = new C1032cD();
        SW<C2615zC> a2 = JW.a(JW.a((Object) null), new C1519jJ(this, pRVar, cDVar, br), this.e);
        a2.a(RunnableC1451iJ.a(cDVar), this.e);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C1941pR pRVar, C1032cD cDVar, BR br, Object obj) {
        SW<?> sw;
        AbstractC1564jo a2 = this.f4374b.a(this.d.e, pRVar.Q);
        a2.e(pRVar.N);
        cDVar.a(this.f4373a, a2.getView());
        C1423hm hmVar = new C1423hm();
        BC a3 = this.f4375c.a(new C2054qt(br, pRVar, null), new AC(new C1726mJ(this.f4373a, this.f4374b, this.d, this.f, pRVar, hmVar, a2), a2));
        hmVar.b(a3);
        C0554Oc.a(a2, a3.l());
        a3.d().a(new C1657lJ(a2), C0875_l.f);
        a3.h().a(a2, true);
        if (!((Boolean) C2392voa.e().a(C2474x.ke)).booleanValue() || !pRVar.Q) {
            a3.h();
            C2216tR tRVar = pRVar.p;
            sw = OC.a(a2, tRVar.f5610b, tRVar.f5609a);
        } else {
            sw = JW.a((Object) null);
        }
        return JW.a(sw, new C1588kJ(this, a2, pRVar, a3), this.e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        C2216tR tRVar = pRVar.p;
        return (tRVar == null || tRVar.f5609a == null) ? false : true;
    }
}
