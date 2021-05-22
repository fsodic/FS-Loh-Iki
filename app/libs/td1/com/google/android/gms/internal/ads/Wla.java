package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class Wla implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Handler f3457a;

    Wla(C2044qma qma, Handler handler) {
        this.f3457a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f3457a.post(runnable);
    }
}
