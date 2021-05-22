package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.uy  reason: case insensitive filesystem */
public final class C2334uy implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f5774a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5775b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0823Yl> f5776c;
    private final _ea<C1941pR> d;
    private final _ea<GR> e;

    private C2334uy(C2059qy qyVar, _ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<C1941pR> _ea3, _ea<GR> _ea4) {
        this.f5774a = qyVar;
        this.f5775b = _ea;
        this.f5776c = _ea2;
        this.d = _ea3;
        this.e = _ea4;
    }

    public static C2334uy a(C2059qy qyVar, _ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<C1941pR> _ea3, _ea<GR> _ea4) {
        return new C2334uy(qyVar, _ea, _ea2, _ea3, _ea4);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(new C2265ty(this.f5775b.get(), this.f5776c.get(), this.d.get(), this.e.get()), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
