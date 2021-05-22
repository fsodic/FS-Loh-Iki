package com.google.android.gms.ads.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class n implements Parcelable.Creator<j> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                z = b.s(parcel, a2);
            } else if (a3 == 2) {
                iBinder = b.v(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                iBinder2 = b.v(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new j(z, iBinder, iBinder2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i) {
        return new j[i];
    }
}
