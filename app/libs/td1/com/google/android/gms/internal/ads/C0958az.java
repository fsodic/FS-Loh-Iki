package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.az  reason: case insensitive filesystem */
public final class C0958az implements Sea<C0836Yy> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1160dv> f3857a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1941pR> f3858b;

    private C0958az(_ea<C1160dv> _ea, _ea<C1941pR> _ea2) {
        this.f3857a = _ea;
        this.f3858b = _ea2;
    }

    public static C0958az a(_ea<C1160dv> _ea, _ea<C1941pR> _ea2) {
        return new C0958az(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0836Yy(this.f3857a.get(), this.f3858b.get());
    }
}
