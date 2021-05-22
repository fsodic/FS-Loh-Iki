package com.google.android.gms.internal.ads;

import android.content.Context;

public final class KL implements Sea<IL> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2556yM<C1387hO>> f2391a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<GR> f2392b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Context> f2393c;
    private final _ea<C0847Zj> d;

    private KL(_ea<C2556yM<C1387hO>> _ea, _ea<GR> _ea2, _ea<Context> _ea3, _ea<C0847Zj> _ea4) {
        this.f2391a = _ea;
        this.f2392b = _ea2;
        this.f2393c = _ea3;
        this.d = _ea4;
    }

    public static KL a(_ea<C2556yM<C1387hO>> _ea, _ea<GR> _ea2, _ea<Context> _ea3, _ea<C0847Zj> _ea4) {
        return new KL(_ea, _ea2, _ea3, _ea4);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new IL(this.f2391a.get(), this.f2392b.get(), this.f2393c.get(), this.d.get());
    }
}
