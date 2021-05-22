package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Am  reason: case insensitive filesystem */
final class RunnableC0200Am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f1553a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f1554b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ TextureView$SurfaceTextureListenerC2249tm f1555c;

    RunnableC0200Am(TextureView$SurfaceTextureListenerC2249tm tmVar, int i, int i2) {
        this.f1555c = tmVar;
        this.f1553a = i;
        this.f1554b = i2;
    }

    public final void run() {
        if (this.f1555c.r != null) {
            this.f1555c.r.a(this.f1553a, this.f1554b);
        }
    }
}
