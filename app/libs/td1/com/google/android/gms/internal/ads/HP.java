package com.google.android.gms.internal.ads;

import android.content.Context;

public final class HP implements Sea<EP> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0229Bp> f2128a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f2129b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<String> f2130c;
    private final _ea<C2283uP> d;
    private final _ea<MP> e;
    private final _ea<C0823Yl> f;

    public HP(_ea<AbstractC0229Bp> _ea, _ea<Context> _ea2, _ea<String> _ea3, _ea<C2283uP> _ea4, _ea<MP> _ea5, _ea<C0823Yl> _ea6) {
        this.f2128a = _ea;
        this.f2129b = _ea2;
        this.f2130c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new EP(this.f2128a.get(), this.f2129b.get(), this.f2130c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
