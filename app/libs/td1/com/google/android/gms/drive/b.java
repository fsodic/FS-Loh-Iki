package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.a.b.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.a.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.a.b.a(a2);
            if (a3 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) com.google.android.gms.common.internal.a.b.a(parcel, a2, ParcelFileDescriptor.CREATOR);
            } else if (a3 == 3) {
                i = com.google.android.gms.common.internal.a.b.w(parcel, a2);
            } else if (a3 == 4) {
                i2 = com.google.android.gms.common.internal.a.b.w(parcel, a2);
            } else if (a3 == 5) {
                driveId = (DriveId) com.google.android.gms.common.internal.a.b.a(parcel, a2, DriveId.CREATOR);
            } else if (a3 == 7) {
                z = com.google.android.gms.common.internal.a.b.s(parcel, a2);
            } else if (a3 != 8) {
                com.google.android.gms.common.internal.a.b.z(parcel, a2);
            } else {
                str = com.google.android.gms.common.internal.a.b.o(parcel, a2);
            }
        }
        com.google.android.gms.common.internal.a.b.r(parcel, b2);
        return new a(parcelFileDescriptor, i, i2, driveId, z, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
