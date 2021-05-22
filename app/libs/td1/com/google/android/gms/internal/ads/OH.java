package com.google.android.gms.internal.ads;

import android.content.Context;

public final class OH implements Sea<KH> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2731a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC2466ws> f2732b;

    public OH(_ea<Context> _ea, _ea<AbstractC2466ws> _ea2) {
        this.f2731a = _ea;
        this.f2732b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new KH(this.f2731a.get(), this.f2732b.get());
    }
}
