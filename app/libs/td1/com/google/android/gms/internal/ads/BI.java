package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class BI implements Sea<C2552yI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f1594a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC1646kz> f1595b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f1596c;

    public BI(_ea<Context> _ea, _ea<AbstractC1646kz> _ea2, _ea<Executor> _ea3) {
        this.f1594a = _ea;
        this.f1595b = _ea2;
        this.f1596c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2552yI(this.f1594a.get(), this.f1595b.get(), this.f1596c.get());
    }
}
