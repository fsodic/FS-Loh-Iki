package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rK  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC2071rK implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2623zK f5404a;

    private RunnableC2071rK(C2623zK zKVar) {
        this.f5404a = zKVar;
    }

    static Runnable a(C2623zK zKVar) {
        return new RunnableC2071rK(zKVar);
    }

    public final void run() {
        this.f5404a.a();
    }
}
