package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2537xu;

public final class NI implements Sea<KI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0229Bp> f2648a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2537xu.a> f2649b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<TJ> f2650c;
    private final _ea<C1162dx> d;

    public NI(_ea<AbstractC0229Bp> _ea, _ea<C2537xu.a> _ea2, _ea<TJ> _ea3, _ea<C1162dx> _ea4) {
        this.f2648a = _ea;
        this.f2649b = _ea2;
        this.f2650c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new KI(this.f2648a.get(), this.f2649b.get(), this.f2650c.get(), this.d.get());
    }
}
