package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.android.gms.games.internal.a.a;

public class k implements Parcelable.Creator<PlayerEntity> {
    public PlayerEntity a(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        a aVar = null;
        i iVar = null;
        String str6 = null;
        String str7 = null;
        Uri uri3 = null;
        String str8 = null;
        Uri uri4 = null;
        String str9 = null;
        long j4 = -1;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
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
                    uri = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 5:
                    j = b.x(parcel, a2);
                    break;
                case 6:
                    i = b.w(parcel, a2);
                    break;
                case 7:
                    j2 = b.x(parcel, a2);
                    break;
                case 8:
                    str3 = b.o(parcel, a2);
                    break;
                case 9:
                    str4 = b.o(parcel, a2);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 17:
                default:
                    b.z(parcel, a2);
                    break;
                case 14:
                    str5 = b.o(parcel, a2);
                    break;
                case 15:
                    aVar = (a) b.a(parcel, a2, a.CREATOR);
                    break;
                case 16:
                    iVar = (i) b.a(parcel, a2, i.CREATOR);
                    break;
                case 18:
                    z = b.s(parcel, a2);
                    break;
                case 19:
                    z2 = b.s(parcel, a2);
                    break;
                case 20:
                    str6 = b.o(parcel, a2);
                    break;
                case 21:
                    str7 = b.o(parcel, a2);
                    break;
                case 22:
                    uri3 = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 23:
                    str8 = b.o(parcel, a2);
                    break;
                case 24:
                    uri4 = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 25:
                    str9 = b.o(parcel, a2);
                    break;
                case 26:
                    i2 = b.w(parcel, a2);
                    break;
                case 27:
                    j3 = b.x(parcel, a2);
                    break;
                case 28:
                    z3 = b.s(parcel, a2);
                    break;
                case 29:
                    j4 = b.x(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new PlayerEntity(str, str2, uri, uri2, j, i, j2, str3, str4, str5, aVar, iVar, z, z2, str6, str7, uri3, str8, uri4, str9, i2, j3, z3, j4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public /* synthetic */ PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
