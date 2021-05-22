package b.c.b.a.d.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.g.h;
import com.google.android.gms.common.internal.a.b;
import java.util.HashSet;

public final class k implements Parcelable.Creator<h.b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.b createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        h.b.a aVar = null;
        h.b.C0016b bVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            int i3 = 1;
            if (a3 != 1) {
                i3 = 2;
                if (a3 != 2) {
                    i3 = 3;
                    if (a3 != 3) {
                        i3 = 4;
                        if (a3 != 4) {
                            b.z(parcel, a2);
                        } else {
                            i2 = b.w(parcel, a2);
                        }
                    } else {
                        bVar = (h.b.C0016b) b.a(parcel, a2, h.b.C0016b.CREATOR);
                    }
                } else {
                    aVar = (h.b.a) b.a(parcel, a2, h.b.a.CREATOR);
                }
            } else {
                i = b.w(parcel, a2);
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == b2) {
            return new h.b(hashSet, i, aVar, bVar, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b2);
        throw new b.a(sb.toString(), parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.b[] newArray(int i) {
        return new h.b[i];
    }
}
