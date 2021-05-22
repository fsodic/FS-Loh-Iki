package com.google.android.gms.internal.ads;

final class Upa extends Coa {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spa f3296a;

    private Upa(Spa spa) {
        this.f3296a = spa;
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final String Z() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final void a(Zna zna, int i) {
        C0745Vl.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C0459Kl.f2428a.post(new Xpa(this));
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final void b(Zna zna) {
        a(zna, 1);
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final String k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final boolean q() {
        return false;
    }
}
