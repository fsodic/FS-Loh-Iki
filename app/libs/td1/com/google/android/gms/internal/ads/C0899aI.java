package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.aI  reason: case insensitive filesystem */
public final class C0899aI implements AbstractC1793nH<C1990py> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3792a;

    /* renamed from: b  reason: collision with root package name */
    private final MC f3793b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0524My f3794c;
    private final GR d;
    private final Executor e;
    private final C0823Yl f;

    public C0899aI(Context context, C0823Yl yl, GR gr, Executor executor, AbstractC0524My my, MC mc) {
        this.f3792a = context;
        this.d = gr;
        this.f3794c = my;
        this.e = executor;
        this.f = yl;
        this.f3793b = mc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<C1990py> a(BR br, C1941pR pRVar) {
        C1032cD cDVar = new C1032cD();
        SW<C1990py> a2 = JW.a(JW.a((Object) null), new _H(this, pRVar, cDVar, br), this.e);
        a2.a(RunnableC1037cI.a(cDVar), this.e);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C1941pR pRVar, C1032cD cDVar, BR br, Object obj) {
        SW<?> sw;
        AbstractC1564jo a2 = this.f3793b.a(this.d.e, pRVar.Q);
        a2.e(pRVar.N);
        cDVar.a(this.f3792a, a2.getView());
        C1423hm hmVar = new C1423hm();
        AbstractC2127ry a3 = this.f3794c.a(new C2054qt(br, pRVar, null), new C2059qy(new C1312gI(this.f3792a, this.f, hmVar, pRVar, a2), a2));
        hmVar.b(a3);
        a3.d().a(new C0968bI(a2), C0875_l.f);
        a3.h().a(a2, true);
        if (!((Boolean) C2392voa.e().a(C2474x.ke)).booleanValue() || !pRVar.Q) {
            a3.h();
            C2216tR tRVar = pRVar.p;
            sw = OC.a(a2, tRVar.f5610b, tRVar.f5609a);
        } else {
            sw = JW.a((Object) null);
        }
        return JW.a(sw, new C1174eI(this, a2, pRVar, a3), this.e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        C2216tR tRVar = pRVar.p;
        return (tRVar == null || tRVar.f5609a == null) ? false : true;
    }
}
