package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class LM implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final IM f2478a;

    LM(IM im) {
        this.f2478a = im;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2478a.b();
    }
}
