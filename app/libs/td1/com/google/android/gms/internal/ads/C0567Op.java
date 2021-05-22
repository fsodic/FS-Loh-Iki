package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Op  reason: case insensitive filesystem */
public final class C0567Op implements Sea<RR<C1306gC>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<CallableC2063rC> f2791a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f2792b;

    public C0567Op(_ea<CallableC2063rC> _ea, _ea<VW> _ea2) {
        this.f2791a = _ea;
        this.f2792b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        RR rr = new RR(this.f2791a.get(), this.f2792b.get());
        Xea.a(rr, "Cannot return null from a non-@Nullable @Provides method");
        return rr;
    }
}
