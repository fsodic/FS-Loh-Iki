package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.si  reason: case insensitive filesystem */
public final class C2172si extends C1687lga implements AbstractC1966pi {
    C2172si(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1966pi
    public final void a(AbstractC1897oi oiVar, String str, String str2) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, oiVar);
        Jb.writeString(str);
        Jb.writeString(str2);
        b(2, Jb);
    }
}
