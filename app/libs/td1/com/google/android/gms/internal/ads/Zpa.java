package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class Zpa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Wpa f3680a;

    Zpa(Wpa wpa) {
        this.f3680a = wpa;
    }

    public final void run() {
        if (Wpa.a(this.f3680a) != null) {
            try {
                Wpa.a(this.f3680a).c(1);
            } catch (RemoteException e) {
                C0745Vl.c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
