package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.aja  reason: case insensitive filesystem */
final class C0936aja implements Parcelable.Creator<Zia> {
    C0936aja() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Zia createFromParcel(Parcel parcel) {
        return new Zia(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Zia[] newArray(int i) {
        return new Zia[i];
    }
}
