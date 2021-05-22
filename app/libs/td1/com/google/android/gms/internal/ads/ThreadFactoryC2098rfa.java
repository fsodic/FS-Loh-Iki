package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.rfa  reason: case insensitive filesystem */
public final class ThreadFactoryC2098rfa implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f5436a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f5437b = new AtomicInteger(1);

    ThreadFactoryC2098rfa() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5436a.newThread(runnable);
        int andIncrement = this.f5437b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
