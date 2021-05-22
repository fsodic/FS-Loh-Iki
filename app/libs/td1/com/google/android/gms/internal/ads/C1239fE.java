package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fE  reason: case insensitive filesystem */
public final class C1239fE implements Sea<C0523Mx<AbstractC0650Ru>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1170eE> f4275a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4276b;

    private C1239fE(_ea<C1170eE> _ea, _ea<Executor> _ea2) {
        this.f4275a = _ea;
        this.f4276b = _ea2;
    }

    public static C1239fE a(_ea<C1170eE> _ea, _ea<Executor> _ea2) {
        return new C1239fE(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4275a.get(), this.f4276b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
