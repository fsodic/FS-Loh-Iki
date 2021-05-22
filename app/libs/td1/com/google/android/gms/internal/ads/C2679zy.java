package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zy  reason: case insensitive filesystem */
public final class C2679zy implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f6225a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0784Wy> f6226b;

    private C2679zy(C2059qy qyVar, _ea<C0784Wy> _ea) {
        this.f6225a = qyVar;
        this.f6226b = _ea;
    }

    public static C2679zy a(C2059qy qyVar, _ea<C0784Wy> _ea) {
        return new C2679zy(qyVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f6226b.get(), C0875_l.e);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
