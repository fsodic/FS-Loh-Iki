package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.au  reason: case insensitive filesystem */
public final class C0953au implements Sea<C0523Mx<AbstractC0391Hv>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0955aw> f3849a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3850b;

    private C0953au(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        this.f3849a = _ea;
        this.f3850b = _ea2;
    }

    public static C0953au a(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        return new C0953au(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3849a.get(), this.f3850b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
