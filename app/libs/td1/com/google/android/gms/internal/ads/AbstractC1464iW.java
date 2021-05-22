package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.iW  reason: case insensitive filesystem */
public abstract class AbstractC1464iW extends AbstractExecutorService implements VW {
    @Override // com.google.android.gms.internal.ads.VW
    /* renamed from: a */
    public final SW<?> submit(Runnable runnable) {
        return (SW) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.VW
    /* renamed from: a */
    public final <T> SW<T> submit(Callable<T> callable) {
        return (SW) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return RunnableFutureC1258fX.a(runnable, (Object) t);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return RunnableFutureC1258fX.a((Callable) callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (SW) super.submit(runnable, obj);
    }
}
