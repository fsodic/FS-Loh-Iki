package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tA  reason: case insensitive filesystem */
public final class C2199tA implements Sea<C1924pA> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC1901ok> f5577a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<GR> f5578b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0811Xz> f5579c;
    private final _ea<C0707Tz> d;
    private final _ea<C2475xA> e;
    private final _ea<FA> f;
    private final _ea<Executor> g;
    private final _ea<Executor> h;
    private final _ea<C0681Sz> i;

    private C2199tA(_ea<AbstractC1901ok> _ea, _ea<GR> _ea2, _ea<C0811Xz> _ea3, _ea<C0707Tz> _ea4, _ea<C2475xA> _ea5, _ea<FA> _ea6, _ea<Executor> _ea7, _ea<Executor> _ea8, _ea<C0681Sz> _ea9) {
        this.f5577a = _ea;
        this.f5578b = _ea2;
        this.f5579c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
    }

    public static C2199tA a(_ea<AbstractC1901ok> _ea, _ea<GR> _ea2, _ea<C0811Xz> _ea3, _ea<C0707Tz> _ea4, _ea<C2475xA> _ea5, _ea<FA> _ea6, _ea<Executor> _ea7, _ea<Executor> _ea8, _ea<C0681Sz> _ea9) {
        return new C2199tA(_ea, _ea2, _ea3, _ea4, _ea5, _ea6, _ea7, _ea8, _ea9);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1924pA(this.f5577a.get(), this.f5578b.get(), this.f5579c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
