package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.lN  reason: case insensitive filesystem */
public final class C1661lN implements Sea<C1179eN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f4845a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<GR> f4846b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<PackageInfo> f4847c;
    private final _ea<AbstractC1901ok> d;

    public C1661lN(_ea<VW> _ea, _ea<GR> _ea2, _ea<PackageInfo> _ea3, _ea<AbstractC1901ok> _ea4) {
        this.f4845a = _ea;
        this.f4846b = _ea2;
        this.f4847c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1179eN(this.f4845a.get(), this.f4846b.get(), this.f4847c.get(), this.d.get());
    }
}
