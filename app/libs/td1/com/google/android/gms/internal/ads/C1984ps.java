package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ps  reason: case insensitive filesystem */
public final class C1984ps implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5285a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5286b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0823Yl> f5287c;
    private final _ea<C1941pR> d;
    private final _ea<GR> e;

    public C1984ps(C1433hs hsVar, _ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<C1941pR> _ea3, _ea<GR> _ea4) {
        this.f5285a = hsVar;
        this.f5286b = _ea;
        this.f5287c = _ea2;
        this.d = _ea3;
        this.e = _ea4;
    }

    public static C0523Mx<AbstractC0261Cv> a(C1433hs hsVar, Context context, C0823Yl yl, C1941pR pRVar, GR gr) {
        C0523Mx<AbstractC0261Cv> mx = new C0523Mx<>(new C1364gs(context, yl, pRVar, gr), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5285a, this.f5286b.get(), this.f5287c.get(), this.d.get(), this.e.get());
    }
}
