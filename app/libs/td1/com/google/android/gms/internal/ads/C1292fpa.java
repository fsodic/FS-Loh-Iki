package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.fpa  reason: case insensitive filesystem */
public final class C1292fpa extends C1687lga implements AbstractC1086cpa {
    C1292fpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1086cpa
    public final IBinder e(a aVar, int i) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeInt(i);
        Parcel a2 = a(1, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
