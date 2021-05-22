package com.google.android.gms.internal.ads;

public final class WL implements Sea<UL> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f3407a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<GR> f3408b;

    private WL(_ea<VW> _ea, _ea<GR> _ea2) {
        this.f3407a = _ea;
        this.f3408b = _ea2;
    }

    public static WL a(_ea<VW> _ea, _ea<GR> _ea2) {
        return new WL(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new UL(this.f3407a.get(), this.f3408b.get());
    }
}
