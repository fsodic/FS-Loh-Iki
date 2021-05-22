package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.zma  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC2664zma implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1423hm f6208a;

    /* renamed from: b  reason: collision with root package name */
    private final Future f6209b;

    RunnableC2664zma(C1423hm hmVar, Future future) {
        this.f6208a = hmVar;
        this.f6209b = future;
    }

    public final void run() {
        C1423hm hmVar = this.f6208a;
        Future future = this.f6209b;
        if (hmVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
