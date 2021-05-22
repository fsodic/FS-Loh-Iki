package com.google.android.gms.internal.ads;

public final class GC implements Sea<C0523Mx<AbstractC0520Mu>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0237Bx> f2013a;

    public GC(_ea<C0237Bx> _ea) {
        this.f2013a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2013a.get(), C0875_l.f);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
