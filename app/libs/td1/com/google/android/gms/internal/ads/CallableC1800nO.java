package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.nO  reason: case insensitive filesystem */
final /* synthetic */ class CallableC1800nO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1869oO f5037a;

    CallableC1800nO(C1869oO oOVar) {
        this.f5037a = oOVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f5037a.b();
    }
}
