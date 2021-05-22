package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class gqa implements Parcelable.Creator<eqa> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ eqa createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 15) {
                b.z(parcel, a2);
            } else {
                str = b.o(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new eqa(str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ eqa[] newArray(int i) {
        return new eqa[i];
    }
}
