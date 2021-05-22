package com.google.android.gms.internal.ads;

import android.content.Context;

public final class RN implements Sea<PN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f3004a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f3005b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0823Yl> f3006c;

    private RN(_ea<VW> _ea, _ea<Context> _ea2, _ea<C0823Yl> _ea3) {
        this.f3004a = _ea;
        this.f3005b = _ea2;
        this.f3006c = _ea3;
    }

    public static RN a(_ea<VW> _ea, _ea<Context> _ea2, _ea<C0823Yl> _ea3) {
        return new RN(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new PN(this.f3004a.get(), this.f3005b.get(), this.f3006c.get());
    }
}
