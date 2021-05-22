package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class LE implements Sea<Set<C0523Mx<AbstractC1229ev>>> {

    /* renamed from: a  reason: collision with root package name */
    private final DE f2460a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<NE> f2461b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f2462c;

    private LE(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        this.f2460a = de;
        this.f2461b = _ea;
        this.f2462c = _ea2;
    }

    public static LE a(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        return new LE(de, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC1229ev>> f = DE.f(this.f2461b.get(), this.f2462c.get());
        Xea.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
