package com.google.android.gms.common.util.a;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f1396a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1397b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f1398c;
    private final ThreadFactory d;

    public b(String str) {
        this(str, 0);
    }

    private b(String str, int i) {
        this.f1398c = new AtomicInteger();
        this.d = Executors.defaultThreadFactory();
        r.a((Object) str, (Object) "Name must not be null");
        this.f1396a = str;
        this.f1397b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.d.newThread(new c(runnable, 0));
        String str = this.f1396a;
        int andIncrement = this.f1398c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
