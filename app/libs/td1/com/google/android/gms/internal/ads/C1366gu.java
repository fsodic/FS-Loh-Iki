package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gu  reason: case insensitive filesystem */
public final class C1366gu implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0727Ut f4440a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1917ou> f4441b;

    private C1366gu(C0727Ut ut, _ea<C1917ou> _ea) {
        this.f4440a = ut;
        this.f4441b = _ea;
    }

    public static C1366gu a(C0727Ut ut, _ea<C1917ou> _ea) {
        return new C1366gu(ut, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4441b.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
