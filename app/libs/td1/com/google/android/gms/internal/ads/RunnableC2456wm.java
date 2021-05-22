package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wm  reason: case insensitive filesystem */
final class RunnableC2456wm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TextureView$SurfaceTextureListenerC2249tm f5928a;

    RunnableC2456wm(TextureView$SurfaceTextureListenerC2249tm tmVar) {
        this.f5928a = tmVar;
    }

    public final void run() {
        if (this.f5928a.r != null) {
            this.f5928a.r.a();
        }
    }
}
