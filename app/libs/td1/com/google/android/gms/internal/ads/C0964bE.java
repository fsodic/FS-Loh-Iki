package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.bE  reason: case insensitive filesystem */
public final class C0964bE implements Sea<C1033cE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3873a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<OR> f3874b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1859oE> f3875c;
    private final _ea<BR> d;
    private final _ea<C1941pR> e;

    private C0964bE(_ea<Context> _ea, _ea<OR> _ea2, _ea<C1859oE> _ea3, _ea<BR> _ea4, _ea<C1941pR> _ea5) {
        this.f3873a = _ea;
        this.f3874b = _ea2;
        this.f3875c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static C0964bE a(_ea<Context> _ea, _ea<OR> _ea2, _ea<C1859oE> _ea3, _ea<BR> _ea4, _ea<C1941pR> _ea5) {
        return new C0964bE(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1033cE(this.f3873a.get(), this.f3874b.get(), this.f3875c.get(), this.d.get(), this.e.get());
    }
}
