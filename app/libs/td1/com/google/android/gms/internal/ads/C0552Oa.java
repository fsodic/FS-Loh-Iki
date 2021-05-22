package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Oa  reason: case insensitive filesystem */
public final class C0552Oa implements Parcelable.Creator<C0578Pa> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0578Pa createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        C1028c cVar = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.w(parcel, a2);
                    break;
                case 2:
                    z = b.s(parcel, a2);
                    break;
                case 3:
                    i2 = b.w(parcel, a2);
                    break;
                case 4:
                    z2 = b.s(parcel, a2);
                    break;
                case 5:
                    i3 = b.w(parcel, a2);
                    break;
                case 6:
                    cVar = (C1028c) b.a(parcel, a2, C1028c.CREATOR);
                    break;
                case 7:
                    z3 = b.s(parcel, a2);
                    break;
                case 8:
                    i4 = b.w(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C0578Pa(i, z, i2, z2, i3, cVar, z3, i4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0578Pa[] newArray(int i) {
        return new C0578Pa[i];
    }
}
