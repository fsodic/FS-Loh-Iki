package com.google.android.gms.internal.ads;

import android.content.Context;

public final class PO implements Sea<NO> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC2112rma> f2825a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f2826b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Context> f2827c;

    public PO(_ea<AbstractC2112rma> _ea, _ea<VW> _ea2, _ea<Context> _ea3) {
        this.f2825a = _ea;
        this.f2826b = _ea2;
        this.f2827c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new NO(this.f2825a.get(), this.f2826b.get(), this.f2827c.get());
    }
}
