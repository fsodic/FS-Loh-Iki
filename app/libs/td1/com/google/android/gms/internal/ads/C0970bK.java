package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.bK  reason: case insensitive filesystem */
public final class C0970bK implements Sea<YJ> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3885a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC0524My> f3886b;

    public C0970bK(_ea<Context> _ea, _ea<AbstractC0524My> _ea2) {
        this.f3885a = _ea;
        this.f3886b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new YJ(this.f3885a.get(), this.f3886b.get());
    }
}
