package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class KE implements Sea<Set<C0523Mx<IT>>> {

    /* renamed from: a  reason: collision with root package name */
    private final DE f2378a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<NE> f2379b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f2380c;

    private KE(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        this.f2378a = de;
        this.f2379b = _ea;
        this.f2380c = _ea2;
    }

    public static KE a(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        return new KE(de, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<IT>> h = DE.h(this.f2379b.get(), this.f2380c.get());
        Xea.a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
