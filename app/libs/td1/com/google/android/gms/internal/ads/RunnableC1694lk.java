package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.lk  reason: case insensitive filesystem */
public final class RunnableC1694lk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1487ik f4899a;

    RunnableC1694lk(AbstractC1487ik ikVar) {
        this.f4899a = ikVar;
    }

    public final void run() {
        this.f4899a.f4591b = Thread.currentThread();
        this.f4899a.a();
    }
}
