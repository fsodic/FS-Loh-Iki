package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.qi  reason: case insensitive filesystem */
public final class C2035qi extends C1687lga implements AbstractC1897oi {
    C2035qi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1897oi
    public final int A() {
        Parcel a2 = a(2, Jb());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1897oi
    public final String getType() {
        Parcel a2 = a(1, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
