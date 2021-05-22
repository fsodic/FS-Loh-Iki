package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.in  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1493in implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TextureView$SurfaceTextureListenerC1150dn f4604a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4605b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4606c;

    RunnableC1493in(TextureView$SurfaceTextureListenerC1150dn dnVar, int i, int i2) {
        this.f4604a = dnVar;
        this.f4605b = i;
        this.f4606c = i2;
    }

    public final void run() {
        this.f4604a.b(this.f4605b, this.f4606c);
    }
}
