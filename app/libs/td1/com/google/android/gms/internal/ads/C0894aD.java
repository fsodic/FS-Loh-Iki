package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;

/* renamed from: com.google.android.gms.internal.ads.aD  reason: case insensitive filesystem */
public final class C0894aD implements Sea<MC> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2115ro> f3783a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f3784b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f3785c;
    private final _ea<C1955pca> d;
    private final _ea<C0823Yl> e;
    private final _ea<a> f;
    private final _ea<Dma> g;
    private final _ea<C0729Uv> h;
    private final _ea<C1645ky> i;

    private C0894aD(_ea<C2115ro> _ea, _ea<Context> _ea2, _ea<GR> _ea3, _ea<C1955pca> _ea4, _ea<C0823Yl> _ea5, _ea<a> _ea6, _ea<Dma> _ea7, _ea<C0729Uv> _ea8, _ea<C1645ky> _ea9) {
        this.f3783a = _ea;
        this.f3784b = _ea2;
        this.f3785c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
    }

    public static C0894aD a(_ea<C2115ro> _ea, _ea<Context> _ea2, _ea<GR> _ea3, _ea<C1955pca> _ea4, _ea<C0823Yl> _ea5, _ea<a> _ea6, _ea<Dma> _ea7, _ea<C0729Uv> _ea8, _ea<C1645ky> _ea9) {
        return new C0894aD(_ea, _ea2, _ea3, _ea4, _ea5, _ea6, _ea7, _ea8, _ea9);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new MC(this.f3783a.get(), this.f3784b.get(), this.f3785c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
