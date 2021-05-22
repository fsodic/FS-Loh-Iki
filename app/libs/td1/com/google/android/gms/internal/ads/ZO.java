package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class ZO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final WO f3635a;

    ZO(WO wo) {
        this.f3635a = wo;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        WO wo = this.f3635a;
        return new XO(wo.f3411a.a(wo.f3413c));
    }
}
