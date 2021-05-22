package com.google.android.gms.common.util.a;

import android.os.Handler;
import android.os.Looper;
import b.c.b.a.d.c.d;
import java.util.concurrent.Executor;

public class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f1395a;

    public a(Looper looper) {
        this.f1395a = new d(looper);
    }

    public void execute(Runnable runnable) {
        this.f1395a.post(runnable);
    }
}
