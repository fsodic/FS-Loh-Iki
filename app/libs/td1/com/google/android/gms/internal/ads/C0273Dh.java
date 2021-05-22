package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Dh  reason: case insensitive filesystem */
public final class C0273Dh implements Parcelable.Creator<C0195Ah> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0195Ah createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        Zna zna = null;
        C1015boa boa = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C0823Yl yl = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        C0578Pa pa = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        Dpa dpa = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        C1956pd pdVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.w(parcel, a2);
                    break;
                case 2:
                    bundle = b.f(parcel, a2);
                    break;
                case 3:
                    zna = (Zna) b.a(parcel, a2, Zna.CREATOR);
                    break;
                case 4:
                    boa = (C1015boa) b.a(parcel, a2, C1015boa.CREATOR);
                    break;
                case 5:
                    str = b.o(parcel, a2);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) b.a(parcel, a2, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) b.a(parcel, a2, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = b.o(parcel, a2);
                    break;
                case 9:
                    str3 = b.o(parcel, a2);
                    break;
                case 10:
                    str4 = b.o(parcel, a2);
                    break;
                case 11:
                    yl = (C0823Yl) b.a(parcel, a2, C0823Yl.CREATOR);
                    break;
                case 12:
                    bundle2 = b.f(parcel, a2);
                    break;
                case 13:
                    i2 = b.w(parcel, a2);
                    break;
                case 14:
                    arrayList = b.q(parcel, a2);
                    break;
                case 15:
                    bundle3 = b.f(parcel, a2);
                    break;
                case 16:
                    z = b.s(parcel, a2);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 62:
                default:
                    b.z(parcel, a2);
                    break;
                case 18:
                    i3 = b.w(parcel, a2);
                    break;
                case 19:
                    i4 = b.w(parcel, a2);
                    break;
                case 20:
                    f = b.u(parcel, a2);
                    break;
                case 21:
                    str5 = b.o(parcel, a2);
                    break;
                case 25:
                    j = b.x(parcel, a2);
                    break;
                case 26:
                    str6 = b.o(parcel, a2);
                    break;
                case 27:
                    arrayList2 = b.q(parcel, a2);
                    break;
                case 28:
                    str7 = b.o(parcel, a2);
                    break;
                case 29:
                    pa = (C0578Pa) b.a(parcel, a2, C0578Pa.CREATOR);
                    break;
                case 30:
                    arrayList3 = b.q(parcel, a2);
                    break;
                case 31:
                    j2 = b.x(parcel, a2);
                    break;
                case 33:
                    str8 = b.o(parcel, a2);
                    break;
                case 34:
                    f2 = b.u(parcel, a2);
                    break;
                case 35:
                    i5 = b.w(parcel, a2);
                    break;
                case 36:
                    i6 = b.w(parcel, a2);
                    break;
                case 37:
                    z3 = b.s(parcel, a2);
                    break;
                case 38:
                    z4 = b.s(parcel, a2);
                    break;
                case 39:
                    str9 = b.o(parcel, a2);
                    break;
                case 40:
                    z2 = b.s(parcel, a2);
                    break;
                case 41:
                    str10 = b.o(parcel, a2);
                    break;
                case 42:
                    z5 = b.s(parcel, a2);
                    break;
                case 43:
                    i7 = b.w(parcel, a2);
                    break;
                case 44:
                    bundle4 = b.f(parcel, a2);
                    break;
                case 45:
                    str11 = b.o(parcel, a2);
                    break;
                case 46:
                    dpa = (Dpa) b.a(parcel, a2, Dpa.CREATOR);
                    break;
                case 47:
                    z6 = b.s(parcel, a2);
                    break;
                case 48:
                    bundle5 = b.f(parcel, a2);
                    break;
                case 49:
                    str12 = b.o(parcel, a2);
                    break;
                case 50:
                    str13 = b.o(parcel, a2);
                    break;
                case 51:
                    str14 = b.o(parcel, a2);
                    break;
                case 52:
                    z7 = b.s(parcel, a2);
                    break;
                case 53:
                    arrayList4 = b.k(parcel, a2);
                    break;
                case 54:
                    str15 = b.o(parcel, a2);
                    break;
                case 55:
                    arrayList5 = b.q(parcel, a2);
                    break;
                case 56:
                    i8 = b.w(parcel, a2);
                    break;
                case 57:
                    z8 = b.s(parcel, a2);
                    break;
                case 58:
                    z9 = b.s(parcel, a2);
                    break;
                case 59:
                    z10 = b.s(parcel, a2);
                    break;
                case 60:
                    arrayList6 = b.q(parcel, a2);
                    break;
                case 61:
                    str16 = b.o(parcel, a2);
                    break;
                case 63:
                    pdVar = (C1956pd) b.a(parcel, a2, C1956pd.CREATOR);
                    break;
                case 64:
                    str17 = b.o(parcel, a2);
                    break;
                case 65:
                    bundle6 = b.f(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C0195Ah(i, bundle, zna, boa, str, applicationInfo, packageInfo, str2, str3, str4, yl, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, pa, arrayList3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, dpa, z6, bundle5, str12, str13, str14, z7, arrayList4, str15, arrayList5, i8, z8, z9, z10, arrayList6, str16, pdVar, str17, bundle6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0195Ah[] newArray(int i) {
        return new C0195Ah[i];
    }
}
