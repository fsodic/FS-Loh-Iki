package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class WQ implements GW<C2615zC> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ NK f3417a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0908aR f3418b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VQ f3419c;

    WQ(VQ vq, NK nk, C0908aR aRVar) {
        this.f3419c = vq;
        this.f3417a = nk;
        this.f3418b = aRVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(C2615zC zCVar) {
        C2615zC zCVar2 = zCVar;
        synchronized (this.f3419c) {
            if (((Boolean) C2392voa.e().a(C2474x._e)).booleanValue()) {
                zCVar2.f().a(this.f3419c.d);
            }
            this.f3417a.a(zCVar2);
            if (((Boolean) C2392voa.e().a(C2474x._e)).booleanValue()) {
                this.f3419c.f3337b.execute(new ZQ(this));
            }
            this.f3419c.d.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        Sna a2 = C0896aF.a(th);
        synchronized (this.f3419c) {
            CC cc = (CC) this.f3419c.e.a();
            if (cc != null) {
                cc.d().c(a2.f3128a);
                if (((Boolean) C2392voa.e().a(C2474x._e)).booleanValue()) {
                    this.f3419c.f3337b.execute(new YQ(this, a2));
                }
            } else {
                this.f3419c.d.c(a2.f3128a);
                this.f3419c.a(this.f3418b).d().a().c().L();
            }
            PR.a(a2.f3128a, th, "RewardedAdLoader.onFailure");
            this.f3417a.a();
        }
    }
}
