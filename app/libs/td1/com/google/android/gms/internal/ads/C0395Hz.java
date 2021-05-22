package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hz  reason: case insensitive filesystem */
public final class C0395Hz implements Sea<C0523Mx<AbstractC1229ev>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2680zz f2190a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<RA> f2191b;

    public C0395Hz(C2680zz zzVar, _ea<RA> _ea) {
        this.f2190a = zzVar;
        this.f2191b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2191b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
