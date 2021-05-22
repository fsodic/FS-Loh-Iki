package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Js  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC0440Js implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0388Hs f2365a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f2366b;

    RunnableC0440Js(C0388Hs hs, Runnable runnable) {
        this.f2365a = hs;
        this.f2366b = runnable;
    }

    public final void run() {
        this.f2365a.a(this.f2366b);
    }
}
