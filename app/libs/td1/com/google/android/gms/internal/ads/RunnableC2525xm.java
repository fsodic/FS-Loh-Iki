package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xm  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC2525xm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TextureView$SurfaceTextureListenerC2249tm f6020a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6021b;

    RunnableC2525xm(TextureView$SurfaceTextureListenerC2249tm tmVar, int i) {
        this.f6020a = tmVar;
        this.f6021b = i;
    }

    public final void run() {
        this.f6020a.h(this.f6021b);
    }
}
