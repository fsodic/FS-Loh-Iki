package com.google.android.gms.internal.ads;

import android.view.Surface;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fla  reason: case insensitive filesystem */
public final class RunnableC1284fla implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Surface f4337a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ _ka f4338b;

    RunnableC1284fla(_ka _ka, Surface surface) {
        this.f4338b = _ka;
        this.f4337a = surface;
    }

    public final void run() {
        this.f4338b.f3754b.a(this.f4337a);
    }
}
