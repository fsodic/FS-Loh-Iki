package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.jU  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC1530jU implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1324gU f4678a;

    CallableC1530jU(C1324gU gUVar) {
        this.f4678a = gUVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4678a.b();
    }
}
