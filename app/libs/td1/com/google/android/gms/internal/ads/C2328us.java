package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.us  reason: case insensitive filesystem */
public final class C2328us implements Sea<C0523Mx<AbstractC0366Gw>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5768a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0729Uv> f5769b;

    public C2328us(C1433hs hsVar, _ea<C0729Uv> _ea) {
        this.f5768a = hsVar;
        this.f5769b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(new C1570js(this.f5769b.get()), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
