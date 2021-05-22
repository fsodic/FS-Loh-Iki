package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.Zy  reason: case insensitive filesystem */
public final class C0862Zy implements Sea<C0784Wy> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3687a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC1564jo> f3688b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1941pR> f3689c;
    private final _ea<C0823Yl> d;
    private final _ea<Oma.a> e;

    private C0862Zy(_ea<Context> _ea, _ea<AbstractC1564jo> _ea2, _ea<C1941pR> _ea3, _ea<C0823Yl> _ea4, _ea<Oma.a> _ea5) {
        this.f3687a = _ea;
        this.f3688b = _ea2;
        this.f3689c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static C0862Zy a(_ea<Context> _ea, _ea<AbstractC1564jo> _ea2, _ea<C1941pR> _ea3, _ea<C0823Yl> _ea4, _ea<Oma.a> _ea5) {
        return new C0862Zy(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0784Wy(this.f3687a.get(), this.f3688b.get(), this.f3689c.get(), this.d.get(), this.e.get());
    }
}
