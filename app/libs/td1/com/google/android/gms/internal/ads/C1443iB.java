package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iB  reason: case insensitive filesystem */
public final class C1443iB implements Sea<C1099dB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f4540a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1374hB> f4541b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C2476xB> f4542c;

    public C1443iB(_ea<VW> _ea, _ea<C1374hB> _ea2, _ea<C2476xB> _ea3) {
        this.f4540a = _ea;
        this.f4541b = _ea2;
        this.f4542c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1099dB(this.f4540a.get(), this.f4541b.get(), this.f4542c.get());
    }
}
