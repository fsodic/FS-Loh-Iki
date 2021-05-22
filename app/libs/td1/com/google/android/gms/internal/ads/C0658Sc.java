package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Sc  reason: case insensitive filesystem */
public final class C0658Sc implements Parcelable.Creator<C0580Pc> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0580Pc createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.o(parcel, a2);
            } else if (a3 == 2) {
                strArr = b.p(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                strArr2 = b.p(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C0580Pc(str, strArr, strArr2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0580Pc[] newArray(int i) {
        return new C0580Pc[i];
    }
}
