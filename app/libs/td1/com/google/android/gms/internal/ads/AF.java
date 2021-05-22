package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class AF implements Sea<C2549yF> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f1489a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f1490b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<UF> f1491c;
    private final _ea<BinderC2067rG> d;

    public AF(_ea<ScheduledExecutorService> _ea, _ea<VW> _ea2, _ea<UF> _ea3, _ea<BinderC2067rG> _ea4) {
        this.f1489a = _ea;
        this.f1490b = _ea2;
        this.f1491c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2549yF(this.f1489a.get(), this.f1490b.get(), this.f1491c.get(), Oea.b(this.d));
    }
}
