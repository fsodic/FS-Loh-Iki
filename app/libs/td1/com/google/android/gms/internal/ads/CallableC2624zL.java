package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.zL  reason: case insensitive filesystem */
final /* synthetic */ class CallableC2624zL implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2348vL f6171a;

    CallableC2624zL(C2348vL vLVar) {
        this.f6171a = vLVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f6171a.b();
    }
}
