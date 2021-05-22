package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class GK implements NK<C0952at> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ HK f2026a;

    GK(HK hk) {
        this.f2026a = hk;
    }

    @Override // com.google.android.gms.internal.ads.NK
    public final void a() {
        synchronized (this.f2026a) {
            this.f2026a.d = false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.NK
    public final /* synthetic */ void a(C0952at atVar) {
        C0952at atVar2 = atVar;
        synchronized (this.f2026a) {
            this.f2026a.d = false;
            this.f2026a.f2121c = atVar2.d();
            atVar2.b();
        }
    }
}
