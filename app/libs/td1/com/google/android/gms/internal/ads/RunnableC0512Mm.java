package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mm  reason: case insensitive filesystem */
final class RunnableC0512Mm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f2618a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0434Jm f2619b;

    RunnableC0512Mm(C0434Jm jm, boolean z) {
        this.f2619b = jm;
        this.f2618a = z;
    }

    public final void run() {
        this.f2619b.b("windowVisibilityChanged", "isVisible", String.valueOf(this.f2618a));
    }
}
