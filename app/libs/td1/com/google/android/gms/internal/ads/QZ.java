package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

final class QZ implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ MotionEvent f2942a;

    QZ(C1810nY nYVar, MotionEvent motionEvent) {
        this.f2942a = motionEvent;
    }

    public final void run() {
        try {
            C1810nY.u.a(this.f2942a);
        } catch (Exception e) {
            C1810nY.w.a(2022, -1, e);
        }
    }
}
