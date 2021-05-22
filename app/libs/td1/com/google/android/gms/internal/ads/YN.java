package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class YN implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final VN f3554a;

    YN(VN vn) {
        this.f3554a = vn;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3554a.b();
    }
}
