package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.kj  reason: case insensitive filesystem */
public final class C1623kj implements Parcelable.Creator<C1692lj> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1692lj createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.o(parcel, a2);
                    break;
                case 3:
                    str2 = b.o(parcel, a2);
                    break;
                case 4:
                    z = b.s(parcel, a2);
                    break;
                case 5:
                    z2 = b.s(parcel, a2);
                    break;
                case 6:
                    arrayList = b.q(parcel, a2);
                    break;
                case 7:
                    z3 = b.s(parcel, a2);
                    break;
                case 8:
                    z4 = b.s(parcel, a2);
                    break;
                case 9:
                    arrayList2 = b.q(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C1692lj(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1692lj[] newArray(int i) {
        return new C1692lj[i];
    }
}
