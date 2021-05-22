package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Id  reason: case insensitive filesystem */
final class C0399Id extends C1980pp {
    private final /* synthetic */ C0243Cd d;

    private C0399Id(C0243Cd cd) {
        this.d = cd;
    }

    @Override // com.google.android.gms.internal.ads.C1980pp
    public final void a(C1911op opVar) {
        if (C0243Cd.a(this.d) != null) {
            C0243Cd.a(this.d).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.C1980pp
    public final void b(C1911op opVar) {
        this.d.a(opVar.f5175b);
    }

    @Override // com.google.android.gms.internal.ads.C1980pp
    public final boolean c(C1911op opVar) {
        return this.d.a(opVar.f5175b);
    }
}
