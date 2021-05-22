package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qs  reason: case insensitive filesystem */
public final class C2053qs implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5370a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0596Ps> f5371b;

    public C2053qs(C1433hs hsVar, _ea<C0596Ps> _ea) {
        this.f5370a = hsVar;
        this.f5371b = _ea;
    }

    public static C0523Mx<AbstractC0261Cv> a(C1433hs hsVar, C0596Ps ps) {
        C0523Mx<AbstractC0261Cv> mx = new C0523Mx<>(ps, C0875_l.e);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5370a, this.f5371b.get());
    }
}
