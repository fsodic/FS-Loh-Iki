package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bqa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ aqa f3946a;

    bqa(aqa aqa) {
        this.f3946a = aqa;
    }

    public final void run() {
        if (this.f3946a.f3845a != null) {
            try {
                this.f3946a.f3845a.d(1);
            } catch (RemoteException e) {
                C0745Vl.c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
