package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.zP  reason: case insensitive filesystem */
public final class C2628zP implements GW<C0725Ur> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ NK f6176a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ BP f6177b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C2283uP f6178c;

    C2628zP(C2283uP uPVar, NK nk, BP bp) {
        this.f6178c = uPVar;
        this.f6176a = nk;
        this.f6177b = bp;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(C0725Ur ur) {
        C0725Ur ur2 = ur;
        synchronized (this.f6178c) {
            this.f6178c.h = null;
            if (((Boolean) C2392voa.e().a(C2474x.af)).booleanValue()) {
                ur2.f().a(this.f6178c.d);
            }
            this.f6176a.a(ur2);
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        Sna a2 = C0896aF.a(th);
        synchronized (this.f6178c) {
            this.f6178c.h = null;
            AbstractC0569Or or = (AbstractC0569Or) this.f6178c.e.a();
            if (or != null) {
                or.d().c(a2.f3128a);
                if (((Boolean) C2392voa.e().a(C2474x.af)).booleanValue()) {
                    this.f6178c.f5714b.execute(new RunnableC2559yP(this, a2));
                }
            } else {
                this.f6178c.d.c(a2.f3128a);
                this.f6178c.a(this.f6177b).b().a().c().L();
            }
            PR.a(a2.f3128a, th, "AppOpenAdLoader.onFailure");
            this.f6176a.a();
        }
    }
}
