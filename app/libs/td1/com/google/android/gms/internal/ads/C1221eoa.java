package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.eoa  reason: case insensitive filesystem */
public final class C1221eoa implements Parcelable.Creator<C1015boa> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1015boa createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        C1015boa[] boaArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.o(parcel, a2);
                    break;
                case 3:
                    i = b.w(parcel, a2);
                    break;
                case 4:
                    i2 = b.w(parcel, a2);
                    break;
                case 5:
                    z = b.s(parcel, a2);
                    break;
                case 6:
                    i3 = b.w(parcel, a2);
                    break;
                case 7:
                    i4 = b.w(parcel, a2);
                    break;
                case 8:
                    boaArr = (C1015boa[]) b.b(parcel, a2, C1015boa.CREATOR);
                    break;
                case 9:
                    z2 = b.s(parcel, a2);
                    break;
                case 10:
                    z3 = b.s(parcel, a2);
                    break;
                case 11:
                    z4 = b.s(parcel, a2);
                    break;
                case 12:
                    z5 = b.s(parcel, a2);
                    break;
                case 13:
                    z6 = b.s(parcel, a2);
                    break;
                case 14:
                    z7 = b.s(parcel, a2);
                    break;
                case 15:
                    z8 = b.s(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C1015boa(str, i, i2, z, i3, i4, boaArr, z2, z3, z4, z5, z6, z7, z8);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1015boa[] newArray(int i) {
        return new C1015boa[i];
    }
}
