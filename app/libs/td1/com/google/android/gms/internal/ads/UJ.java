package com.google.android.gms.internal.ads;

public final class UJ<AdT> implements Sea<QJ<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BT> f3234a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f3235b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<S> f3236c;
    private final _ea<RJ<AdT>> d;

    public UJ(_ea<BT> _ea, _ea<VW> _ea2, _ea<S> _ea3, _ea<RJ<AdT>> _ea4) {
        this.f3234a = _ea;
        this.f3235b = _ea2;
        this.f3236c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new QJ(this.f3234a.get(), this.f3235b.get(), this.f3236c.get(), this.d.get());
    }
}
