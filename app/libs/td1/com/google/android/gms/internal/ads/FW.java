package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class FW<V> extends AbstractC2496xV implements Future<V> {
    protected FW() {
    }

    /* access modifiers changed from: protected */
    public abstract Future<? extends V> b();

    public boolean cancel(boolean z) {
        return b().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return (V) b().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return (V) b().get(j, timeUnit);
    }

    public boolean isCancelled() {
        return b().isCancelled();
    }

    public boolean isDone() {
        return b().isDone();
    }
}
