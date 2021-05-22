package com.google.android.gms.internal.ads;

import android.content.Context;

public final class FO implements Sea<DO> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0793Xh> f1953a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f1954b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<String> f1955c;
    private final _ea<VW> d;

    public FO(_ea<AbstractC0793Xh> _ea, _ea<Context> _ea2, _ea<String> _ea3, _ea<VW> _ea4) {
        this.f1953a = _ea;
        this.f1954b = _ea2;
        this.f1955c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new DO(this.f1953a.get(), this.f1954b.get(), this.f1955c.get(), this.d.get());
    }
}
