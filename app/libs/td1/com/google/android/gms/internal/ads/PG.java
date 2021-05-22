package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class PG implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<YG> f2809a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2810b;

    private PG(_ea<YG> _ea, _ea<Executor> _ea2) {
        this.f2809a = _ea;
        this.f2810b = _ea2;
    }

    public static PG a(_ea<YG> _ea, _ea<Executor> _ea2) {
        return new PG(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2809a.get(), this.f2810b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
