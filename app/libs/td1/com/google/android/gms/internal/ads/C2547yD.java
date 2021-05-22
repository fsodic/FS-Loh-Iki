package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yD  reason: case insensitive filesystem */
public final class C2547yD implements Sea<C0523Mx<Ona>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<HD> f6053a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f6054b;

    private C2547yD(_ea<HD> _ea, _ea<Executor> _ea2) {
        this.f6053a = _ea;
        this.f6054b = _ea2;
    }

    public static C2547yD a(_ea<HD> _ea, _ea<Executor> _ea2) {
        return new C2547yD(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f6053a.get(), this.f6054b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
