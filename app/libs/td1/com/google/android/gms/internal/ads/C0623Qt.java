package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Qt  reason: case insensitive filesystem */
public final class C0623Qt implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1432hr> f2978a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2979b;

    private C0623Qt(_ea<C1432hr> _ea, _ea<Executor> _ea2) {
        this.f2978a = _ea;
        this.f2979b = _ea2;
    }

    public static C0523Mx<AbstractC0261Cv> a(C1432hr hrVar, Executor executor) {
        C0523Mx<AbstractC0261Cv> mx = new C0523Mx<>(hrVar, executor);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }

    public static C0623Qt a(_ea<C1432hr> _ea, _ea<Executor> _ea2) {
        return new C0623Qt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f2978a.get(), this.f2979b.get());
    }
}
