package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.a.a;

/* renamed from: com.google.android.gms.internal.ads.Wf  reason: case insensitive filesystem */
final class RunnableC0765Wf implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a f3441a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0661Sf f3442b;

    RunnableC0765Wf(C0661Sf sf, a aVar) {
        this.f3442b = sf;
        this.f3441a = aVar;
    }

    public final void run() {
        try {
            C0661Sf.a(this.f3442b).c(C0791Xf.a(this.f3441a));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }
}
