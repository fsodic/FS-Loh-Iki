package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class ON implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final LN f2740a;

    ON(LN ln) {
        this.f2740a = ln;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2740a.b();
    }
}
