package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class HE implements Sea<Set<C0523Mx<AbstractC0261Cv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final DE f2104a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<NE> f2105b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f2106c;

    private HE(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        this.f2104a = de;
        this.f2105b = _ea;
        this.f2106c = _ea2;
    }

    public static HE a(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        return new HE(de, _ea, _ea2);
    }

    public static Set<C0523Mx<AbstractC0261Cv>> a(DE de, NE ne, Executor executor) {
        Set<C0523Mx<AbstractC0261Cv>> c2 = DE.c(ne, executor);
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f2104a, this.f2105b.get(), this.f2106c.get());
    }
}
