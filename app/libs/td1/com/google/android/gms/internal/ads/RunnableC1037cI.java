package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cI  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1037cI implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1032cD f3980a;

    private RunnableC1037cI(C1032cD cDVar) {
        this.f3980a = cDVar;
    }

    static Runnable a(C1032cD cDVar) {
        return new RunnableC1037cI(cDVar);
    }

    public final void run() {
        this.f3980a.a();
    }
}
