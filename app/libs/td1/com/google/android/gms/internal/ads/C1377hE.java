package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.hE  reason: case insensitive filesystem */
public final class C1377hE implements Sea<C0523Mx<IT>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2203tE> f4451a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4452b;

    private C1377hE(_ea<C2203tE> _ea, _ea<Executor> _ea2) {
        this.f4451a = _ea;
        this.f4452b = _ea2;
    }

    public static C1377hE a(_ea<C2203tE> _ea, _ea<Executor> _ea2) {
        return new C1377hE(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4451a.get(), this.f4452b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
