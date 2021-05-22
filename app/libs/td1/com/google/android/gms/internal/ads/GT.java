package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class GT implements Sea<BT> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f2040a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f2041b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AT> f2042c;

    private GT(_ea<VW> _ea, _ea<ScheduledExecutorService> _ea2, _ea<AT> _ea3) {
        this.f2040a = _ea;
        this.f2041b = _ea2;
        this.f2042c = _ea3;
    }

    public static GT a(_ea<VW> _ea, _ea<ScheduledExecutorService> _ea2, _ea<AT> _ea3) {
        return new GT(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BT(this.f2040a.get(), this.f2041b.get(), this.f2042c.get());
    }
}
