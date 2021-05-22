package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fq  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC0334Fq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final BinderC0282Dq f1994a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f1995b;

    RunnableC0334Fq(BinderC0282Dq dq, Runnable runnable) {
        this.f1994a = dq;
        this.f1995b = runnable;
    }

    public final void run() {
        this.f1994a.a(this.f1995b);
    }
}
