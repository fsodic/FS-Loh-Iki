package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class EE implements Sea<Set<C0523Mx<AbstractC1436hv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final DE f1843a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<NE> f1844b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f1845c;

    private EE(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        this.f1843a = de;
        this.f1844b = _ea;
        this.f1845c = _ea2;
    }

    public static EE a(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        return new EE(de, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC1436hv>> a2 = DE.a(this.f1844b.get(), this.f1845c.get());
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
