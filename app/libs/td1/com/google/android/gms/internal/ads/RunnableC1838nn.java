package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nn  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1838nn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TextureView$SurfaceTextureListenerC1150dn f5072a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5073b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5074c;

    RunnableC1838nn(TextureView$SurfaceTextureListenerC1150dn dnVar, boolean z, long j) {
        this.f5072a = dnVar;
        this.f5073b = z;
        this.f5074c = j;
    }

    public final void run() {
        this.f5072a.b(this.f5073b, this.f5074c);
    }
}
