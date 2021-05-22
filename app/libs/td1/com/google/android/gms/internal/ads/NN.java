package com.google.android.gms.internal.ads;

import android.content.Context;

public final class NN implements Sea<LN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2243tj> f2658a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f2659b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Context> f2660c;

    private NN(_ea<C2243tj> _ea, _ea<VW> _ea2, _ea<Context> _ea3) {
        this.f2658a = _ea;
        this.f2659b = _ea2;
        this.f2660c = _ea3;
    }

    public static NN a(_ea<C2243tj> _ea, _ea<VW> _ea2, _ea<Context> _ea3) {
        return new NN(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new LN(this.f2658a.get(), this.f2659b.get(), this.f2660c.get());
    }
}
