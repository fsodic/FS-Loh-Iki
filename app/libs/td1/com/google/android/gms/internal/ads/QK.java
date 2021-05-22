package com.google.android.gms.internal.ads;

final class QK implements GW<C0952at> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ NK f2922a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC1646kz f2923b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PK f2924c;

    QK(PK pk, NK nk, AbstractC1646kz kzVar) {
        this.f2924c = pk;
        this.f2922a = nk;
        this.f2923b = kzVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(C0952at atVar) {
        C0952at atVar2 = atVar;
        synchronized (this.f2924c) {
            if (((Boolean) C2392voa.e().a(C2474x.cf)).booleanValue()) {
                atVar2.f().a(this.f2924c.d.b());
            }
            this.f2922a.a(atVar2);
            if (((Boolean) C2392voa.e().a(C2474x.cf)).booleanValue()) {
                this.f2924c.f2818b.a().execute(new TK(this));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        Sna a2 = C0896aF.a(th);
        this.f2923b.b().c(a2.f3128a);
        if (((Boolean) C2392voa.e().a(C2474x.cf)).booleanValue()) {
            this.f2924c.f2818b.a().execute(new SK(this, a2));
        }
        PR.a(a2.f3128a, th, "NativeAdLoader.onFailure");
        this.f2922a.a();
    }
}
