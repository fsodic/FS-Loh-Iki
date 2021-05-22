package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class GU implements Parcelable.Creator<DU> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DU createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                bArr = b.g(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new DU(i, bArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DU[] newArray(int i) {
        return new DU[i];
    }
}
