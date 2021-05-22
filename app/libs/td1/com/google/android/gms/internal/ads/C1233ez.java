package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.ez  reason: case insensitive filesystem */
public final class C1233ez implements Sea<C1027bz> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2037qj> f4264a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f4265b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C2243tj> f4266c;
    private final _ea<View> d;
    private final _ea<Oma.a> e;

    private C1233ez(_ea<C2037qj> _ea, _ea<Context> _ea2, _ea<C2243tj> _ea3, _ea<View> _ea4, _ea<Oma.a> _ea5) {
        this.f4264a = _ea;
        this.f4265b = _ea2;
        this.f4266c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static C1233ez a(_ea<C2037qj> _ea, _ea<Context> _ea2, _ea<C2243tj> _ea3, _ea<View> _ea4, _ea<Oma.a> _ea5) {
        return new C1233ez(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1027bz(this.f4264a.get(), this.f4265b.get(), this.f4266c.get(), this.d.get(), this.e.get());
    }
}
