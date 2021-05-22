package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Sj  reason: case insensitive filesystem */
public final class C0665Sj implements Parcelable.Creator<C0587Pj> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0587Pj createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        C1015boa boa = null;
        Zna zna = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.o(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.o(parcel, a2);
            } else if (a3 == 3) {
                boa = (C1015boa) b.a(parcel, a2, C1015boa.CREATOR);
            } else if (a3 != 4) {
                b.z(parcel, a2);
            } else {
                zna = (Zna) b.a(parcel, a2, Zna.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new C0587Pj(str, str2, boa, zna);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0587Pj[] newArray(int i) {
        return new C0587Pj[i];
    }
}
