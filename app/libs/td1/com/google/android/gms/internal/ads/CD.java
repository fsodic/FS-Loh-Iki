package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class CD implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<HD> f1673a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f1674b;

    private CD(_ea<HD> _ea, _ea<Executor> _ea2) {
        this.f1673a = _ea;
        this.f1674b = _ea2;
    }

    public static CD a(_ea<HD> _ea, _ea<Executor> _ea2) {
        return new CD(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f1673a.get(), this.f1674b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
