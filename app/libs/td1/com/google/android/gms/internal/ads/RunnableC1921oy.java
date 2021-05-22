package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oy  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1921oy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f5194a;

    private RunnableC1921oy(AbstractC1564jo joVar) {
        this.f5194a = joVar;
    }

    static Runnable a(AbstractC1564jo joVar) {
        return new RunnableC1921oy(joVar);
    }

    public final void run() {
        this.f5194a.destroy();
    }
}
