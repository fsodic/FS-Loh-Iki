package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eha  reason: case insensitive filesystem */
final class RunnableC1207eha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f4226a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Zga f4227b;

    RunnableC1207eha(Zga zga, int i) {
        this.f4227b = zga;
        this.f4226a = i;
    }

    public final void run() {
        Zga.a(this.f4227b).a(this.f4226a);
    }
}
