package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.hoa  reason: case insensitive filesystem */
public final class C1428hoa implements Parcelable.Creator<C1496ioa> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1496ioa createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.z(parcel, a2);
            } else {
                i = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C1496ioa(i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1496ioa[] newArray(int i) {
        return new C1496ioa[i];
    }
}
