package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fm  reason: case insensitive filesystem */
final class RunnableC0330Fm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TextureView$SurfaceTextureListenerC2249tm f1985a;

    RunnableC0330Fm(TextureView$SurfaceTextureListenerC2249tm tmVar) {
        this.f1985a = tmVar;
    }

    public final void run() {
        if (this.f1985a.r != null) {
            this.f1985a.r.d();
        }
    }
}
