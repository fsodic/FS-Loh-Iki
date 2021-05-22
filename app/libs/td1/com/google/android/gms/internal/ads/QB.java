package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class QB implements Sea<EB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<GR> f2904a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2905b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<MC> f2906c;

    public QB(_ea<GR> _ea, _ea<Executor> _ea2, _ea<MC> _ea3) {
        this.f2904a = _ea;
        this.f2905b = _ea2;
        this.f2906c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new EB(this.f2904a.get(), this.f2905b.get(), this.f2906c.get());
    }
}
