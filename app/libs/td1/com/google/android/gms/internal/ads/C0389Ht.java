package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ht  reason: case insensitive filesystem */
public final class C0389Ht implements Sea<C0523Mx<AbstractC0520Mu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0337Ft f2184a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0467Kt> f2185b;

    private C0389Ht(C0337Ft ft, _ea<C0467Kt> _ea) {
        this.f2184a = ft;
        this.f2185b = _ea;
    }

    public static C0389Ht a(C0337Ft ft, _ea<C0467Kt> _ea) {
        return new C0389Ht(ft, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2185b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
