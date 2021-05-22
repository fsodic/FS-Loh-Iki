package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class RB implements Sea<JB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f2988a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0335Fr> f2989b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0601Px> f2990c;

    public RB(_ea<Executor> _ea, _ea<C0335Fr> _ea2, _ea<C0601Px> _ea3) {
        this.f2988a = _ea;
        this.f2989b = _ea2;
        this.f2990c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new JB(this.f2988a.get(), this.f2989b.get(), this.f2990c.get());
    }
}
