package com.google.android.gms.internal.ads;

final class Una implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0959b f3293a;

    /* renamed from: b  reason: collision with root package name */
    private final C0191Ad f3294b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f3295c;

    public Una(AbstractC0959b bVar, C0191Ad ad, Runnable runnable) {
        this.f3293a = bVar;
        this.f3294b = ad;
        this.f3295c = runnable;
    }

    public final void run() {
        this.f3293a.d();
        if (this.f3294b.f1527c == null) {
            this.f3293a.a((Object) this.f3294b.f1525a);
        } else {
            this.f3293a.a(this.f3294b.f1527c);
        }
        if (this.f3294b.d) {
            this.f3293a.a("intermediate-response");
        } else {
            this.f3293a.b("done");
        }
        Runnable runnable = this.f3295c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
