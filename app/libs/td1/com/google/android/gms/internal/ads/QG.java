package com.google.android.gms.internal.ads;

import android.content.Context;

public final class QG implements Sea<RG> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2912a;

    private QG(_ea<Context> _ea) {
        this.f2912a = _ea;
    }

    public static QG a(_ea<Context> _ea) {
        return new QG(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new RG(this.f2912a.get());
    }
}
