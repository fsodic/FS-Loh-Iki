package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cF  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC1034cF implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1103dF f3973a;

    /* renamed from: b  reason: collision with root package name */
    private final C0715Uh f3974b;

    CallableC1034cF(C1103dF dFVar, C0715Uh uh) {
        this.f3973a = dFVar;
        this.f3974b = uh;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3973a.b(this.f3974b);
    }
}
