package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Yt  reason: case insensitive filesystem */
public final class C0831Yt implements Sea<C0523Mx<AbstractC0884_u>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0955aw> f3604a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3605b;

    private C0831Yt(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        this.f3604a = _ea;
        this.f3605b = _ea2;
    }

    public static C0831Yt a(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        return new C0831Yt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f3604a.get(), this.f3605b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
