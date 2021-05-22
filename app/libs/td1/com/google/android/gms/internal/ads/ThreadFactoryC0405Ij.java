package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ij  reason: case insensitive filesystem */
public final class ThreadFactoryC0405Ij implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f2260a = new AtomicInteger(1);

    ThreadFactoryC0405Ij(C2243tj tjVar) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f2260a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
