package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.tfa  reason: case insensitive filesystem */
public final class RunnableC2236tfa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f5630a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f5631b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1823nfa f5632c;

    RunnableC2236tfa(C1823nfa nfa, int i, boolean z) {
        this.f5632c = nfa;
        this.f5630a = i;
        this.f5631b = z;
    }

    public final void run() {
        C1511jB b2 = this.f5632c.b(this.f5630a, this.f5631b);
        this.f5632c.k = b2;
        if (C1823nfa.b(this.f5630a, b2)) {
            this.f5632c.a(this.f5630a + 1, this.f5631b);
        }
    }
}
