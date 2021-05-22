package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

public final class NT implements Sea<LT> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f2667a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0849Zl> f2668b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<OI> f2669c;
    private final _ea<C0823Yl> d;
    private final _ea<String> e;
    private final _ea<String> f;
    private final _ea<Context> g;
    private final _ea<AR> h;
    private final _ea<d> i;
    private final _ea<C1955pca> j;

    private NT(_ea<Executor> _ea, _ea<C0849Zl> _ea2, _ea<OI> _ea3, _ea<C0823Yl> _ea4, _ea<String> _ea5, _ea<String> _ea6, _ea<Context> _ea7, _ea<AR> _ea8, _ea<d> _ea9, _ea<C1955pca> _ea10) {
        this.f2667a = _ea;
        this.f2668b = _ea2;
        this.f2669c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
        this.j = _ea10;
    }

    public static NT a(_ea<Executor> _ea, _ea<C0849Zl> _ea2, _ea<OI> _ea3, _ea<C0823Yl> _ea4, _ea<String> _ea5, _ea<String> _ea6, _ea<Context> _ea7, _ea<AR> _ea8, _ea<d> _ea9, _ea<C1955pca> _ea10) {
        return new NT(_ea, _ea2, _ea3, _ea4, _ea5, _ea6, _ea7, _ea8, _ea9, _ea10);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new LT(this.f2667a.get(), this.f2668b.get(), this.f2669c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
