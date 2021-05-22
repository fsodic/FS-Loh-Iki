package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Ni  reason: case insensitive filesystem */
public final class C0534Ni implements Parcelable.Creator<C0456Ki> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0456Ki createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                str = b.o(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                i = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C0456Ki(str, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0456Ki[] newArray(int i) {
        return new C0456Ki[i];
    }
}
