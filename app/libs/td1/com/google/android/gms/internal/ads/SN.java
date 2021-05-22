package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class SN implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final PN f3078a;

    SN(PN pn) {
        this.f3078a = pn;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3078a.b();
    }
}
