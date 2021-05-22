package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fha  reason: case insensitive filesystem */
final class RunnableC1276fha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bha f4318a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Zga f4319b;

    RunnableC1276fha(Zga zga, Bha bha) {
        this.f4319b = zga;
        this.f4318a = bha;
    }

    public final void run() {
        this.f4318a.a();
        Zga.a(this.f4319b).b(this.f4318a);
    }
}
