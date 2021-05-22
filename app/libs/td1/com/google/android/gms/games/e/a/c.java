package com.google.android.gms.games.e.a;

import android.os.Parcel;
import android.os.Parcelable;

final class c implements Parcelable.Creator<a> {
    c() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        return new a(parcel, null);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
