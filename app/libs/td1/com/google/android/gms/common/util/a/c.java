package com.google.android.gms.common.util.a;

import android.os.Process;

final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f1399a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1400b;

    public c(Runnable runnable, int i) {
        this.f1399a = runnable;
        this.f1400b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f1400b);
        this.f1399a.run();
    }
}
