package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.sd  reason: case insensitive filesystem */
public final class C2162sd implements Parcelable.Creator<C1956pd> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1956pd createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i2 = b.w(parcel, a2);
            } else if (a3 == 2) {
                str = b.o(parcel, a2);
            } else if (a3 == 3) {
                i3 = b.w(parcel, a2);
            } else if (a3 != 1000) {
                b.z(parcel, a2);
            } else {
                i = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C1956pd(i, i2, str, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1956pd[] newArray(int i) {
        return new C1956pd[i];
    }
}
