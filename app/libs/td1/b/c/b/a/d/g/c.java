package b.c.b.a.d.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.g.h;
import com.google.android.gms.common.internal.a.b;
import java.util.HashSet;

public final class c implements Parcelable.Creator<h.g> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.g createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            int i4 = 1;
            if (a3 != 1) {
                i4 = 3;
                if (a3 != 3) {
                    i4 = 4;
                    if (a3 != 4) {
                        i4 = 5;
                        if (a3 != 5) {
                            i4 = 6;
                            if (a3 != 6) {
                                b.z(parcel, a2);
                            } else {
                                i2 = b.w(parcel, a2);
                            }
                        } else {
                            str = b.o(parcel, a2);
                        }
                    } else {
                        str2 = b.o(parcel, a2);
                    }
                } else {
                    i3 = b.w(parcel, a2);
                }
            } else {
                i = b.w(parcel, a2);
            }
            hashSet.add(Integer.valueOf(i4));
        }
        if (parcel.dataPosition() == b2) {
            return new h.g(hashSet, i, str, i2, str2, i3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b2);
        throw new b.a(sb.toString(), parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.g[] newArray(int i) {
        return new h.g[i];
    }
}
