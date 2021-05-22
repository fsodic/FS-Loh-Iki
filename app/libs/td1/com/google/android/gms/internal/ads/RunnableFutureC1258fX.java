package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fX  reason: case insensitive filesystem */
public final class RunnableFutureC1258fX<V> extends DW<V> implements RunnableFuture<V> {
    private volatile RW<?> h;

    RunnableFutureC1258fX(AbstractC2083rW<V> rWVar) {
        this.h = new C1465iX(this, rWVar);
    }

    private RunnableFutureC1258fX(Callable<V> callable) {
        this.h = new C1396hX(this, callable);
    }

    static <V> RunnableFutureC1258fX<V> a(Runnable runnable, V v) {
        return new RunnableFutureC1258fX<>(Executors.callable(runnable, v));
    }

    static <V> RunnableFutureC1258fX<V> a(Callable<V> callable) {
        return new RunnableFutureC1258fX<>(callable);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final void b() {
        RW<?> rw;
        super.b();
        if (e() && (rw = this.h) != null) {
            rw.a();
        }
        this.h = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final String d() {
        RW<?> rw = this.h;
        if (rw == null) {
            return super.d();
        }
        String valueOf = String.valueOf(rw);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        RW<?> rw = this.h;
        if (rw != null) {
            rw.run();
        }
        this.h = null;
    }
}
