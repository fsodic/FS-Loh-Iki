package com.google.android.gms.internal.ads;

public final class NC implements Sea<AbstractC1793nH<C2615zC>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BT> f2635a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f2636b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0969bJ> f2637c;
    private final _ea<C2484xJ> d;

    public NC(_ea<BT> _ea, _ea<VW> _ea2, _ea<C0969bJ> _ea3, _ea<C2484xJ> _ea4) {
        this.f2635a = _ea;
        this.f2636b = _ea2;
        this.f2637c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        BJ bj = new BJ(this.f2635a.get(), this.f2636b.get(), this.d.get(), this.f2637c.get());
        Xea.a(bj, "Cannot return null from a non-@Nullable @Provides method");
        return bj;
    }
}
