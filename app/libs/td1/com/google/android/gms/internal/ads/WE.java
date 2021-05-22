package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class WE implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final PE f3396a;

    WE(PE pe) {
        this.f3396a = pe;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3396a.d();
    }
}
