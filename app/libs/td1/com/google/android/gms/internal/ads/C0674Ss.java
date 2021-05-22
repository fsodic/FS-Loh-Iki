package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ss  reason: case insensitive filesystem */
public final class C0674Ss implements Sea<C0596Ps> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3134a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC1564jo> f3135b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1941pR> f3136c;
    private final _ea<C0823Yl> d;

    public C0674Ss(_ea<Context> _ea, _ea<AbstractC1564jo> _ea2, _ea<C1941pR> _ea3, _ea<C0823Yl> _ea4) {
        this.f3134a = _ea;
        this.f3135b = _ea2;
        this.f3136c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0596Ps(this.f3134a.get(), this.f3135b.get(), this.f3136c.get(), this.d.get());
    }
}
