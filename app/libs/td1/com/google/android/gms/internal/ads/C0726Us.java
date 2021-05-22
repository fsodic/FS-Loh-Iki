package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Us  reason: case insensitive filesystem */
public final class C0726Us implements Sea<C0648Rs> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1941pR> f3298a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1160dv> f3299b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0365Gv> f3300c;

    private C0726Us(_ea<C1941pR> _ea, _ea<C1160dv> _ea2, _ea<C0365Gv> _ea3) {
        this.f3298a = _ea;
        this.f3299b = _ea2;
        this.f3300c = _ea3;
    }

    public static C0726Us a(_ea<C1941pR> _ea, _ea<C1160dv> _ea2, _ea<C0365Gv> _ea3) {
        return new C0726Us(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0648Rs(this.f3298a.get(), this.f3299b.get(), this.f3300c.get());
    }
}
