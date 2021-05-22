package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mF  reason: case insensitive filesystem */
public final class C1722mF implements Sea<C0523Mx<AbstractC1093cw>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1035cG> f4925a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4926b;

    private C1722mF(_ea<C1035cG> _ea, _ea<Executor> _ea2) {
        this.f4925a = _ea;
        this.f4926b = _ea2;
    }

    public static C1722mF a(_ea<C1035cG> _ea, _ea<Executor> _ea2) {
        return new C1722mF(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4925a.get(), this.f4926b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
