package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bm  reason: case insensitive filesystem */
final class ExecutorC1010bm implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f3935a = new HandlerC1970pk(Looper.getMainLooper());

    ExecutorC1010bm() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                q.c();
                C2452wk.a(q.g().a(), th);
                throw th;
            }
        } else {
            this.f3935a.post(runnable);
        }
    }
}
