package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dm  reason: case insensitive filesystem */
final class RunnableC0278Dm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TextureView$SurfaceTextureListenerC2249tm f1815a;

    RunnableC0278Dm(TextureView$SurfaceTextureListenerC2249tm tmVar) {
        this.f1815a = tmVar;
    }

    public final void run() {
        if (this.f1815a.r != null) {
            this.f1815a.r.d();
            this.f1815a.r.b();
        }
    }
}
