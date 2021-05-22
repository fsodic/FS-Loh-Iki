package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

public final class b implements Parcelable.Creator<GoogleSignInAccount> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.a.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.a.b.a(parcel);
            switch (com.google.android.gms.common.internal.a.b.a(a2)) {
                case 1:
                    i = com.google.android.gms.common.internal.a.b.w(parcel, a2);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    break;
                case 6:
                    uri = (Uri) com.google.android.gms.common.internal.a.b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 7:
                    str5 = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    break;
                case 8:
                    j = com.google.android.gms.common.internal.a.b.x(parcel, a2);
                    break;
                case 9:
                    str6 = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    break;
                case 10:
                    arrayList = com.google.android.gms.common.internal.a.b.c(parcel, a2, Scope.CREATOR);
                    break;
                case 11:
                    str7 = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    break;
                case 12:
                    str8 = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    break;
                default:
                    com.google.android.gms.common.internal.a.b.z(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.a.b.r(parcel, b2);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
