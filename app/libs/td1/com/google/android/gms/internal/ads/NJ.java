package com.google.android.gms.internal.ads;

import android.content.Context;

public final class NJ implements Sea<HJ> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2651a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC2466ws> f2652b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<BT> f2653c;
    private final _ea<VW> d;
    private final _ea<S> e;

    public NJ(_ea<Context> _ea, _ea<AbstractC2466ws> _ea2, _ea<BT> _ea3, _ea<VW> _ea4, _ea<S> _ea5) {
        this.f2651a = _ea;
        this.f2652b = _ea2;
        this.f2653c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new HJ(this.f2651a.get(), this.f2652b.get(), this.f2653c.get(), this.d.get(), this.e.get());
    }
}
