package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public class n implements Parcelable.Creator<GameEntity> {
    public GameEntity a(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    str = b.o(parcel, a2);
                    break;
                case 2:
                    str2 = b.o(parcel, a2);
                    break;
                case 3:
                    str3 = b.o(parcel, a2);
                    break;
                case 4:
                    str4 = b.o(parcel, a2);
                    break;
                case 5:
                    str5 = b.o(parcel, a2);
                    break;
                case 6:
                    str6 = b.o(parcel, a2);
                    break;
                case 7:
                    uri = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 10:
                    z = b.s(parcel, a2);
                    break;
                case 11:
                    z2 = b.s(parcel, a2);
                    break;
                case 12:
                    str7 = b.o(parcel, a2);
                    break;
                case 13:
                    i = b.w(parcel, a2);
                    break;
                case 14:
                    i2 = b.w(parcel, a2);
                    break;
                case 15:
                    i3 = b.w(parcel, a2);
                    break;
                case 16:
                    z3 = b.s(parcel, a2);
                    break;
                case 17:
                    z4 = b.s(parcel, a2);
                    break;
                case 18:
                    str8 = b.o(parcel, a2);
                    break;
                case 19:
                    str9 = b.o(parcel, a2);
                    break;
                case 20:
                    str10 = b.o(parcel, a2);
                    break;
                case 21:
                    z5 = b.s(parcel, a2);
                    break;
                case 22:
                    z6 = b.s(parcel, a2);
                    break;
                case 23:
                    z7 = b.s(parcel, a2);
                    break;
                case 24:
                    str11 = b.o(parcel, a2);
                    break;
                case 25:
                    z8 = b.s(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new GameEntity(str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i, i2, i3, z3, z4, str8, str9, str10, z5, z6, z7, str11, z8);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public /* synthetic */ GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
