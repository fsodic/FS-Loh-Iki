package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class OG implements Sea<C0523Mx<IT>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0898aH> f2729a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2730b;

    private OG(_ea<C0898aH> _ea, _ea<Executor> _ea2) {
        this.f2729a = _ea;
        this.f2730b = _ea2;
    }

    public static OG a(_ea<C0898aH> _ea, _ea<Executor> _ea2) {
        return new OG(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2729a.get(), this.f2730b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
