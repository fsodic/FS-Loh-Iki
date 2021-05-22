package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.c;

/* renamed from: com.google.android.gms.internal.ads.fp  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1291fp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1085cp f4343a;

    RunnableC1291fp(C1085cp cpVar) {
        this.f4343a = cpVar;
    }

    public final void run() {
        C1085cp cpVar = this.f4343a;
        cpVar.d.A();
        c y = cpVar.d.y();
        if (y != null) {
            y.Yb();
        }
    }
}
