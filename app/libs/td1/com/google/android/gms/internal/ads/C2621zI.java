package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zI  reason: case insensitive filesystem */
public final class C2621zI implements Sea<C2138sI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC1646kz> f6167a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f6168b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1099dB> f6169c;
    private final _ea<RR<C1306gC>> d;

    public C2621zI(_ea<AbstractC1646kz> _ea, _ea<VW> _ea2, _ea<C1099dB> _ea3, _ea<RR<C1306gC>> _ea4) {
        this.f6167a = _ea;
        this.f6168b = _ea2;
        this.f6169c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2138sI(this.f6167a.get(), this.f6168b.get(), this.f6169c.get(), this.d.get());
    }
}
