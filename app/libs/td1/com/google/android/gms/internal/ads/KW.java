package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class KW<V> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2405a;

    /* renamed from: b  reason: collision with root package name */
    private final AV<SW<? extends V>> f2406b;

    private KW(boolean z, AV<SW<? extends V>> av) {
        this.f2405a = z;
        this.f2406b = av;
    }

    /* synthetic */ KW(boolean z, AV av, IW iw) {
        this(z, av);
    }

    public final <C> SW<C> a(Callable<C> callable, Executor executor) {
        return new C2497xW(this.f2406b, this.f2405a, executor, callable);
    }
}
