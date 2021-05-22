package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class Fha implements Parcelable.Creator<Dha> {
    Fha() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Dha createFromParcel(Parcel parcel) {
        return new Dha(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Dha[] newArray(int i) {
        return new Dha[i];
    }
}
