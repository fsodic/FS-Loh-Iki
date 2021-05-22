package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class BM implements Sea<C2556yM<C1936pM>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2142sM> f1604a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<d> f1605b;

    public BM(_ea<C2142sM> _ea, _ea<d> _ea2) {
        this.f1604a = _ea;
        this.f1605b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2556yM yMVar = new C2556yM(this.f1604a.get(), 10000, this.f1605b.get());
        Xea.a(yMVar, "Cannot return null from a non-@Nullable @Provides method");
        return yMVar;
    }
}
