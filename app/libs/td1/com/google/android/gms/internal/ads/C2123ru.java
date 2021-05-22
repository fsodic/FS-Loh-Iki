package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ru  reason: case insensitive filesystem */
public final class C2123ru implements Sea<C1917ou> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5470a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1941pR> f5471b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC1138dh> f5472c;

    private C2123ru(_ea<Context> _ea, _ea<C1941pR> _ea2, _ea<AbstractC1138dh> _ea3) {
        this.f5470a = _ea;
        this.f5471b = _ea2;
        this.f5472c = _ea3;
    }

    public static C2123ru a(_ea<Context> _ea, _ea<C1941pR> _ea2, _ea<AbstractC1138dh> _ea3) {
        return new C2123ru(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1917ou(this.f5470a.get(), this.f5471b.get(), this.f5472c.get());
    }
}
