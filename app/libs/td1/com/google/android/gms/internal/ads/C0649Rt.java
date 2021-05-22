package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Rt  reason: case insensitive filesystem */
public final class C0649Rt implements Sea<C0523Mx<AbstractC1229ev>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1432hr> f3050a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3051b;

    private C0649Rt(_ea<C1432hr> _ea, _ea<Executor> _ea2) {
        this.f3050a = _ea;
        this.f3051b = _ea2;
    }

    public static C0649Rt a(_ea<C1432hr> _ea, _ea<Executor> _ea2) {
        return new C0649Rt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3050a.get(), this.f3051b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
