package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.f  reason: case insensitive filesystem */
public final class C1234f implements Parcelable.Creator<C1028c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1028c createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                z = b.s(parcel, a2);
            } else if (a3 == 3) {
                z2 = b.s(parcel, a2);
            } else if (a3 != 4) {
                b.z(parcel, a2);
            } else {
                z3 = b.s(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C1028c(z, z2, z3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1028c[] newArray(int i) {
        return new C1028c[i];
    }
}
