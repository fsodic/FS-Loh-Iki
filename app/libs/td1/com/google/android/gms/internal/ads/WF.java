package com.google.android.gms.internal.ads;

import android.content.Context;

public final class WF implements Sea<UF> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3397a;

    public WF(_ea<Context> _ea) {
        this.f3397a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new UF(this.f3397a.get());
    }
}
