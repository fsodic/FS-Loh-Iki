package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.pZ  reason: case insensitive filesystem */
final class RunnableC1949pZ implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f5236a;

    RunnableC1949pZ(C1810nY nYVar, Context context) {
        this.f5236a = context;
    }

    public final void run() {
        try {
            C1810nY.u.a(this.f5236a);
        } catch (Exception e) {
            C1810nY.w.a(2019, -1, e);
        }
    }
}
