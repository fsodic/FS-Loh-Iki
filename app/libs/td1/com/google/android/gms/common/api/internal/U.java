package com.google.android.gms.common.api.internal;

import b.c.b.a.d.b.e;
import com.google.android.gms.common.util.a.b;
import java.util.concurrent.ExecutorService;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f1236a = e.a().a(2, new b("GAC_Executor"), 9);

    public static ExecutorService a() {
        return f1236a;
    }
}
