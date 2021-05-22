package b.c.b.a.d.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.g.h;
import com.google.android.gms.common.internal.a.b;
import java.util.HashSet;

public final class n implements Parcelable.Creator<h.c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.c createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            int i2 = 1;
            if (a3 != 1) {
                i2 = 2;
                if (a3 != 2) {
                    b.z(parcel, a2);
                } else {
                    str = b.o(parcel, a2);
                }
            } else {
                i = b.w(parcel, a2);
            }
            hashSet.add(Integer.valueOf(i2));
        }
        if (parcel.dataPosition() == b2) {
            return new h.c(hashSet, i, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b2);
        throw new b.a(sb.toString(), parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.c[] newArray(int i) {
        return new h.c[i];
    }
}
