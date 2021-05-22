package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

/* renamed from: com.google.android.gms.internal.ads.Bg  reason: case insensitive filesystem */
final class C0220Bg implements o {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzapn f1632a;

    C0220Bg(zzapn zzapn) {
        this.f1632a = zzapn;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        C0745Vl.a("Opening AdMobCustomTabsAdapter overlay.");
        this.f1632a.f6230b.e(this.f1632a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void J() {
        C0745Vl.a("AdMobCustomTabsAdapter overlay is closed.");
        this.f1632a.f6230b.d(this.f1632a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
        C0745Vl.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
        C0745Vl.a("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
