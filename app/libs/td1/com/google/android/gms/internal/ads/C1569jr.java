package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jr  reason: case insensitive filesystem */
public final class C1569jr implements Sea<C1432hr> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f4730a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4731b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f4732c;
    private final _ea<BR> d;
    private final _ea<C1941pR> e;
    private final _ea<LT> f;
    private final _ea<View> g;
    private final _ea<C1955pca> h;
    private final _ea<Z> i;

    private C1569jr(_ea<Context> _ea, _ea<Executor> _ea2, _ea<ScheduledExecutorService> _ea3, _ea<BR> _ea4, _ea<C1941pR> _ea5, _ea<LT> _ea6, _ea<View> _ea7, _ea<C1955pca> _ea8, _ea<Z> _ea9) {
        this.f4730a = _ea;
        this.f4731b = _ea2;
        this.f4732c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
    }

    public static C1569jr a(_ea<Context> _ea, _ea<Executor> _ea2, _ea<ScheduledExecutorService> _ea3, _ea<BR> _ea4, _ea<C1941pR> _ea5, _ea<LT> _ea6, _ea<View> _ea7, _ea<C1955pca> _ea8, _ea<Z> _ea9) {
        return new C1569jr(_ea, _ea2, _ea3, _ea4, _ea5, _ea6, _ea7, _ea8, _ea9);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1432hr(this.f4730a.get(), this.f4731b.get(), this.f4732c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
