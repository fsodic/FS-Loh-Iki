package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

/* renamed from: com.google.android.gms.internal.ads.gp  reason: case insensitive filesystem */
final class C1360gp implements o {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1564jo f4430a;

    /* renamed from: b  reason: collision with root package name */
    private o f4431b;

    public C1360gp(AbstractC1564jo joVar, o oVar) {
        this.f4430a = joVar;
        this.f4431b = oVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        o oVar = this.f4431b;
        if (oVar != null) {
            oVar.I();
        }
        this.f4430a.j();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void J() {
        o oVar = this.f4431b;
        if (oVar != null) {
            oVar.J();
        }
        this.f4430a.l();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
    }
}
