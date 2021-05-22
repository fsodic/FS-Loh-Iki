package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class Rna implements Parcelable.Creator<Sna> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Sna createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                str = b.o(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                str2 = b.o(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new Sna(i, str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Sna[] newArray(int i) {
        return new Sna[i];
    }
}
