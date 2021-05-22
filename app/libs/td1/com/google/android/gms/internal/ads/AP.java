package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class AP implements Sea<C2283uP> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f1507a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f1508b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC0229Bp> f1509c;
    private final _ea<AbstractC1940pQ<AbstractC0569Or, C0725Ur>> d;
    private final _ea<MP> e;
    private final _ea<IR> f;

    public AP(_ea<Context> _ea, _ea<Executor> _ea2, _ea<AbstractC0229Bp> _ea3, _ea<AbstractC1940pQ<AbstractC0569Or, C0725Ur>> _ea4, _ea<MP> _ea5, _ea<IR> _ea6) {
        this.f1507a = _ea;
        this.f1508b = _ea2;
        this.f1509c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2283uP(this.f1507a.get(), this.f1508b.get(), this.f1509c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
