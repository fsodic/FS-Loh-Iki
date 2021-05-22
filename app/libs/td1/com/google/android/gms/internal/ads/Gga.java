package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class Gga implements Parcelable.Creator<Hga> {
    Gga() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Hga createFromParcel(Parcel parcel) {
        return new Hga(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Hga[] newArray(int i) {
        return new Hga[i];
    }
}
