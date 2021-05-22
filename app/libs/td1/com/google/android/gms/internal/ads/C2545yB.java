package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.yB  reason: case insensitive filesystem */
public final class C2545yB implements Sea<C1374hB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f6049a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1030cB> f6050b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1955pca> f6051c;
    private final _ea<C0823Yl> d;
    private final _ea<a> e;
    private final _ea<Dma> f;
    private final _ea<Executor> g;
    private final _ea<GR> h;
    private final _ea<EB> i;
    private final _ea<ScheduledExecutorService> j;

    public C2545yB(_ea<Context> _ea, _ea<C1030cB> _ea2, _ea<C1955pca> _ea3, _ea<C0823Yl> _ea4, _ea<a> _ea5, _ea<Dma> _ea6, _ea<Executor> _ea7, _ea<GR> _ea8, _ea<EB> _ea9, _ea<ScheduledExecutorService> _ea10) {
        this.f6049a = _ea;
        this.f6050b = _ea2;
        this.f6051c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
        this.j = _ea10;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1374hB(this.f6049a.get(), this.f6050b.get(), this.f6051c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
