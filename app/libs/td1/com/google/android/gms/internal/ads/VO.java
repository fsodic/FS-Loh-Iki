package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class VO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final SW f3333a;

    /* renamed from: b  reason: collision with root package name */
    private final SW f3334b;

    VO(SW sw, SW sw2) {
        this.f3333a = sw;
        this.f3334b = sw2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new TO((String) this.f3333a.get(), (String) this.f3334b.get());
    }
}
