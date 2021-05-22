package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Mt  reason: case insensitive filesystem */
public final class C0519Mt implements Sea<C0523Mx<AbstractC0757Vx>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0731Ux> f2625a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2626b;

    private C0519Mt(_ea<C0731Ux> _ea, _ea<Executor> _ea2) {
        this.f2625a = _ea;
        this.f2626b = _ea2;
    }

    public static C0519Mt a(_ea<C0731Ux> _ea, _ea<Executor> _ea2) {
        return new C0519Mt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2625a.get(), this.f2626b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
