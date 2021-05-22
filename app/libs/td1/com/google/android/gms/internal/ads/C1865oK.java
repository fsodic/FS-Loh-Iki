package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.oK  reason: case insensitive filesystem */
public final class C1865oK implements Sea<BinderC1658lK> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5110a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC2599yoa> f5111b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f5112c;
    private final _ea<AbstractC0951as> d;

    public C1865oK(_ea<Context> _ea, _ea<AbstractC2599yoa> _ea2, _ea<GR> _ea3, _ea<AbstractC0951as> _ea4) {
        this.f5110a = _ea;
        this.f5111b = _ea2;
        this.f5112c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC1658lK(this.f5110a.get(), this.f5111b.get(), this.f5112c.get(), this.d.get());
    }
}
