package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class AD implements Sea<C0523Mx<AbstractC1229ev>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<HD> f1486a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f1487b;

    private AD(_ea<HD> _ea, _ea<Executor> _ea2) {
        this.f1486a = _ea;
        this.f1487b = _ea2;
    }

    public static AD a(_ea<HD> _ea, _ea<Executor> _ea2) {
        return new AD(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f1486a.get(), this.f1487b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
