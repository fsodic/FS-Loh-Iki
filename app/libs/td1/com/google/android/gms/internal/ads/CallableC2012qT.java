package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qT  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC2012qT implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1667lT f5315a;

    CallableC2012qT(AbstractC1667lT lTVar) {
        this.f5315a = lTVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f5315a.run();
        return null;
    }
}
