package b.c.b.a.d.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.g.h;
import com.google.android.gms.common.internal.a.b;
import java.util.HashSet;

public final class m implements Parcelable.Creator<h.b.C0016b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.b.C0016b createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            int i4 = 1;
            if (a3 != 1) {
                i4 = 2;
                if (a3 != 2) {
                    i4 = 3;
                    if (a3 != 3) {
                        i4 = 4;
                        if (a3 != 4) {
                            b.z(parcel, a2);
                        } else {
                            i3 = b.w(parcel, a2);
                        }
                    } else {
                        str = b.o(parcel, a2);
                    }
                } else {
                    i2 = b.w(parcel, a2);
                }
            } else {
                i = b.w(parcel, a2);
            }
            hashSet.add(Integer.valueOf(i4));
        }
        if (parcel.dataPosition() == b2) {
            return new h.b.C0016b(hashSet, i, i2, str, i3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b2);
        throw new b.a(sb.toString(), parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.b.C0016b[] newArray(int i) {
        return new h.b.C0016b[i];
    }
}
