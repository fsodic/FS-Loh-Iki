package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.uN  reason: case insensitive filesystem */
final /* synthetic */ class CallableC2281uN implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2350vN f5711a;

    CallableC2281uN(C2350vN vNVar) {
        this.f5711a = vNVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f5711a.b();
    }
}
