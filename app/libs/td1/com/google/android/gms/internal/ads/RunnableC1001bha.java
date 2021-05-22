package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bha  reason: case insensitive filesystem */
final class RunnableC1001bha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bha f3924a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Zga f3925b;

    RunnableC1001bha(Zga zga, Bha bha) {
        this.f3925b = zga;
        this.f3924a = bha;
    }

    public final void run() {
        Zga.a(this.f3925b).a(this.f3924a);
    }
}
