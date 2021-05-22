package b.c.b.a.d.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.g.h;
import com.google.android.gms.common.internal.a.b;
import java.util.HashSet;

public final class o implements Parcelable.Creator<h.d> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.d createFromParcel(Parcel parcel) {
        int i;
        int b2 = b.b(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i2 = b.w(parcel, a2);
                    i = 1;
                    break;
                case 2:
                    str = b.o(parcel, a2);
                    i = 2;
                    break;
                case 3:
                    str2 = b.o(parcel, a2);
                    i = 3;
                    break;
                case 4:
                    str3 = b.o(parcel, a2);
                    i = 4;
                    break;
                case 5:
                    str4 = b.o(parcel, a2);
                    i = 5;
                    break;
                case 6:
                    str5 = b.o(parcel, a2);
                    i = 6;
                    break;
                case 7:
                    str6 = b.o(parcel, a2);
                    i = 7;
                    break;
                default:
                    b.z(parcel, a2);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == b2) {
            return new h.d(hashSet, i2, str, str2, str3, str4, str5, str6);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b2);
        throw new b.a(sb.toString(), parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.d[] newArray(int i) {
        return new h.d[i];
    }
}
