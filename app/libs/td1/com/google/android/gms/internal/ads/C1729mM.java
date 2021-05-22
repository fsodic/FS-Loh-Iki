package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.mM  reason: case insensitive filesystem */
public final class C1729mM implements Sea<C1454iM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f4938a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f4939b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f4940c;

    private C1729mM(_ea<Context> _ea, _ea<ScheduledExecutorService> _ea2, _ea<Executor> _ea3) {
        this.f4938a = _ea;
        this.f4939b = _ea2;
        this.f4940c = _ea3;
    }

    public static C1729mM a(_ea<Context> _ea, _ea<ScheduledExecutorService> _ea2, _ea<Executor> _ea3) {
        return new C1729mM(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1454iM(this.f4938a.get(), this.f4939b.get(), this.f4940c.get());
    }
}
