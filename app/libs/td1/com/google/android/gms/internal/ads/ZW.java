package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class ZW extends AbstractC1464iW {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f3641a;

    ZW(ExecutorService executorService) {
        C1945pV.a(executorService);
        this.f3641a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f3641a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f3641a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f3641a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f3641a.isTerminated();
    }

    public final void shutdown() {
        this.f3641a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f3641a.shutdownNow();
    }
}
