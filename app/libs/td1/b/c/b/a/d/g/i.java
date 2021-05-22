package b.c.b.a.d.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.g.h;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;
import java.util.HashSet;

public final class i implements Parcelable.Creator<h> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h createFromParcel(Parcel parcel) {
        int i;
        h.c cVar;
        int i2;
        int b2 = b.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        h.a aVar = null;
        String str2 = null;
        String str3 = null;
        h.b bVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        h.c cVar2 = null;
        String str7 = null;
        h.d dVar = null;
        String str8 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str9 = null;
        String str10 = null;
        ArrayList arrayList3 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i3 = b.w(parcel, a2);
                    i = 1;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 2:
                    str = b.o(parcel, a2);
                    i = 2;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 3:
                    aVar = (h.a) b.a(parcel, a2, h.a.CREATOR);
                    i = 3;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 4:
                    str2 = b.o(parcel, a2);
                    i = 4;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 5:
                    str3 = b.o(parcel, a2);
                    i = 5;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 6:
                    i4 = b.w(parcel, a2);
                    i = 6;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 7:
                    bVar = (h.b) b.a(parcel, a2, h.b.CREATOR);
                    i = 7;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 8:
                    str4 = b.o(parcel, a2);
                    i = 8;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 9:
                    str5 = b.o(parcel, a2);
                    i = 9;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 10:
                case 11:
                case 13:
                case 17:
                default:
                    b.z(parcel, a2);
                    break;
                case 12:
                    i5 = b.w(parcel, a2);
                    i = 12;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 14:
                    str6 = b.o(parcel, a2);
                    i = 14;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 15:
                    cVar2 = (h.c) b.a(parcel, a2, h.c.CREATOR);
                    i = 15;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 16:
                    z = b.s(parcel, a2);
                    i = 16;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 18:
                    str7 = b.o(parcel, a2);
                    i = 18;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 19:
                    cVar = cVar2;
                    dVar = (h.d) b.a(parcel, a2, h.d.CREATOR);
                    i2 = 19;
                    hashSet.add(Integer.valueOf(i2));
                    cVar2 = cVar;
                    break;
                case 20:
                    str8 = b.o(parcel, a2);
                    i = 20;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 21:
                    i6 = b.w(parcel, a2);
                    i = 21;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 22:
                    cVar = cVar2;
                    arrayList = b.c(parcel, a2, h.e.CREATOR);
                    i2 = 22;
                    hashSet.add(Integer.valueOf(i2));
                    cVar2 = cVar;
                    break;
                case 23:
                    cVar = cVar2;
                    arrayList2 = b.c(parcel, a2, h.f.CREATOR);
                    i2 = 23;
                    hashSet.add(Integer.valueOf(i2));
                    cVar2 = cVar;
                    break;
                case 24:
                    i7 = b.w(parcel, a2);
                    i = 24;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 25:
                    i8 = b.w(parcel, a2);
                    i = 25;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 26:
                    str9 = b.o(parcel, a2);
                    i = 26;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 27:
                    str10 = b.o(parcel, a2);
                    i = 27;
                    hashSet.add(Integer.valueOf(i));
                    break;
                case 28:
                    cVar = cVar2;
                    arrayList3 = b.c(parcel, a2, h.g.CREATOR);
                    i2 = 28;
                    hashSet.add(Integer.valueOf(i2));
                    cVar2 = cVar;
                    break;
                case 29:
                    z2 = b.s(parcel, a2);
                    i = 29;
                    hashSet.add(Integer.valueOf(i));
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new h(hashSet, i3, str, aVar, str2, str3, i4, bVar, str4, str5, i5, str6, cVar2, z, str7, dVar, str8, i6, arrayList, arrayList2, i7, i8, str9, str10, arrayList3, z2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b2);
        throw new b.a(sb.toString(), parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i) {
        return new h[i];
    }
}
