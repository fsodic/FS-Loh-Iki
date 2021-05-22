package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1120dW;

final class _W extends C1120dW.j<Void> implements Runnable {
    private final Runnable h;

    public _W(Runnable runnable) {
        C1945pV.a(runnable);
        this.h = runnable;
    }

    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            a(th);
            C2151sV.c(th);
            throw null;
        }
    }
}
