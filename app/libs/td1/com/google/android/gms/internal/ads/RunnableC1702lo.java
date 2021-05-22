package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.c;

/* renamed from: com.google.android.gms.internal.ads.lo  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1702lo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1771mo f4906a;

    RunnableC1702lo(C1771mo moVar) {
        this.f4906a = moVar;
    }

    public final void run() {
        C1771mo moVar = this.f4906a;
        moVar.f4991a.A();
        c y = moVar.f4991a.y();
        if (y != null) {
            y.Yb();
        }
    }
}
