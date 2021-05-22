package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gD  reason: case insensitive filesystem */
public final class C1307gD implements Sea<C0523Mx<AbstractC1436hv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1376hD f4365a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1238fD> f4366b;

    private C1307gD(C1376hD hDVar, _ea<C1238fD> _ea) {
        this.f4365a = hDVar;
        this.f4366b = _ea;
    }

    public static C1307gD a(C1376hD hDVar, _ea<C1238fD> _ea) {
        return new C1307gD(hDVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4366b.get(), C0875_l.e);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
