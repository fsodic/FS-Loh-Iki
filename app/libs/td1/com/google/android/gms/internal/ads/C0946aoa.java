package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.aoa  reason: case insensitive filesystem */
public final class C0946aoa implements Parcelable.Creator<Zna> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Zna createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        eqa eqa = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        Qna qna = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.w(parcel, a2);
                    break;
                case 2:
                    j = b.x(parcel, a2);
                    break;
                case 3:
                    bundle = b.f(parcel, a2);
                    break;
                case 4:
                    i2 = b.w(parcel, a2);
                    break;
                case 5:
                    arrayList = b.q(parcel, a2);
                    break;
                case 6:
                    z = b.s(parcel, a2);
                    break;
                case 7:
                    i3 = b.w(parcel, a2);
                    break;
                case 8:
                    z2 = b.s(parcel, a2);
                    break;
                case 9:
                    str = b.o(parcel, a2);
                    break;
                case 10:
                    eqa = (eqa) b.a(parcel, a2, eqa.CREATOR);
                    break;
                case 11:
                    location = (Location) b.a(parcel, a2, Location.CREATOR);
                    break;
                case 12:
                    str2 = b.o(parcel, a2);
                    break;
                case 13:
                    bundle2 = b.f(parcel, a2);
                    break;
                case 14:
                    bundle3 = b.f(parcel, a2);
                    break;
                case 15:
                    arrayList2 = b.q(parcel, a2);
                    break;
                case 16:
                    str3 = b.o(parcel, a2);
                    break;
                case 17:
                    str4 = b.o(parcel, a2);
                    break;
                case 18:
                    z3 = b.s(parcel, a2);
                    break;
                case 19:
                    qna = (Qna) b.a(parcel, a2, Qna.CREATOR);
                    break;
                case 20:
                    i4 = b.w(parcel, a2);
                    break;
                case 21:
                    str5 = b.o(parcel, a2);
                    break;
                case 22:
                    arrayList3 = b.q(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new Zna(i, j, bundle, i2, arrayList, z, i3, z2, str, eqa, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, qna, i4, str5, arrayList3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Zna[] newArray(int i) {
        return new Zna[i];
    }
}
