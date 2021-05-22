package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* renamed from: com.google.android.gms.internal.ads.cj  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1073cj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1142dj f4019a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f4020b;

    RunnableC1073cj(C1142dj djVar, Bitmap bitmap) {
        this.f4019a = djVar;
        this.f4020b = bitmap;
    }

    public final void run() {
        this.f4019a.a(this.f4020b);
    }
}
