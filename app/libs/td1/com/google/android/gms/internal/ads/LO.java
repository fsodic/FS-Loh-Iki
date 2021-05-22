package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class LO implements Sea<HO> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0743Vj> f2482a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Integer> f2483b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Context> f2484c;
    private final _ea<C0847Zj> d;
    private final _ea<ScheduledExecutorService> e;
    private final _ea<Executor> f;

    public LO(_ea<AbstractC0743Vj> _ea, _ea<Integer> _ea2, _ea<Context> _ea3, _ea<C0847Zj> _ea4, _ea<ScheduledExecutorService> _ea5, _ea<Executor> _ea6) {
        this.f2482a = _ea;
        this.f2483b = _ea2;
        this.f2484c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new HO(this.f2482a.get(), this.f2483b.get().intValue(), this.f2484c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
