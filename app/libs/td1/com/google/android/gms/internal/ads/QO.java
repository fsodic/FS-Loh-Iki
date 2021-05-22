package com.google.android.gms.internal.ads;

import android.content.Context;

public final class QO implements Sea<OO> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2933a;

    public QO(_ea<Context> _ea) {
        this.f2933a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new OO(this.f2933a.get());
    }
}
