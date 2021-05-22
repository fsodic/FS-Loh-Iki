package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.goa  reason: case insensitive filesystem */
public final class C1359goa implements Parcelable.Creator<C1152doa> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1152doa createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.w(parcel, a2);
            } else if (a3 == 3) {
                str = b.o(parcel, a2);
            } else if (a3 != 4) {
                b.z(parcel, a2);
            } else {
                j = b.x(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C1152doa(i, i2, str, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1152doa[] newArray(int i) {
        return new C1152doa[i];
    }
}
