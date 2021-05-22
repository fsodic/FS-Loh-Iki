package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.By  reason: case insensitive filesystem */
public final class C0238By implements Sea<C0523Mx<AbstractC0528Nc>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f1666a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2477xC> f1667b;

    public C0238By(C2059qy qyVar, _ea<C2477xC> _ea) {
        this.f1666a = qyVar;
        this.f1667b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f1667b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
