package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vt  reason: case insensitive filesystem */
public final class C2398vt implements Sea<C0523Mx<AbstractC0391Hv>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0625Qv> f5852a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f5853b;

    private C2398vt(_ea<C0625Qv> _ea, _ea<Executor> _ea2) {
        this.f5852a = _ea;
        this.f5853b = _ea2;
    }

    public static C2398vt a(_ea<C0625Qv> _ea, _ea<Executor> _ea2) {
        return new C2398vt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f5852a.get(), this.f5853b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
