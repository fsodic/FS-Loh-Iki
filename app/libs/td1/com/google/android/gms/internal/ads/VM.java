package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Callable;

final /* synthetic */ class VM implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f3330a = new VM();

    private VM() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new TM(q.m().a(), q.m().b());
    }
}
