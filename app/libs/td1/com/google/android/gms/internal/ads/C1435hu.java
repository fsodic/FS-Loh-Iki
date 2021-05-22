package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hu  reason: case insensitive filesystem */
public final class C1435hu implements Sea<C0523Mx<AbstractC1436hv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0727Ut f4529a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1917ou> f4530b;

    private C1435hu(C0727Ut ut, _ea<C1917ou> _ea) {
        this.f4529a = ut;
        this.f4530b = _ea;
    }

    public static C1435hu a(C0727Ut ut, _ea<C1917ou> _ea) {
        return new C1435hu(ut, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4530b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
