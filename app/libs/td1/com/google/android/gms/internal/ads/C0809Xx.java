package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xx  reason: case insensitive filesystem */
public final class C0809Xx implements Sea<C0731Ux> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1941pR> f3529a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<LT> f3530b;

    private C0809Xx(_ea<C1941pR> _ea, _ea<LT> _ea2) {
        this.f3529a = _ea;
        this.f3530b = _ea2;
    }

    public static C0809Xx a(_ea<C1941pR> _ea, _ea<LT> _ea2) {
        return new C0809Xx(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0731Ux(this.f3529a.get(), this.f3530b.get());
    }
}
