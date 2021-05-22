package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.hT  reason: case insensitive filesystem */
public final class C1392hT implements Sea<ScheduledExecutorService> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<ThreadFactory> f4479a;

    public C1392hT(_ea<ThreadFactory> _ea) {
        this.f4479a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, this.f4479a.get());
        Xea.a(scheduledThreadPoolExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return scheduledThreadPoolExecutor;
    }
}
