package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.bF  reason: case insensitive filesystem */
public final class C0965bF implements Sea<PE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f3876a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f3877b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<WeakReference<Context>> f3878c;
    private final _ea<Executor> d;
    private final _ea<C1789nD> e;
    private final _ea<ScheduledExecutorService> f;
    private final _ea<C2617zE> g;
    private final _ea<C0823Yl> h;

    public C0965bF(_ea<Executor> _ea, _ea<Context> _ea2, _ea<WeakReference<Context>> _ea3, _ea<Executor> _ea4, _ea<C1789nD> _ea5, _ea<ScheduledExecutorService> _ea6, _ea<C2617zE> _ea7, _ea<C0823Yl> _ea8) {
        this.f3876a = _ea;
        this.f3877b = _ea2;
        this.f3878c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new PE(this.f3876a.get(), this.f3877b.get(), this.f3878c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
