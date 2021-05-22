package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Zm  reason: case insensitive filesystem */
public final class RunnableC0850Zm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private C0434Jm f3675a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3676b = false;

    RunnableC0850Zm(C0434Jm jm) {
        this.f3675a = jm;
    }

    private final void c() {
        C2452wk.f5921a.removeCallbacks(this);
        C2452wk.f5921a.postDelayed(this, 250);
    }

    public final void a() {
        this.f3676b = true;
        this.f3675a.o();
    }

    public final void b() {
        this.f3676b = false;
        c();
    }

    public final void run() {
        if (!this.f3676b) {
            this.f3675a.o();
            c();
        }
    }
}
