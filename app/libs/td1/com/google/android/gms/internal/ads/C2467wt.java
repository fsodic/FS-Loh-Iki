package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wt  reason: case insensitive filesystem */
public final class C2467wt implements Sea<C0523Mx<AbstractC1229ev>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0625Qv> f5935a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f5936b;

    private C2467wt(_ea<C0625Qv> _ea, _ea<Executor> _ea2) {
        this.f5935a = _ea;
        this.f5936b = _ea2;
    }

    public static C2467wt a(_ea<C0625Qv> _ea, _ea<Executor> _ea2) {
        return new C2467wt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f5935a.get(), this.f5936b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
