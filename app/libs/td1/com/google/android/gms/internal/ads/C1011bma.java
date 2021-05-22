package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.bma  reason: case insensitive filesystem */
public final class C1011bma extends C1687lga implements AbstractC0942ama {
    C1011bma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0942ama
    public final void a(_la _la) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, _la);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0942ama
    public final void p(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(2, Jb);
    }
}
