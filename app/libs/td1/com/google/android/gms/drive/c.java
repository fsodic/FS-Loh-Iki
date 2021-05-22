package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class c implements Parcelable.Creator<DriveId> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DriveId createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        int i = -1;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                str = b.o(parcel, a2);
            } else if (a3 == 3) {
                j = b.x(parcel, a2);
            } else if (a3 == 4) {
                j2 = b.x(parcel, a2);
            } else if (a3 != 5) {
                b.z(parcel, a2);
            } else {
                i = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new DriveId(str, j, j2, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DriveId[] newArray(int i) {
        return new DriveId[i];
    }
}
