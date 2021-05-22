package b.c.b.a.d.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.d.g.h;
import com.google.android.gms.common.internal.a.b;
import java.util.HashSet;

public final class b implements Parcelable.Creator<h.f> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.f createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.a.b.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.a.b.a(parcel);
            int a3 = com.google.android.gms.common.internal.a.b.a(a2);
            int i2 = 1;
            if (a3 != 1) {
                i2 = 2;
                if (a3 != 2) {
                    i2 = 3;
                    if (a3 != 3) {
                        com.google.android.gms.common.internal.a.b.z(parcel, a2);
                    } else {
                        str = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                    }
                } else {
                    z = com.google.android.gms.common.internal.a.b.s(parcel, a2);
                }
            } else {
                i = com.google.android.gms.common.internal.a.b.w(parcel, a2);
            }
            hashSet.add(Integer.valueOf(i2));
        }
        if (parcel.dataPosition() == b2) {
            return new h.f(hashSet, i, z, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b2);
        throw new b.a(sb.toString(), parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h.f[] newArray(int i) {
        return new h.f[i];
    }
}
