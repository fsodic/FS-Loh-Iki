package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tH  reason: case insensitive filesystem */
public final class C2206tH implements AbstractC1793nH<C0725Ur> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0569Or f5589a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5590b;

    /* renamed from: c  reason: collision with root package name */
    private final MC f5591c;
    private final GR d;
    private final Executor e;

    public C2206tH(AbstractC0569Or or, Context context, Executor executor, MC mc, GR gr) {
        this.f5590b = context;
        this.f5589a = or;
        this.e = executor;
        this.f5591c = mc;
        this.d = gr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<C0725Ur> a(BR br, C1941pR pRVar) {
        return JW.a(JW.a((Object) null), new C2137sH(this, br, pRVar), this.e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(BR br, C1941pR pRVar, Object obj) {
        C1015boa a2 = JR.a(this.f5590b, pRVar.r);
        AbstractC1564jo a3 = this.f5591c.a(a2);
        AbstractC0413Ir a4 = this.f5589a.a(new C2054qt(br, pRVar, null), new C0491Lr(a3.getView(), a3, JR.a(a2), pRVar.S, pRVar.W, pRVar.G));
        a4.i().a(a3, false);
        a4.d().a(new C2413wH(a3), C0875_l.f);
        a4.i();
        C2216tR tRVar = pRVar.p;
        return JW.a(OC.a(a3, tRVar.f5610b, tRVar.f5609a), new C2344vH(a4), C0875_l.f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        C2216tR tRVar = pRVar.p;
        return (tRVar == null || tRVar.f5609a == null) ? false : true;
    }
}
