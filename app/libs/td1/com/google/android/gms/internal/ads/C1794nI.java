package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.nI  reason: case insensitive filesystem */
public final class C1794nI implements Sea<C1725mI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5027a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC0524My> f5028b;

    public C1794nI(_ea<Context> _ea, _ea<AbstractC0524My> _ea2) {
        this.f5027a = _ea;
        this.f5028b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1725mI(this.f5027a.get(), this.f5028b.get());
    }
}
