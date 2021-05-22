package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vK  reason: case insensitive filesystem */
public final class C2347vK implements Ona {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC2530xoa f5797a;

    public final synchronized void a(AbstractC2530xoa xoa) {
        this.f5797a = xoa;
    }

    @Override // com.google.android.gms.internal.ads.Ona
    public final synchronized void e() {
        if (this.f5797a != null) {
            try {
                this.f5797a.e();
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
