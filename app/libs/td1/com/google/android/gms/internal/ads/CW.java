package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class CW<V> extends AW<V> {
    private final SW<V> h;

    CW(SW<V> sw) {
        C1945pV.a(sw);
        this.h = sw;
    }

    @Override // com.google.android.gms.internal.ads.C1120dW, com.google.android.gms.internal.ads.SW
    public final void a(Runnable runnable, Executor executor) {
        this.h.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.C1120dW
    public final boolean cancel(boolean z) {
        return this.h.cancel(z);
    }

    @Override // java.util.concurrent.Future, com.google.android.gms.internal.ads.C1120dW
    public final V get() {
        return this.h.get();
    }

    @Override // java.util.concurrent.Future, com.google.android.gms.internal.ads.C1120dW
    public final V get(long j, TimeUnit timeUnit) {
        return this.h.get(j, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.C1120dW
    public final boolean isCancelled() {
        return this.h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.C1120dW
    public final boolean isDone() {
        return this.h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.C1120dW
    public final String toString() {
        return this.h.toString();
    }
}
