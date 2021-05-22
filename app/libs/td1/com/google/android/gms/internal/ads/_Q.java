package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class _Q implements Sea<VQ> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3718a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3719b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC0229Bp> f3720c;
    private final _ea<AbstractC1940pQ<CC, C2615zC>> d;
    private final _ea<C2560yQ> e;
    private final _ea<IR> f;
    private final _ea<AR> g;

    public _Q(_ea<Context> _ea, _ea<Executor> _ea2, _ea<AbstractC0229Bp> _ea3, _ea<AbstractC1940pQ<CC, C2615zC>> _ea4, _ea<C2560yQ> _ea5, _ea<IR> _ea6, _ea<AR> _ea7) {
        this.f3718a = _ea;
        this.f3719b = _ea2;
        this.f3720c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new VQ(this.f3718a.get(), this.f3719b.get(), this.f3720c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
