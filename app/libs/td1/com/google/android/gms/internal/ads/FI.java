package com.google.android.gms.internal.ads;

import android.content.Context;

public final class FI implements Sea<AI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f1940a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC1646kz> f1941b;

    public FI(_ea<Context> _ea, _ea<AbstractC1646kz> _ea2) {
        this.f1940a = _ea;
        this.f1941b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new AI(this.f1940a.get(), this.f1941b.get());
    }
}
