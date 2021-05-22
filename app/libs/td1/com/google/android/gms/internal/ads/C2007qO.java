package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qO  reason: case insensitive filesystem */
public final class C2007qO implements Sea<C1869oO> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f5312a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5313b;

    private C2007qO(_ea<VW> _ea, _ea<Context> _ea2) {
        this.f5312a = _ea;
        this.f5313b = _ea2;
    }

    public static C2007qO a(_ea<VW> _ea, _ea<Context> _ea2) {
        return new C2007qO(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1869oO(this.f5312a.get(), this.f5313b.get());
    }
}
