package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class PU implements Parcelable.Creator<MU> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MU createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.w(parcel, a2);
            } else if (a3 == 3) {
                str = b.o(parcel, a2);
            } else if (a3 == 4) {
                str2 = b.o(parcel, a2);
            } else if (a3 != 5) {
                b.z(parcel, a2);
            } else {
                i3 = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new MU(i, i2, i3, str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MU[] newArray(int i) {
        return new MU[i];
    }
}
