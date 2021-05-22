package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ig  reason: case insensitive filesystem */
public final class C1479ig extends C1687lga implements AbstractC1342gg {
    C1479ig(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1342gg
    public final void b(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(2, Jb);
    }
}
