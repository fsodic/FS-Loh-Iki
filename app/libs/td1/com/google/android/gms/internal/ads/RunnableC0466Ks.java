package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Ks  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC0466Ks implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f2442a;

    RunnableC0466Ks(AtomicReference atomicReference) {
        this.f2442a = atomicReference;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.f2442a.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
