package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kn  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1631kn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TextureView$SurfaceTextureListenerC1150dn f4805a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4806b;

    RunnableC1631kn(TextureView$SurfaceTextureListenerC1150dn dnVar, int i) {
        this.f4805a = dnVar;
        this.f4806b = i;
    }

    public final void run() {
        this.f4805a.h(this.f4806b);
    }
}
