package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.kA  reason: case insensitive filesystem */
public final class C1579kA implements Sea<C0523Mx<AbstractC0651Rv>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2209tK> f4743a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4744b;

    private C1579kA(_ea<C2209tK> _ea, _ea<Executor> _ea2) {
        this.f4743a = _ea;
        this.f4744b = _ea2;
    }

    public static C1579kA a(_ea<C2209tK> _ea, _ea<Executor> _ea2) {
        return new C1579kA(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4743a.get(), this.f4744b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
