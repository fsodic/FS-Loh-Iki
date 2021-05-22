package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Et  reason: case insensitive filesystem */
public final class C0311Et implements Sea<C0523Mx<Ona>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0337Ft f1917a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0467Kt> f1918b;

    private C0311Et(C0337Ft ft, _ea<C0467Kt> _ea) {
        this.f1917a = ft;
        this.f1918b = _ea;
    }

    public static C0311Et a(C0337Ft ft, _ea<C0467Kt> _ea) {
        return new C0311Et(ft, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f1918b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
