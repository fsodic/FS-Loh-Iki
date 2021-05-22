package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qM  reason: case insensitive filesystem */
public final class C2005qM implements Sea<C1867oM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f5308a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5309b;

    private C2005qM(_ea<VW> _ea, _ea<Context> _ea2) {
        this.f5308a = _ea;
        this.f5309b = _ea2;
    }

    public static C2005qM a(_ea<VW> _ea, _ea<Context> _ea2) {
        return new C2005qM(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1867oM(this.f5308a.get(), this.f5309b.get());
    }
}
