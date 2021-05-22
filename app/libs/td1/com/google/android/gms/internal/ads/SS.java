package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class SS implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f3086a = new AtomicInteger(1);

    SS() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f3086a.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
