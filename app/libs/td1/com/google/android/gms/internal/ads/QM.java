package com.google.android.gms.internal.ads;

import android.content.Context;

public final class QM implements Sea<OM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2928a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f2929b;

    private QM(_ea<Context> _ea, _ea<VW> _ea2) {
        this.f2928a = _ea;
        this.f2929b = _ea2;
    }

    public static QM a(_ea<Context> _ea, _ea<VW> _ea2) {
        return new QM(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new OM(this.f2928a.get(), this.f2929b.get());
    }
}
