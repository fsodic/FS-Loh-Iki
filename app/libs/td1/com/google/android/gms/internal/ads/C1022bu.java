package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bu  reason: case insensitive filesystem */
public final class C1022bu implements Sea<C0523Mx<AbstractC1229ev>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0955aw> f3950a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3951b;

    private C1022bu(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        this.f3950a = _ea;
        this.f3951b = _ea2;
    }

    public static C1022bu a(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        return new C1022bu(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3950a.get(), this.f3951b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
