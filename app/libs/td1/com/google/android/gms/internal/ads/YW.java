package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class YW extends ZW implements VW, ScheduledExecutorService {

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f3565b;

    YW(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        C1945pV.a(scheduledExecutorService);
        this.f3565b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC1258fX a2 = RunnableFutureC1258fX.a(runnable, (Object) null);
        return new ScheduledFutureC0914aX(a2, this.f3565b.schedule(a2, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC1258fX a2 = RunnableFutureC1258fX.a(callable);
        return new ScheduledFutureC0914aX(a2, this.f3565b.schedule(a2, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        _W _w = new _W(runnable);
        return new ScheduledFutureC0914aX(_w, this.f3565b.scheduleAtFixedRate(_w, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        _W _w = new _W(runnable);
        return new ScheduledFutureC0914aX(_w, this.f3565b.scheduleWithFixedDelay(_w, j, j2, timeUnit));
    }
}
