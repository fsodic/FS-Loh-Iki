package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Wt  reason: case insensitive filesystem */
public final class C0779Wt implements Sea<C0523Mx<AbstractC0520Mu>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0955aw> f3466a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3467b;

    private C0779Wt(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        this.f3466a = _ea;
        this.f3467b = _ea2;
    }

    public static C0779Wt a(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        return new C0779Wt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3466a.get(), this.f3467b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
