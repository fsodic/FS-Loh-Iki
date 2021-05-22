package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vy  reason: case insensitive filesystem */
public final class C0758Vy implements Sea<AbstractC1793nH<C1990py>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BT> f3385a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f3386b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1725mI> f3387c;
    private final _ea<C2484xJ> d;

    public C0758Vy(_ea<BT> _ea, _ea<VW> _ea2, _ea<C1725mI> _ea3, _ea<C2484xJ> _ea4) {
        this.f3385a = _ea;
        this.f3386b = _ea2;
        this.f3387c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        BJ bj = new BJ(this.f3385a.get(), this.f3386b.get(), this.d.get(), this.f3387c.get());
        Xea.a(bj, "Cannot return null from a non-@Nullable @Provides method");
        return bj;
    }
}
