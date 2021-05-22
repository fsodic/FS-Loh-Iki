package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.mu  reason: case insensitive filesystem */
public final class C1779mu implements Sea<AbstractC1187eV<C1941pR, C0536Nk>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5009a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f5010b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f5011c;

    public C1779mu(_ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<GR> _ea3) {
        this.f5009a = _ea;
        this.f5010b = _ea2;
        this.f5011c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1848nu nuVar = new C1848nu(this.f5009a.get(), this.f5010b.get(), this.f5011c.get());
        Xea.a(nuVar, "Cannot return null from a non-@Nullable @Provides method");
        return nuVar;
    }
}
