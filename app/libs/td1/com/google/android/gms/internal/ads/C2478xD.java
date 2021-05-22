package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xD  reason: case insensitive filesystem */
public final class C2478xD implements Sea<C0523Mx<AbstractC0650Ru>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<HD> f5953a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f5954b;

    private C2478xD(_ea<HD> _ea, _ea<Executor> _ea2) {
        this.f5953a = _ea;
        this.f5954b = _ea2;
    }

    public static C2478xD a(_ea<HD> _ea, _ea<Executor> _ea2) {
        return new C2478xD(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f5953a.get(), this.f5954b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
