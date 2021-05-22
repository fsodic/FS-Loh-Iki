package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.nM  reason: case insensitive filesystem */
final /* synthetic */ class CallableC1798nM implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1867oM f5033a;

    CallableC1798nM(C1867oM oMVar) {
        this.f5033a = oMVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f5033a.b();
    }
}
