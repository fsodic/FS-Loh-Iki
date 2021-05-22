package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.r;

/* renamed from: com.google.android.gms.internal.ads.wl  reason: case insensitive filesystem */
public final class C2454wl {

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f5924a = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f5925b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f5926c = 0;
    private final Object d = new Object();

    public final Handler a() {
        return this.f5925b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.d) {
            if (this.f5926c != 0) {
                r.a(this.f5924a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f5924a == null) {
                C1763mk.f("Starting the looper thread.");
                this.f5924a = new HandlerThread("LooperProvider");
                this.f5924a.start();
                this.f5925b = new _U(this.f5924a.getLooper());
                C1763mk.f("Looper thread started.");
            } else {
                C1763mk.f("Resuming the looper thread");
                this.d.notifyAll();
            }
            this.f5926c++;
            looper = this.f5924a.getLooper();
        }
        return looper;
    }
}
