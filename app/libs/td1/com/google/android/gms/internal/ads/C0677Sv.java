package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Sv  reason: case insensitive filesystem */
public final class C0677Sv implements Sea<C0625Qv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0651Rv>>> f3138a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1941pR> f3139b;

    private C0677Sv(_ea<Set<C0523Mx<AbstractC0651Rv>>> _ea, _ea<C1941pR> _ea2) {
        this.f3138a = _ea;
        this.f3139b = _ea2;
    }

    public static C0677Sv a(_ea<Set<C0523Mx<AbstractC0651Rv>>> _ea, _ea<C1941pR> _ea2) {
        return new C0677Sv(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0625Qv(this.f3138a.get(), this.f3139b.get());
    }
}
