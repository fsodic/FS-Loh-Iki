package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Th  reason: case insensitive filesystem */
public final class C0689Th implements Parcelable.Creator<C0715Uh> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0715Uh createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        C0823Yl yl = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        C2562yS ySVar = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    bundle = b.f(parcel, a2);
                    break;
                case 2:
                    yl = (C0823Yl) b.a(parcel, a2, C0823Yl.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) b.a(parcel, a2, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = b.o(parcel, a2);
                    break;
                case 5:
                    arrayList = b.q(parcel, a2);
                    break;
                case 6:
                    packageInfo = (PackageInfo) b.a(parcel, a2, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = b.o(parcel, a2);
                    break;
                case 8:
                    z = b.s(parcel, a2);
                    break;
                case 9:
                    str3 = b.o(parcel, a2);
                    break;
                case 10:
                    ySVar = (C2562yS) b.a(parcel, a2, C2562yS.CREATOR);
                    break;
                case 11:
                    str4 = b.o(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C0715Uh(bundle, yl, applicationInfo, str, arrayList, packageInfo, str2, z, str3, ySVar, str4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0715Uh[] newArray(int i) {
        return new C0715Uh[i];
    }
}
