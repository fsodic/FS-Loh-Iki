package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class MF implements Sea<IF> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<GR> f2566a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1103dF> f2567b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<VW> f2568c;
    private final _ea<ScheduledExecutorService> d;
    private final _ea<_G> e;

    private MF(_ea<GR> _ea, _ea<C1103dF> _ea2, _ea<VW> _ea3, _ea<ScheduledExecutorService> _ea4, _ea<_G> _ea5) {
        this.f2566a = _ea;
        this.f2567b = _ea2;
        this.f2568c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static MF a(_ea<GR> _ea, _ea<C1103dF> _ea2, _ea<VW> _ea3, _ea<ScheduledExecutorService> _ea4, _ea<_G> _ea5) {
        return new MF(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new IF(this.f2566a.get(), this.f2567b.get(), this.f2568c.get(), this.d.get(), this.e.get());
    }
}
