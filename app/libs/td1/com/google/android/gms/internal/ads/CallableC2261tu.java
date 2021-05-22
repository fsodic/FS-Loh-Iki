package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.tu  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC2261tu implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2055qu f5672a;

    /* renamed from: b  reason: collision with root package name */
    private final SW f5673b;

    CallableC2261tu(C2055qu quVar, SW sw) {
        this.f5672a = quVar;
        this.f5673b = sw;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f5672a.a(this.f5673b);
    }
}
