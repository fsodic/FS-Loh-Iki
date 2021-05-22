package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rs  reason: case insensitive filesystem */
public final class C2121rs implements Sea<C0523Mx<AbstractC1229ev>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5467a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0596Ps> f5468b;

    public C2121rs(C1433hs hsVar, _ea<C0596Ps> _ea) {
        this.f5467a = hsVar;
        this.f5468b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f5468b.get(), C0875_l.e);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
