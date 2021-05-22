package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.sma  reason: case insensitive filesystem */
public final class C2181sma implements Parcelable.Creator<C1906oma> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1906oma createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.o(parcel, a2);
                    break;
                case 3:
                    j = b.x(parcel, a2);
                    break;
                case 4:
                    str2 = b.o(parcel, a2);
                    break;
                case 5:
                    str3 = b.o(parcel, a2);
                    break;
                case 6:
                    str4 = b.o(parcel, a2);
                    break;
                case 7:
                    bundle = b.f(parcel, a2);
                    break;
                case 8:
                    z = b.s(parcel, a2);
                    break;
                case 9:
                    j2 = b.x(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C1906oma(str, j, str2, str3, str4, bundle, z, j2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1906oma[] newArray(int i) {
        return new C1906oma[i];
    }
}
