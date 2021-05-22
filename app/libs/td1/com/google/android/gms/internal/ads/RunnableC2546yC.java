package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yC  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC2546yC implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f6052a;

    private RunnableC2546yC(AbstractC1564jo joVar) {
        this.f6052a = joVar;
    }

    static Runnable a(AbstractC1564jo joVar) {
        return new RunnableC2546yC(joVar);
    }

    public final void run() {
        this.f6052a.destroy();
    }
}
