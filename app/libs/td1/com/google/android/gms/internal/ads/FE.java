package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class FE implements Sea<Set<C0523Mx<AbstractC0650Ru>>> {

    /* renamed from: a  reason: collision with root package name */
    private final DE f1934a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<NE> f1935b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f1936c;

    private FE(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        this.f1934a = de;
        this.f1935b = _ea;
        this.f1936c = _ea2;
    }

    public static FE a(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        return new FE(de, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC0650Ru>> d = DE.d(this.f1935b.get(), this.f1936c.get());
        Xea.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
