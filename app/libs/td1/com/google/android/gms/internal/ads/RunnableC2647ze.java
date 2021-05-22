package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ze  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC2647ze implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0192Ae f6195a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0607Qd f6196b;

    RunnableC2647ze(C0192Ae ae, AbstractC0607Qd qd) {
        this.f6195a = ae;
        this.f6196b = qd;
    }

    public final void run() {
        C0192Ae ae = this.f6195a;
        AbstractC0607Qd qd = this.f6196b;
        ae.f1528a.d.a(qd);
        qd.destroy();
    }
}
