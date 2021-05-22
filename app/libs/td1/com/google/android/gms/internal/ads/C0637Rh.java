package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Rh  reason: case insensitive filesystem */
public final class C0637Rh implements Parcelable.Creator<C0585Ph> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0585Ph createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.z(parcel, a2);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) b.a(parcel, a2, ParcelFileDescriptor.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new C0585Ph(parcelFileDescriptor);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0585Ph[] newArray(int i) {
        return new C0585Ph[i];
    }
}
