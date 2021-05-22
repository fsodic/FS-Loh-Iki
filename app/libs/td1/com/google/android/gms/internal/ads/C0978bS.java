package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bS  reason: case insensitive filesystem */
public final class C0978bS implements Sea<C0523Mx<AbstractC0650Ru>> {

    /* renamed from: a  reason: collision with root package name */
    private final ZR f3897a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0909aS> f3898b;

    private C0978bS(ZR zr, _ea<C0909aS> _ea) {
        this.f3897a = zr;
        this.f3898b = _ea;
    }

    public static C0978bS a(ZR zr, _ea<C0909aS> _ea) {
        return new C0978bS(zr, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3898b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
