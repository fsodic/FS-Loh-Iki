package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.rM  reason: case insensitive filesystem */
final /* synthetic */ class CallableC2073rM implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2142sM f5406a;

    CallableC2073rM(C2142sM sMVar) {
        this.f5406a = sMVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f5406a.b();
    }
}
