package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jt  reason: case insensitive filesystem */
public final class C0441Jt implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0337Ft f2367a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0467Kt> f2368b;

    private C0441Jt(C0337Ft ft, _ea<C0467Kt> _ea) {
        this.f2367a = ft;
        this.f2368b = _ea;
    }

    public static C0441Jt a(C0337Ft ft, _ea<C0467Kt> _ea) {
        return new C0441Jt(ft, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2368b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
