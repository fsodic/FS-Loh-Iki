package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Zt  reason: case insensitive filesystem */
public final class C0857Zt implements Sea<C0523Mx<AbstractC0624Qu>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1033cE> f3682a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3683b;

    private C0857Zt(_ea<C1033cE> _ea, _ea<Executor> _ea2) {
        this.f3682a = _ea;
        this.f3683b = _ea2;
    }

    public static C0857Zt a(_ea<C1033cE> _ea, _ea<Executor> _ea2) {
        return new C0857Zt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3682a.get(), this.f3683b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
