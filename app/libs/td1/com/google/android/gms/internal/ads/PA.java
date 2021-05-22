package com.google.android.gms.internal.ads;

public final class PA implements Sea<FA> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<MC> f2803a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1306gC> f2804b;

    public PA(_ea<MC> _ea, _ea<C1306gC> _ea2) {
        this.f2803a = _ea;
        this.f2804b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new FA(this.f2803a.get(), this.f2804b.get());
    }
}
