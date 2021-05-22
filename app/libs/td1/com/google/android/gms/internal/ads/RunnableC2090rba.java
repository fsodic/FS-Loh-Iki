package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.ads.rba  reason: case insensitive filesystem */
final class RunnableC2090rba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f5422a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f5423b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f5424c;

    RunnableC2090rba(C1810nY nYVar, int i, int i2, int i3) {
        this.f5422a = i;
        this.f5423b = i2;
        this.f5424c = i3;
    }

    public final void run() {
        try {
            C1810nY.u.a(MotionEvent.obtain(0, (long) this.f5422a, 0, (float) this.f5423b, (float) this.f5424c, 0));
        } catch (Exception e) {
            C1810nY.w.a(2022, -1, e);
        }
    }
}
