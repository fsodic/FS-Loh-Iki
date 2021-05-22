package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class MO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final NO f2581a;

    MO(NO no) {
        this.f2581a = no;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        NO no = this.f2581a;
        return new KO(no.f2661a.a(no.f2663c));
    }
}
