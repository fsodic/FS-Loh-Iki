package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.xL  reason: case insensitive filesystem */
public final class C2486xL implements Sea<C2348vL> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f5970a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5971b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f5972c;
    private final _ea<ViewGroup> d;

    public C2486xL(_ea<VW> _ea, _ea<Context> _ea2, _ea<GR> _ea3, _ea<ViewGroup> _ea4) {
        this.f5970a = _ea;
        this.f5971b = _ea2;
        this.f5972c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2348vL(this.f5970a.get(), this.f5971b.get(), this.f5972c.get(), this.d.get());
    }
}
