package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.es  reason: case insensitive filesystem */
public final class C1226es implements Sea<C1089cs> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0882_s> f4254a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f4255b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1872oR> f4256c;
    private final _ea<View> d;
    private final _ea<AbstractC1564jo> e;
    private final _ea<AbstractC0804Xs> f;
    private final _ea<C1098dA> g;
    private final _ea<C0627Qx> h;
    private final _ea<BinderC1658lK> i;
    private final _ea<Executor> j;

    public C1226es(_ea<C0882_s> _ea, _ea<Context> _ea2, _ea<C1872oR> _ea3, _ea<View> _ea4, _ea<AbstractC1564jo> _ea5, _ea<AbstractC0804Xs> _ea6, _ea<C1098dA> _ea7, _ea<C0627Qx> _ea8, _ea<BinderC1658lK> _ea9, _ea<Executor> _ea10) {
        this.f4254a = _ea;
        this.f4255b = _ea2;
        this.f4256c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
        this.j = _ea10;
    }

    public static C1089cs a(C0882_s _sVar, Context context, C1872oR oRVar, View view, AbstractC1564jo joVar, AbstractC0804Xs xs, C1098dA dAVar, C0627Qx qx, Lea<BinderC1658lK> lea, Executor executor) {
        return new C1089cs(_sVar, context, oRVar, view, joVar, xs, dAVar, qx, lea, executor);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4254a.get(), this.f4255b.get(), this.f4256c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), Oea.b(this.i), this.j.get());
    }
}
