package com.google.android.gms.games.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class c implements Parcelable.Creator<a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean[] zArr = null;
        boolean[] zArr2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                z = b.s(parcel, a2);
            } else if (a3 == 2) {
                z2 = b.s(parcel, a2);
            } else if (a3 == 3) {
                z3 = b.s(parcel, a2);
            } else if (a3 == 4) {
                zArr = b.e(parcel, a2);
            } else if (a3 != 5) {
                b.z(parcel, a2);
            } else {
                zArr2 = b.e(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new a(z, z2, z3, zArr, zArr2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
