package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ut  reason: case insensitive filesystem */
public final class C2329ut implements o {

    /* renamed from: a  reason: collision with root package name */
    private final C1780mv f5770a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f5771b = new AtomicBoolean(false);

    public C2329ut(C1780mv mvVar) {
        this.f5770a = mvVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        this.f5770a.S();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void J() {
        this.f5771b.set(true);
        this.f5770a.Q();
    }

    public final boolean a() {
        return this.f5771b.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
    }
}
