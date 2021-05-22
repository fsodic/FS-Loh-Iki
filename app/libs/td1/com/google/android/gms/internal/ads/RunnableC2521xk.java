package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xk  reason: case insensitive filesystem */
public final class RunnableC2521xk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f6014a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2452wk f6015b;

    RunnableC2521xk(C2452wk wkVar, Context context) {
        this.f6015b = wkVar;
        this.f6014a = context;
    }

    public final void run() {
        synchronized (this.f6015b.e) {
            this.f6015b.f = C2452wk.c(this.f6014a);
            this.f6015b.e.notifyAll();
        }
    }
}
