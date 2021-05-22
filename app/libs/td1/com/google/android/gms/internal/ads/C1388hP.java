package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.hP  reason: case insensitive filesystem */
public final class C1388hP implements Sea<C1250fP> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC1206eh> f4475a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f4476b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Context> f4477c;

    public C1388hP(_ea<AbstractC1206eh> _ea, _ea<ScheduledExecutorService> _ea2, _ea<Context> _ea3) {
        this.f4475a = _ea;
        this.f4476b = _ea2;
        this.f4477c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1250fP(this.f4475a.get(), this.f4476b.get(), this.f4477c.get());
    }
}
