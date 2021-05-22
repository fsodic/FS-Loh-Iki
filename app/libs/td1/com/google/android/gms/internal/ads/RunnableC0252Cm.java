package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Cm  reason: case insensitive filesystem */
public final class RunnableC0252Cm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TextureView$SurfaceTextureListenerC2249tm f1726a;

    RunnableC0252Cm(TextureView$SurfaceTextureListenerC2249tm tmVar) {
        this.f1726a = tmVar;
    }

    public final void run() {
        if (this.f1726a.r != null) {
            this.f1726a.r.e();
        }
    }
}
