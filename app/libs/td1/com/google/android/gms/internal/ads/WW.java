package com.google.android.gms.internal.ads;

final class WW implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Runnable f3425a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ XW f3426b;

    WW(XW xw, Runnable runnable) {
        this.f3426b = xw;
        this.f3425a = runnable;
    }

    public final void run() {
        this.f3426b.f3499a = false;
        this.f3425a.run();
    }

    public final String toString() {
        return this.f3425a.toString();
    }
}
