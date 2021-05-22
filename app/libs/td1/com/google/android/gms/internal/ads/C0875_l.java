package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads._l  reason: case insensitive filesystem */
public final class C0875_l {

    /* renamed from: a  reason: collision with root package name */
    public static final VW f3755a = a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), a("Default")));

    /* renamed from: b  reason: collision with root package name */
    public static final VW f3756b;

    /* renamed from: c  reason: collision with root package name */
    public static final VW f3757c;
    public static final ScheduledExecutorService d = new ScheduledThreadPoolExecutor(3, a("Schedule"));
    public static final VW e = a(new ExecutorC1010bm());
    public static final VW f = a(UW.a());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3756b = a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f3757c = a(threadPoolExecutor2);
    }

    private static VW a(Executor executor) {
        return new C1216em(executor, null);
    }

    private static ThreadFactory a(String str) {
        return new ThreadFactoryC1079cm(str);
    }
}
