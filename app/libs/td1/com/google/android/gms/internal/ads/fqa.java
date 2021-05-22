package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class fqa implements Parcelable.Creator<cqa> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cqa createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                i2 = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new cqa(i, i2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cqa[] newArray(int i) {
        return new cqa[i];
    }
}
