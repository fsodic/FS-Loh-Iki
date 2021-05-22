package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gt  reason: case insensitive filesystem */
public final class C0363Gt implements Sea<C0523Mx<AbstractC1229ev>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0337Ft f2084a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0467Kt> f2085b;

    private C0363Gt(C0337Ft ft, _ea<C0467Kt> _ea) {
        this.f2084a = ft;
        this.f2085b = _ea;
    }

    public static C0363Gt a(C0337Ft ft, _ea<C0467Kt> _ea) {
        return new C0363Gt(ft, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2085b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
