package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nja */
final class C1831nja implements Eja {

    /* renamed from: a */
    private final int f5066a;

    /* renamed from: b */
    private final /* synthetic */ C1486ija f5067b;

    public C1831nja(C1486ija ija, int i) {
        this.f5067b = ija;
        this.f5066a = i;
    }

    @Override // com.google.android.gms.internal.ads.Eja
    public final int a(Jga jga, Eha eha, boolean z) {
        return this.f5067b.a(this.f5066a, jga, eha, z);
    }

    @Override // com.google.android.gms.internal.ads.Eja
    public final void a() {
        this.f5067b.h();
    }

    @Override // com.google.android.gms.internal.ads.Eja
    public final void a(long j) {
        this.f5067b.a(this.f5066a, j);
    }

    @Override // com.google.android.gms.internal.ads.Eja
    public final boolean p() {
        return this.f5067b.a(this.f5066a);
    }
}
