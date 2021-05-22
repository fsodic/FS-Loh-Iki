package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gM  reason: case insensitive filesystem */
public final class C1316gM implements Sea<C1178eM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f4381a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<String> f4382b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0467Kt> f4383c;
    private final _ea<C0909aS> d;
    private final _ea<GR> e;

    private C1316gM(_ea<String> _ea, _ea<String> _ea2, _ea<C0467Kt> _ea3, _ea<C0909aS> _ea4, _ea<GR> _ea5) {
        this.f4381a = _ea;
        this.f4382b = _ea2;
        this.f4383c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static C1316gM a(_ea<String> _ea, _ea<String> _ea2, _ea<C0467Kt> _ea3, _ea<C0909aS> _ea4, _ea<GR> _ea5) {
        return new C1316gM(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1178eM(this.f4381a.get(), this.f4382b.get(), this.f4383c.get(), this.d.get(), this.e.get());
    }
}
