package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Vh  reason: case insensitive filesystem */
public final class C0741Vh implements Parcelable.Creator<C0767Wh> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0767Wh createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.z(parcel, a2);
            } else {
                str = b.o(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C0767Wh(str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0767Wh[] newArray(int i) {
        return new C0767Wh[i];
    }
}
