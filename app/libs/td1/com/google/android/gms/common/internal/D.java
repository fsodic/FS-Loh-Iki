package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.d;
import com.google.android.gms.common.internal.a.b;

public final class D implements Parcelable.Creator<C> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                bundle = b.f(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                dVarArr = (d[]) b.b(parcel, a2, d.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new C(bundle, dVarArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C[] newArray(int i) {
        return new C[i];
    }
}
