package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.zS  reason: case insensitive filesystem */
public final class C2631zS implements Parcelable.Creator<C2562yS> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2562yS createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.w(parcel, a2);
                    break;
                case 2:
                    i2 = b.w(parcel, a2);
                    break;
                case 3:
                    i3 = b.w(parcel, a2);
                    break;
                case 4:
                    i4 = b.w(parcel, a2);
                    break;
                case 5:
                    str = b.o(parcel, a2);
                    break;
                case 6:
                    i5 = b.w(parcel, a2);
                    break;
                case 7:
                    i6 = b.w(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C2562yS(i, i2, i3, i4, str, i5, i6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2562yS[] newArray(int i) {
        return new C2562yS[i];
    }
}
