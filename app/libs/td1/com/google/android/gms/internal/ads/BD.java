package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class BD implements Sea<C0523Mx<AbstractC1093cw>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<HD> f1587a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f1588b;

    private BD(_ea<HD> _ea, _ea<Executor> _ea2) {
        this.f1587a = _ea;
        this.f1588b = _ea2;
    }

    public static BD a(_ea<HD> _ea, _ea<Executor> _ea2) {
        return new BD(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f1587a.get(), this.f1588b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
