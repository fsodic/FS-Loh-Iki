package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class BO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final DO f1607a;

    BO(DO r1) {
        this.f1607a = r1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f1607a.b();
    }
}
