package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ku  reason: case insensitive filesystem */
public final class C1641ku implements Sea<C0523Mx<AbstractC1093cw>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1710lu f4819a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1572ju> f4820b;

    private C1641ku(C1710lu luVar, _ea<C1572ju> _ea) {
        this.f4819a = luVar;
        this.f4820b = _ea;
    }

    public static C1641ku a(C1710lu luVar, _ea<C1572ju> _ea) {
        return new C1641ku(luVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4820b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
