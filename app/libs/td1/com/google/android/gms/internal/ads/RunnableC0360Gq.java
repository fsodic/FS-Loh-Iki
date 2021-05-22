package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gq  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC0360Gq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final BinderC0282Dq f2080a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f2081b;

    RunnableC0360Gq(BinderC0282Dq dq, Runnable runnable) {
        this.f2080a = dq;
        this.f2081b = runnable;
    }

    public final void run() {
        C0875_l.e.execute(new RunnableC0334Fq(this.f2080a, this.f2081b));
    }
}
