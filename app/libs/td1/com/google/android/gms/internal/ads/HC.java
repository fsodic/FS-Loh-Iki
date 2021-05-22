package com.google.android.gms.internal.ads;

public final class HC implements Sea<AbstractC1793nH<C2615zC>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BJ<C2615zC, SR, YH>> f2098a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<BJ<C2615zC, SR, ZH>> f2099b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f2100c;

    public HC(_ea<BJ<C2615zC, SR, YH>> _ea, _ea<BJ<C2615zC, SR, ZH>> _ea2, _ea<GR> _ea3) {
        this.f2098a = _ea;
        this.f2099b = _ea2;
        this.f2100c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        AbstractC1793nH nHVar = EC.f1842a[this.f2100c.get().n.f5512a - 1] != 1 ? this.f2099b.get() : this.f2098a.get();
        Xea.a(nHVar, "Cannot return null from a non-@Nullable @Provides method");
        return nHVar;
    }
}
