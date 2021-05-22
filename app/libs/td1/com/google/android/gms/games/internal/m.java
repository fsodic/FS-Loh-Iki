package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class m implements Parcelable.Creator<l> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                bundle = b.f(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                iBinder = b.v(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new l(bundle, iBinder);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i) {
        return new l[i];
    }
}
