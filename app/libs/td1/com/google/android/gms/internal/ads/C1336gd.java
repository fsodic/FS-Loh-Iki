package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.gd  reason: case insensitive filesystem */
public final class C1336gd implements Parcelable.Creator<C1130dd> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1130dd createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.o(parcel, a2);
            } else if (a3 == 2) {
                z = b.s(parcel, a2);
            } else if (a3 == 3) {
                i = b.w(parcel, a2);
            } else if (a3 != 4) {
                b.z(parcel, a2);
            } else {
                str2 = b.o(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C1130dd(str, z, i, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1130dd[] newArray(int i) {
        return new C1130dd[i];
    }
}
