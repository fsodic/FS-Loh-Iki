package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.s;
import java.util.concurrent.Executor;

public final class _A implements Sea<C0523Mx<s.a>> {

    /* renamed from: a  reason: collision with root package name */
    private final VA f3691a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2339vC> f3692b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f3693c;

    public _A(VA va, _ea<C2339vC> _ea, _ea<Executor> _ea2) {
        this.f3691a = va;
        this.f3692b = _ea;
        this.f3693c = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3692b.get(), this.f3693c.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
