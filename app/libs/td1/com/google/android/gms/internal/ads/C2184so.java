package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.so  reason: case insensitive filesystem */
public final class C2184so implements o {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1564jo f5552a;

    /* renamed from: b  reason: collision with root package name */
    private o f5553b;

    public C2184so(AbstractC1564jo joVar, o oVar) {
        this.f5552a = joVar;
        this.f5553b = oVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        o oVar = this.f5553b;
        if (oVar != null) {
            oVar.I();
        }
        this.f5552a.j();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void J() {
        o oVar = this.f5553b;
        if (oVar != null) {
            oVar.J();
        }
        this.f5552a.l();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
    }
}
