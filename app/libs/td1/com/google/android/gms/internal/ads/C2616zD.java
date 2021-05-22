package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zD  reason: case insensitive filesystem */
public final class C2616zD implements Sea<C0523Mx<AbstractC0860Zw>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<HD> f6159a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f6160b;

    private C2616zD(_ea<HD> _ea, _ea<Executor> _ea2) {
        this.f6159a = _ea;
        this.f6160b = _ea2;
    }

    public static C2616zD a(_ea<HD> _ea, _ea<Executor> _ea2) {
        return new C2616zD(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f6159a.get(), this.f6160b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
