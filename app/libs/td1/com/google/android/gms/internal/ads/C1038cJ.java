package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.cJ  reason: case insensitive filesystem */
public final class C1038cJ implements Sea<C0969bJ> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3981a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<CC> f3982b;

    public C1038cJ(_ea<Context> _ea, _ea<CC> _ea2) {
        this.f3981a = _ea;
        this.f3982b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0969bJ(this.f3981a.get(), this.f3982b.get());
    }
}
