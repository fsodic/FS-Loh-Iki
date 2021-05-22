package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.iE  reason: case insensitive filesystem */
public final class C1446iE implements Sea<C0523Mx<AbstractC0261Cv>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1170eE> f4547a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4548b;

    private C1446iE(_ea<C1170eE> _ea, _ea<Executor> _ea2) {
        this.f4547a = _ea;
        this.f4548b = _ea2;
    }

    public static C1446iE a(_ea<C1170eE> _ea, _ea<Executor> _ea2) {
        return new C1446iE(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4547a.get(), this.f4548b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
