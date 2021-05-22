package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.hd  reason: case insensitive filesystem */
public final class C1405hd extends C1687lga implements AbstractC1267fd {
    C1405hd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1267fd
    public final void i(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(3, Jb);
    }
}
