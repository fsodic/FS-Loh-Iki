package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.am  reason: case insensitive filesystem */
public final class C0941am implements Parcelable.Creator<C0823Yl> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0823Yl createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                str = b.o(parcel, a2);
            } else if (a3 == 3) {
                i = b.w(parcel, a2);
            } else if (a3 == 4) {
                i2 = b.w(parcel, a2);
            } else if (a3 == 5) {
                z = b.s(parcel, a2);
            } else if (a3 != 6) {
                b.z(parcel, a2);
            } else {
                z2 = b.s(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C0823Yl(str, i, i2, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0823Yl[] newArray(int i) {
        return new C0823Yl[i];
    }
}
