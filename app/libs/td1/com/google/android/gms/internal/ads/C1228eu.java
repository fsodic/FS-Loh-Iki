package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.eu  reason: case insensitive filesystem */
public final class C1228eu implements Sea<C0523Mx<AbstractC1229ev>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1033cE> f4258a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4259b;

    private C1228eu(_ea<C1033cE> _ea, _ea<Executor> _ea2) {
        this.f4258a = _ea;
        this.f4259b = _ea2;
    }

    public static C1228eu a(_ea<C1033cE> _ea, _ea<Executor> _ea2) {
        return new C1228eu(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4258a.get(), this.f4259b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
