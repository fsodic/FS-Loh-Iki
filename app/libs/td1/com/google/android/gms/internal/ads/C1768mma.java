package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.mma  reason: case insensitive filesystem */
public final class C1768mma implements Parcelable.Creator<C1837nma> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1837nma createFromParcel(Parcel parcel) {
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
        return new C1837nma(parcelFileDescriptor);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1837nma[] newArray(int i) {
        return new C1837nma[i];
    }
}
