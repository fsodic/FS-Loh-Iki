package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.a.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.ka  reason: case insensitive filesystem */
public final class C0157ka {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f1277a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("GAC_Transform"));

    public static ExecutorService a() {
        return f1277a;
    }
}
