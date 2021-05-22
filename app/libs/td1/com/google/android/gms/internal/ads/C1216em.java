package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.em  reason: case insensitive filesystem */
public final class C1216em extends AbstractC1464iW {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4236a;

    private C1216em(Executor executor) {
        this.f4236a = executor;
    }

    /* synthetic */ C1216em(Executor executor, ThreadFactoryC1079cm cmVar) {
        this(executor);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        this.f4236a.execute(runnable);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
