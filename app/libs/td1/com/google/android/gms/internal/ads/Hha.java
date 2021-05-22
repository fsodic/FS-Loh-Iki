package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.Dha;

final class Hha implements Parcelable.Creator<Dha.a> {
    Hha() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Dha.a createFromParcel(Parcel parcel) {
        return new Dha.a(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Dha.a[] newArray(int i) {
        return new Dha.a[i];
    }
}
