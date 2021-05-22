package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

/* renamed from: com.google.android.gms.internal.ads.Ky  reason: case insensitive filesystem */
public final class C0472Ky implements o {

    /* renamed from: a  reason: collision with root package name */
    private final C0469Kv f2448a;

    /* renamed from: b  reason: collision with root package name */
    private final C0419Ix f2449b;

    public C0472Ky(C0469Kv kv, C0419Ix ix) {
        this.f2448a = kv;
        this.f2449b = ix;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        this.f2448a.I();
        this.f2449b.R();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void J() {
        this.f2448a.J();
        this.f2449b.Q();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
        this.f2448a.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
        this.f2448a.onResume();
    }
}
