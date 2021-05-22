package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class WH implements Sea<RH> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC2466ws> f3399a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2482xH> f3400b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0598Pu> f3401c;
    private final _ea<ScheduledExecutorService> d;
    private final _ea<VW> e;

    public WH(_ea<AbstractC2466ws> _ea, _ea<C2482xH> _ea2, _ea<C0598Pu> _ea3, _ea<ScheduledExecutorService> _ea4, _ea<VW> _ea5) {
        this.f3399a = _ea;
        this.f3400b = _ea2;
        this.f3401c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new RH(this.f3399a.get(), this.f3400b.get(), this.f3401c.get(), this.d.get(), this.e.get());
    }
}
