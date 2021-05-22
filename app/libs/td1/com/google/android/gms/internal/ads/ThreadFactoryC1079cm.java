package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cm  reason: case insensitive filesystem */
public final class ThreadFactoryC1079cm implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f4026a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4027b;

    ThreadFactoryC1079cm(String str) {
        this.f4027b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f4027b;
        int andIncrement = this.f4026a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
