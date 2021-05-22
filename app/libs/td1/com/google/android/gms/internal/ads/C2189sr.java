package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.sr  reason: case insensitive filesystem */
public final class C2189sr implements Sea<C1983pr> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5558a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1490ila> f5559b;

    private C2189sr(_ea<Context> _ea, _ea<C1490ila> _ea2) {
        this.f5558a = _ea;
        this.f5559b = _ea2;
    }

    public static C2189sr a(_ea<Context> _ea, _ea<C1490ila> _ea2) {
        return new C2189sr(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1983pr(this.f5558a.get(), this.f5559b.get());
    }
}
