package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.common.internal.a.b;
import com.google.android.gms.internal.ads.C0823Yl;

public final class m implements Parcelable.Creator<AdOverlayInfoParcel> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        d dVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        C0823Yl yl = null;
        String str4 = null;
        g gVar = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    dVar = (d) b.a(parcel, a2, d.CREATOR);
                    break;
                case 3:
                    iBinder = b.v(parcel, a2);
                    break;
                case 4:
                    iBinder2 = b.v(parcel, a2);
                    break;
                case 5:
                    iBinder3 = b.v(parcel, a2);
                    break;
                case 6:
                    iBinder4 = b.v(parcel, a2);
                    break;
                case 7:
                    str = b.o(parcel, a2);
                    break;
                case 8:
                    z = b.s(parcel, a2);
                    break;
                case 9:
                    str2 = b.o(parcel, a2);
                    break;
                case 10:
                    iBinder5 = b.v(parcel, a2);
                    break;
                case 11:
                    i = b.w(parcel, a2);
                    break;
                case 12:
                    i2 = b.w(parcel, a2);
                    break;
                case 13:
                    str3 = b.o(parcel, a2);
                    break;
                case 14:
                    yl = (C0823Yl) b.a(parcel, a2, C0823Yl.CREATOR);
                    break;
                case 15:
                default:
                    b.z(parcel, a2);
                    break;
                case 16:
                    str4 = b.o(parcel, a2);
                    break;
                case 17:
                    gVar = (g) b.a(parcel, a2, g.CREATOR);
                    break;
                case 18:
                    iBinder6 = b.v(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new AdOverlayInfoParcel(dVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, yl, str4, gVar, iBinder6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
