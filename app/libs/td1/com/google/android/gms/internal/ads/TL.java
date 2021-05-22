package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class TL implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final QL f3166a;

    TL(QL ql) {
        this.f3166a = ql;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3166a.b();
    }
}
