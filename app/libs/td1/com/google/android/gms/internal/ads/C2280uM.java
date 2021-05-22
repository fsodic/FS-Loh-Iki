package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.uM  reason: case insensitive filesystem */
public final class C2280uM implements Sea<C2142sM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f5709a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5710b;

    public C2280uM(_ea<VW> _ea, _ea<Context> _ea2) {
        this.f5709a = _ea;
        this.f5710b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2142sM(this.f5709a.get(), this.f5710b.get());
    }
}
