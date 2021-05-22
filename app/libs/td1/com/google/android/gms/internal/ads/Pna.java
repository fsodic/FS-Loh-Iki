package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class Pna implements Parcelable.Creator<Qna> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Qna createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.o(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                str2 = b.o(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new Qna(str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Qna[] newArray(int i) {
        return new Qna[i];
    }
}
