package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.r;

/* renamed from: com.google.android.gms.internal.ads.ue  reason: case insensitive filesystem */
public final class C2302ue extends C1905om<AbstractC0607Qd> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f5739c = new Object();
    private AbstractC1008bl<AbstractC0607Qd> d;
    private boolean e;
    private int f;

    public C2302ue(AbstractC1008bl<AbstractC0607Qd> blVar) {
        this.d = blVar;
        this.e = false;
        this.f = 0;
    }

    private final void f() {
        synchronized (this.f5739c) {
            r.b(this.f >= 0);
            if (!this.e || this.f != 0) {
                C1763mk.f("There are still references to the engine. Not destroying.");
            } else {
                C1763mk.f("No reference is left (including root). Cleaning up engine.");
                a(new C0192Ae(this), new C1767mm());
            }
        }
    }

    public final C2027qe c() {
        C2027qe qeVar = new C2027qe(this);
        synchronized (this.f5739c) {
            a(new C2578ye(this, qeVar), new C2509xe(this, qeVar));
            r.b(this.f >= 0);
            this.f++;
        }
        return qeVar;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        synchronized (this.f5739c) {
            r.b(this.f > 0);
            C1763mk.f("Releasing 1 reference for JS Engine");
            this.f--;
            f();
        }
    }

    public final void e() {
        synchronized (this.f5739c) {
            r.b(this.f >= 0);
            C1763mk.f("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            f();
        }
    }
}
