package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class f implements Parcelable.Creator<e> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PlusCommonExtras plusCommonExtras = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 != 1000) {
                switch (a3) {
                    case 1:
                        str = b.o(parcel, a2);
                        continue;
                    case 2:
                        strArr = b.p(parcel, a2);
                        continue;
                    case 3:
                        strArr2 = b.p(parcel, a2);
                        continue;
                    case 4:
                        strArr3 = b.p(parcel, a2);
                        continue;
                    case 5:
                        str2 = b.o(parcel, a2);
                        continue;
                    case 6:
                        str3 = b.o(parcel, a2);
                        continue;
                    case 7:
                        str4 = b.o(parcel, a2);
                        continue;
                    case 8:
                        str5 = b.o(parcel, a2);
                        continue;
                    case 9:
                        plusCommonExtras = (PlusCommonExtras) b.a(parcel, a2, PlusCommonExtras.CREATOR);
                        continue;
                    default:
                        b.z(parcel, a2);
                        continue;
                }
            } else {
                i = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new e(i, str, strArr, strArr2, strArr3, str2, str3, str4, str5, plusCommonExtras);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i) {
        return new e[i];
    }
}
