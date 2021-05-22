package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Xt  reason: case insensitive filesystem */
public final class C0805Xt implements Sea<C0523Mx<Ona>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0955aw> f3526a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3527b;

    private C0805Xt(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        this.f3526a = _ea;
        this.f3527b = _ea2;
    }

    public static C0805Xt a(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        return new C0805Xt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3526a.get(), this.f3527b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
