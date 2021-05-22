package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.je  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC1544je implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0607Qd f4696a;

    private RunnableC1544je(AbstractC0607Qd qd) {
        this.f4696a = qd;
    }

    static Runnable a(AbstractC0607Qd qd) {
        return new RunnableC1544je(qd);
    }

    public final void run() {
        this.f4696a.destroy();
    }
}
