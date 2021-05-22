package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ot  reason: case insensitive filesystem */
public final class C0571Ot implements Sea<C0523Mx<AbstractC0520Mu>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1432hr> f2795a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2796b;

    private C0571Ot(_ea<C1432hr> _ea, _ea<Executor> _ea2) {
        this.f2795a = _ea;
        this.f2796b = _ea2;
    }

    public static C0571Ot a(_ea<C1432hr> _ea, _ea<Executor> _ea2) {
        return new C0571Ot(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2795a.get(), this.f2796b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
