package com.google.android.gms.internal.ads;

import android.content.Context;

public final class SA implements Sea<TA> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC2580yf> f3056a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC0271Df> f3057b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC0297Ef> f3058c;
    private final _ea<C1160dv> d;
    private final _ea<C0494Lu> e;
    private final _ea<Context> f;
    private final _ea<C1941pR> g;
    private final _ea<C0823Yl> h;
    private final _ea<GR> i;

    public SA(_ea<AbstractC2580yf> _ea, _ea<AbstractC0271Df> _ea2, _ea<AbstractC0297Ef> _ea3, _ea<C1160dv> _ea4, _ea<C0494Lu> _ea5, _ea<Context> _ea6, _ea<C1941pR> _ea7, _ea<C0823Yl> _ea8, _ea<GR> _ea9) {
        this.f3056a = _ea;
        this.f3057b = _ea2;
        this.f3058c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new TA(this.f3056a.get(), this.f3057b.get(), this.f3058c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
