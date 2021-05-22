package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bm  reason: case insensitive filesystem */
final class RunnableC0226Bm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TextureView$SurfaceTextureListenerC2249tm f1653a;

    RunnableC0226Bm(TextureView$SurfaceTextureListenerC2249tm tmVar) {
        this.f1653a = tmVar;
    }

    public final void run() {
        if (this.f1653a.r != null) {
            this.f1653a.r.f();
        }
    }
}
