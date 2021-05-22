package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class DM implements Sea<C1803nR> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<d> f1761a;

    public DM(_ea<d> _ea) {
        this.f1761a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1803nR nRVar = new C1803nR(this.f1761a.get());
        Xea.a(nRVar, "Cannot return null from a non-@Nullable @Provides method");
        return nRVar;
    }
}
