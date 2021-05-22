package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class XH implements GW<AbstractC0951as> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ RH f3483a;

    XH(RH rh) {
        this.f3483a = rh;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(AbstractC0951as asVar) {
        asVar.b();
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        Sna a2 = C0896aF.a(th);
        RH.a(this.f3483a).c(a2.f3128a);
        PR.a(a2.f3128a, th, "DelayedBannerAd.onFailure");
    }
}
