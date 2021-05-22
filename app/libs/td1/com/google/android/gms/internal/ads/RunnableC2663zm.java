package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zm  reason: case insensitive filesystem */
final class RunnableC2663zm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TextureView$SurfaceTextureListenerC2249tm f6207a;

    RunnableC2663zm(TextureView$SurfaceTextureListenerC2249tm tmVar) {
        this.f6207a = tmVar;
    }

    public final void run() {
        if (this.f6207a.r != null) {
            this.f6207a.r.c();
        }
    }
}
