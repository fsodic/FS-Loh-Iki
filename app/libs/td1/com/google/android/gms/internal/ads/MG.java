package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class MG implements Sea<C0523Mx<AbstractC0650Ru>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<YG> f2569a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2570b;

    private MG(_ea<YG> _ea, _ea<Executor> _ea2) {
        this.f2569a = _ea;
        this.f2570b = _ea2;
    }

    public static MG a(_ea<YG> _ea, _ea<Executor> _ea2) {
        return new MG(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f2569a.get(), this.f2570b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
