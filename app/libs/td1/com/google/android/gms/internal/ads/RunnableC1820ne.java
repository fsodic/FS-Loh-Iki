package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ne  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1820ne implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0607Qd f5061a;

    private RunnableC1820ne(AbstractC0607Qd qd) {
        this.f5061a = qd;
    }

    static Runnable a(AbstractC0607Qd qd) {
        return new RunnableC1820ne(qd);
    }

    public final void run() {
        this.f5061a.destroy();
    }
}
