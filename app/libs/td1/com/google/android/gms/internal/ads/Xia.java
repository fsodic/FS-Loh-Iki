package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class Xia implements Parcelable.Creator<Yia> {
    Xia() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Yia createFromParcel(Parcel parcel) {
        return new Yia(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Yia[] newArray(int i) {
        return new Yia[0];
    }
}
