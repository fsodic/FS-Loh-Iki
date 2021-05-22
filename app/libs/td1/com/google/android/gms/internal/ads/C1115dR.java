package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.dR  reason: case insensitive filesystem */
public final class C1115dR implements Sea<BinderC1046cR> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f4075a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VQ> f4076b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Context> f4077c;
    private final _ea<C2560yQ> d;
    private final _ea<AR> e;

    public C1115dR(_ea<String> _ea, _ea<VQ> _ea2, _ea<Context> _ea3, _ea<C2560yQ> _ea4, _ea<AR> _ea5) {
        this.f4075a = _ea;
        this.f4076b = _ea2;
        this.f4077c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC1046cR(this.f4075a.get(), this.f4076b.get(), this.f4077c.get(), this.d.get(), this.e.get());
    }
}
