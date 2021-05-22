package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* access modifiers changed from: package-private */
public final class XW implements Executor {

    /* renamed from: a  reason: collision with root package name */
    boolean f3499a = true;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Executor f3500b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1120dW f3501c;

    XW(Executor executor, C1120dW dWVar) {
        this.f3500b = executor;
        this.f3501c = dWVar;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f3500b.execute(new WW(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.f3499a) {
                this.f3501c.a((Throwable) e);
            }
        }
    }
}
