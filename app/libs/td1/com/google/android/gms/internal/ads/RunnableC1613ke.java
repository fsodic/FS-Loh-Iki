package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ke  reason: case insensitive filesystem */
public final class RunnableC1613ke implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2302ue f4786a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC0607Qd f4787b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1132de f4788c;

    RunnableC1613ke(C1132de deVar, C2302ue ueVar, AbstractC0607Qd qd) {
        this.f4788c = deVar;
        this.f4786a = ueVar;
        this.f4787b = qd;
    }

    public final void run() {
        synchronized (this.f4788c.f4119a) {
            if (this.f4786a.a() != -1) {
                if (this.f4786a.a() != 1) {
                    this.f4786a.b();
                    VW vw = C0875_l.e;
                    AbstractC0607Qd qd = this.f4787b;
                    qd.getClass();
                    vw.execute(RunnableC1820ne.a(qd));
                    C1763mk.f("Could not receive loaded message in a timely manner. Rejecting.");
                }
            }
        }
    }
}
