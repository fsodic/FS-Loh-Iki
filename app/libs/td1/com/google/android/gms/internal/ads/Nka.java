package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class Nka implements Parcelable.Creator<Oka> {
    Nka() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Oka createFromParcel(Parcel parcel) {
        return new Oka(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Oka[] newArray(int i) {
        return new Oka[0];
    }
}
