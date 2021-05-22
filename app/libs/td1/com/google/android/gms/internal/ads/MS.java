package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class MS implements GW<CS<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ LS f2586a;

    MS(LS ls) {
        this.f2586a = ls;
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(Object obj) {
        CS<?> cs = (CS) obj;
        synchronized (this.f2586a) {
            this.f2586a.g.a(cs);
            if (this.f2586a.e != AS.h) {
                this.f2586a.f.a(this.f2586a.f2488b.b(), cs);
            }
            if (this.f2586a.e == AS.g) {
                this.f2586a.c((LS) this.f2586a.f2488b);
            }
            this.f2586a.e = AS.g;
            this.f2586a.f2489c.a(cs);
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        synchronized (this.f2586a) {
            this.f2586a.g.a(th);
            this.f2586a.f2489c.a(th);
        }
    }
}
