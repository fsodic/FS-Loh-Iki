package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.hH  reason: case insensitive filesystem */
public final class C1380hH implements Sea<C1036cH> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f4459a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2055qu> f4460b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<_G> f4461c;
    private final _ea<TG> d;

    private C1380hH(_ea<Context> _ea, _ea<C2055qu> _ea2, _ea<_G> _ea3, _ea<TG> _ea4) {
        this.f4459a = _ea;
        this.f4460b = _ea2;
        this.f4461c = _ea3;
        this.d = _ea4;
    }

    public static C1380hH a(_ea<Context> _ea, _ea<C2055qu> _ea2, _ea<_G> _ea3, _ea<TG> _ea4) {
        return new C1380hH(_ea, _ea2, _ea3, _ea4);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1036cH(this.f4459a.get(), this.f4460b.get(), this.f4461c.get(), this.d.get());
    }
}
