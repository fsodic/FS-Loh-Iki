package com.google.android.gms.internal.ads;

import android.content.Context;

public final class MT implements Sea<C0556Oe> {

    /* renamed from: a  reason: collision with root package name */
    private final JT f2587a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f2588b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0823Yl> f2589c;

    public MT(JT jt, _ea<Context> _ea, _ea<C0823Yl> _ea2) {
        this.f2587a = jt;
        this.f2588b = _ea;
        this.f2589c = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0556Oe b2 = new C0322Fe().b(this.f2588b.get(), this.f2589c.get());
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
