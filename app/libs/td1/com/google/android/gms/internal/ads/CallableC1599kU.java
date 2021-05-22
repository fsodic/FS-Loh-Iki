package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.kU  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC1599kU implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1324gU f4775a;

    CallableC1599kU(C1324gU gUVar) {
        this.f4775a = gUVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4775a.c();
    }
}
