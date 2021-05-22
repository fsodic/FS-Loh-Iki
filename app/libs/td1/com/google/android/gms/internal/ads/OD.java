package com.google.android.gms.internal.ads;

public final class OD implements Sea<HD> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Dma> f2723a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2353vQ> f2724b;

    private OD(_ea<Dma> _ea, _ea<C2353vQ> _ea2) {
        this.f2723a = _ea;
        this.f2724b = _ea2;
    }

    public static OD a(_ea<Dma> _ea, _ea<C2353vQ> _ea2) {
        return new OD(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new HD(this.f2723a.get(), this.f2724b.get());
    }
}
