package com.google.android.gms.internal.ads;

public final class QJ<AdT> implements AbstractC1793nH<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final S f2919a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f2920b;

    /* renamed from: c  reason: collision with root package name */
    private final BT f2921c;
    private final RJ<AdT> d;

    public QJ(BT bt, VW vw, S s, RJ<AdT> rj) {
        this.f2921c = bt;
        this.f2920b = vw;
        this.f2919a = s;
        this.d = rj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<AdT> a(BR br, C1941pR pRVar) {
        C1423hm hmVar = new C1423hm();
        ZJ zj = new ZJ();
        zj.a(new SJ(this, hmVar, br, pRVar, zj));
        C2216tR tRVar = pRVar.p;
        return this.f2921c.a(EnumC2563yT.CUSTOM_RENDER_SYN).a(new PJ(this, new O(zj, tRVar.f5610b, tRVar.f5609a)), this.f2920b).a(EnumC2563yT.CUSTOM_RENDER_ACK).a((SW) hmVar).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(O o) {
        this.f2919a.a(o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        C2216tR tRVar;
        return (this.f2919a == null || (tRVar = pRVar.p) == null || tRVar.f5609a == null) ? false : true;
    }
}
