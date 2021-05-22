package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.mN  reason: case insensitive filesystem */
final /* synthetic */ class CallableC1730mN implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1799nN f4941a;

    CallableC1730mN(C1799nN nNVar) {
        this.f4941a = nNVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4941a.b();
    }
}
