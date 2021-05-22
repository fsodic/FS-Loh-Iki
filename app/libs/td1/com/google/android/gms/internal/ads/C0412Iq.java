package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Iq  reason: case insensitive filesystem */
public final class C0412Iq implements Sea<BinderC0282Dq> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2282a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f2283b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1789nD> f2284c;
    private final _ea<AbstractC1862oH<SR, YH>> d;
    private final _ea<C1314gK> e;
    private final _ea<PE> f;
    private final _ea<C2243tj> g;
    private final _ea<C1927pD> h;

    public C0412Iq(_ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<C1789nD> _ea3, _ea<AbstractC1862oH<SR, YH>> _ea4, _ea<C1314gK> _ea5, _ea<PE> _ea6, _ea<C2243tj> _ea7, _ea<C1927pD> _ea8) {
        this.f2282a = _ea;
        this.f2283b = _ea2;
        this.f2284c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC0282Dq(this.f2282a.get(), this.f2283b.get(), this.f2284c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
