package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class j implements Parcelable.Creator<g> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    z = b.s(parcel, a2);
                    break;
                case 3:
                    z2 = b.s(parcel, a2);
                    break;
                case 4:
                    str = b.o(parcel, a2);
                    break;
                case 5:
                    z3 = b.s(parcel, a2);
                    break;
                case 6:
                    f = b.u(parcel, a2);
                    break;
                case 7:
                    i = b.w(parcel, a2);
                    break;
                case 8:
                    z4 = b.s(parcel, a2);
                    break;
                case 9:
                    z5 = b.s(parcel, a2);
                    break;
                case 10:
                    z6 = b.s(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new g(z, z2, str, z3, f, i, z4, z5, z6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i) {
        return new g[i];
    }
}
