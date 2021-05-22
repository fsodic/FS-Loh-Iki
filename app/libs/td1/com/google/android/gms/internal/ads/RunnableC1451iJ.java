package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iJ  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1451iJ implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1032cD f4554a;

    private RunnableC1451iJ(C1032cD cDVar) {
        this.f4554a = cDVar;
    }

    static Runnable a(C1032cD cDVar) {
        return new RunnableC1451iJ(cDVar);
    }

    public final void run() {
        this.f4554a.a();
    }
}
