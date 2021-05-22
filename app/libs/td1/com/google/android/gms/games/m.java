package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class m implements Parcelable.Creator<i> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        h hVar = null;
        h hVar2 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                j = b.x(parcel, a2);
            } else if (a3 == 2) {
                j2 = b.x(parcel, a2);
            } else if (a3 == 3) {
                hVar = (h) b.a(parcel, a2, h.CREATOR);
            } else if (a3 != 4) {
                b.z(parcel, a2);
            } else {
                hVar2 = (h) b.a(parcel, a2, h.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new i(j, j2, hVar, hVar2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i) {
        return new i[i];
    }
}
