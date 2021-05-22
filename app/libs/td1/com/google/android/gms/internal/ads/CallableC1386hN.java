package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.hN  reason: case insensitive filesystem */
final /* synthetic */ class CallableC1386hN implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1179eN f4471a;

    CallableC1386hN(C1179eN eNVar) {
        this.f4471a = eNVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4471a.b();
    }
}
