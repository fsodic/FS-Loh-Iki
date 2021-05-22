package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Di  reason: case insensitive filesystem */
public final class C0274Di implements Parcelable.Creator<C0300Ei> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0300Ei createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Zna zna = null;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                zna = (Zna) b.a(parcel, a2, Zna.CREATOR);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                str = b.o(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C0300Ei(zna, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0300Ei[] newArray(int i) {
        return new C0300Ei[i];
    }
}
