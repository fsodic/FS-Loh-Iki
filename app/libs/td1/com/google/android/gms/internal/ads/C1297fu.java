package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fu  reason: case insensitive filesystem */
public final class C1297fu implements Sea<C0523Mx<AbstractC0548Nw>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1033cE> f4350a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4351b;

    private C1297fu(_ea<C1033cE> _ea, _ea<Executor> _ea2) {
        this.f4350a = _ea;
        this.f4351b = _ea2;
    }

    public static C1297fu a(_ea<C1033cE> _ea, _ea<Executor> _ea2) {
        return new C1297fu(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4350a.get(), this.f4351b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
