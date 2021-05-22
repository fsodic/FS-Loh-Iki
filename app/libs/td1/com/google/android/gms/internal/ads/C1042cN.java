package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cN  reason: case insensitive filesystem */
public final class C1042cN implements Sea<_M> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f3986a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1803nR> f3987b;

    private C1042cN(_ea<VW> _ea, _ea<C1803nR> _ea2) {
        this.f3986a = _ea;
        this.f3987b = _ea2;
    }

    public static C1042cN a(_ea<VW> _ea, _ea<C1803nR> _ea2) {
        return new C1042cN(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new _M(this.f3986a.get(), this.f3987b.get());
    }
}
