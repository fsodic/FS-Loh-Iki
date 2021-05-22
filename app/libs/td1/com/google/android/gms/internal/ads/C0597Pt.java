package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Pt  reason: case insensitive filesystem */
public final class C0597Pt implements Sea<C0523Mx<Ona>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1432hr> f2892a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2893b;

    private C0597Pt(_ea<C1432hr> _ea, _ea<Executor> _ea2) {
        this.f2892a = _ea;
        this.f2893b = _ea2;
    }

    public static C0597Pt a(_ea<C1432hr> _ea, _ea<Executor> _ea2) {
        return new C0597Pt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2892a.get(), this.f2893b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
