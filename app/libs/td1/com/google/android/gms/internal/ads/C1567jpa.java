package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jpa  reason: case insensitive filesystem */
public final class C1567jpa extends C1687lga implements AbstractC1498ipa {
    C1567jpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1498ipa
    public final String getDescription() {
        Parcel a2 = a(1, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1498ipa
    public final String ma() {
        Parcel a2 = a(2, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
