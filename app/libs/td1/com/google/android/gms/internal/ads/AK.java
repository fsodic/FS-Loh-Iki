package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class AK implements GW<C1990py> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC0524My f1502a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BK f1503b;

    AK(BK bk, AbstractC0524My my) {
        this.f1503b = bk;
        this.f1502a = my;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(C1990py pyVar) {
        C1990py pyVar2 = pyVar;
        synchronized (this.f1503b) {
            this.f1503b.k = null;
            this.f1503b.j = pyVar2;
            if (((Boolean) C2392voa.e().a(C2474x.bf)).booleanValue()) {
                C0210Aw f = pyVar2.f();
                f.a(this.f1503b.d);
                f.a(this.f1503b.e);
                f.a(this.f1503b.g);
                f.a(this.f1503b.f);
            }
            pyVar2.b();
            if (((Boolean) C2392voa.e().a(C2474x.bf)).booleanValue()) {
                this.f1503b.f1600a.a().execute(new DK(this));
                this.f1503b.f1600a.a().execute(new CK(this));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        Sna a2 = C0896aF.a(th);
        synchronized (this.f1503b) {
            this.f1503b.k = null;
            this.f1502a.b().c(a2.f3128a);
            if (((Boolean) C2392voa.e().a(C2474x.Ze)).booleanValue()) {
                this.f1503b.f1600a.a().execute(new FK(this, a2));
                this.f1503b.f1600a.a().execute(new EK(this, a2));
            }
            PR.a(a2.f3128a, th, "InterstitialAdManagerShim.onFailure");
        }
    }
}
