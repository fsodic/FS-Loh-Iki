package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.a.a;

/* renamed from: com.google.android.gms.internal.ads.Vf  reason: case insensitive filesystem */
final class RunnableC0739Vf implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a f3356a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0661Sf f3357b;

    RunnableC0739Vf(C0661Sf sf, a aVar) {
        this.f3357b = sf;
        this.f3356a = aVar;
    }

    public final void run() {
        try {
            C0661Sf.a(this.f3357b).c(C0791Xf.a(this.f3356a));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }
}
