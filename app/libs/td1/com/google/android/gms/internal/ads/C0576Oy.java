package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oy  reason: case insensitive filesystem */
public final class C0576Oy implements Sea<C0523Mx<AbstractC0520Mu>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0237Bx> f2801a;

    public C0576Oy(_ea<C0237Bx> _ea) {
        this.f2801a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2801a.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
