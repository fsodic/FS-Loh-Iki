package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.tO  reason: case insensitive filesystem */
public final class C2213tO implements Sea<C2144sO> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0743Vj> f5602a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5603b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f5604c;
    private final _ea<Executor> d;

    public C2213tO(_ea<AbstractC0743Vj> _ea, _ea<Context> _ea2, _ea<ScheduledExecutorService> _ea3, _ea<Executor> _ea4) {
        this.f5602a = _ea;
        this.f5603b = _ea2;
        this.f5604c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2144sO(this.f5602a.get(), this.f5603b.get(), this.f5604c.get(), this.d.get());
    }
}
