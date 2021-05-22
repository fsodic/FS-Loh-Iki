package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.qh  reason: case insensitive filesystem */
public final class C2033qh implements Parcelable.Creator<C2101rh> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2101rh createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                iBinder = b.v(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                iBinder2 = b.v(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C2101rh(iBinder, iBinder2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2101rh[] newArray(int i) {
        return new C2101rh[i];
    }
}
