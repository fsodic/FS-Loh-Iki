package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Oi  reason: case insensitive filesystem */
public final class C0560Oi extends C1687lga implements AbstractC0508Mi {
    C0560Oi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0508Mi
    public final int A() {
        Parcel a2 = a(2, Jb());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0508Mi
    public final String getType() {
        Parcel a2 = a(1, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
