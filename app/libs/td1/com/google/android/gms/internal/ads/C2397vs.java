package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vs  reason: case insensitive filesystem */
public final class C2397vs implements Sea<C0523Mx<AbstractC1835nla>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5849a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0752Vs> f5850b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f5851c;

    public C2397vs(C1433hs hsVar, _ea<C0752Vs> _ea, _ea<Executor> _ea2) {
        this.f5849a = hsVar;
        this.f5850b = _ea;
        this.f5851c = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f5850b.get(), this.f5851c.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
