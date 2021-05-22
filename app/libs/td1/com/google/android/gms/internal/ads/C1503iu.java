package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.iu  reason: case insensitive filesystem */
public final class C1503iu implements Sea<C1572ju> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f4621a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<GR> f4622b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0823Yl> f4623c;
    private final _ea<AbstractC1901ok> d;
    private final _ea<PE> e;

    private C1503iu(_ea<Context> _ea, _ea<GR> _ea2, _ea<C0823Yl> _ea3, _ea<AbstractC1901ok> _ea4, _ea<PE> _ea5) {
        this.f4621a = _ea;
        this.f4622b = _ea2;
        this.f4623c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static C1503iu a(_ea<Context> _ea, _ea<GR> _ea2, _ea<C0823Yl> _ea3, _ea<AbstractC1901ok> _ea4, _ea<PE> _ea5) {
        return new C1503iu(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1572ju(this.f4621a.get(), this.f4622b.get(), this.f4623c.get(), this.d.get(), this.e.get());
    }
}
