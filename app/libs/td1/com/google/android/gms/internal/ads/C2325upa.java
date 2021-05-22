package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.upa  reason: case insensitive filesystem */
public final class C2325upa extends C1687lga implements AbstractC2187spa {
    C2325upa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2187spa
    public final String k() {
        Parcel a2 = a(1, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
