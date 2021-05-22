package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.zW  reason: case insensitive filesystem */
public abstract class AbstractC2635zW<T> extends RW<T> {
    private final Executor d;
    boolean e = true;
    private final /* synthetic */ C2497xW f;

    AbstractC2635zW(C2497xW xWVar, Executor executor) {
        this.f = xWVar;
        C1945pV.a(executor);
        this.d = executor;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(T t);

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final void a(T t, Throwable th) {
        this.f.p = null;
        if (th == null) {
            a(t);
        } else if (th instanceof ExecutionException) {
            this.f.a(th.getCause());
        } else if (th instanceof CancellationException) {
            this.f.cancel(false);
        } else {
            this.f.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final boolean b() {
        return this.f.isDone();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            this.d.execute(this);
        } catch (RejectedExecutionException e2) {
            if (this.e) {
                this.f.a((Throwable) e2);
            }
        }
    }
}
