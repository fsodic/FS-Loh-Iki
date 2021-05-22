package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gu  reason: case insensitive filesystem */
public final class C0364Gu implements Sea<BinderC0390Hu> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1941pR> f2086a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<String> f2087b;

    private C0364Gu(_ea<C1941pR> _ea, _ea<String> _ea2) {
        this.f2086a = _ea;
        this.f2087b = _ea2;
    }

    public static C0364Gu a(_ea<C1941pR> _ea, _ea<String> _ea2) {
        return new C0364Gu(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC0390Hu(this.f2086a.get(), this.f2087b.get());
    }
}
