package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class Xpa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Upa f3525a;

    Xpa(Upa upa) {
        this.f3525a = upa;
    }

    public final void run() {
        if (this.f3525a.f3296a.f3132a != null) {
            try {
                this.f3525a.f3296a.f3132a.c(1);
            } catch (RemoteException e) {
                C0745Vl.c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
