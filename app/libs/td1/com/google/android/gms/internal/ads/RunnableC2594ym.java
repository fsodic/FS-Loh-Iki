package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ym  reason: case insensitive filesystem */
public final class RunnableC2594ym implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f6131a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f6132b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ TextureView$SurfaceTextureListenerC2249tm f6133c;

    RunnableC2594ym(TextureView$SurfaceTextureListenerC2249tm tmVar, String str, String str2) {
        this.f6133c = tmVar;
        this.f6131a = str;
        this.f6132b = str2;
    }

    public final void run() {
        if (this.f6133c.r != null) {
            this.f6133c.r.a(this.f6131a, this.f6132b);
        }
    }
}
