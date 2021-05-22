package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class c implements Parcelable.Creator<DataHolder> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                strArr = b.p(parcel, a2);
            } else if (a3 == 2) {
                cursorWindowArr = (CursorWindow[]) b.b(parcel, a2, CursorWindow.CREATOR);
            } else if (a3 == 3) {
                i2 = b.w(parcel, a2);
            } else if (a3 == 4) {
                bundle = b.f(parcel, a2);
            } else if (a3 != 1000) {
                b.z(parcel, a2);
            } else {
                i = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.N();
        return dataHolder;
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
