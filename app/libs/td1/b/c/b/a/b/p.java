package b.c.b.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class p implements Parcelable.Creator<d> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.o(parcel, a2);
            } else if (a3 == 2) {
                i = b.w(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                j = b.x(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new d(str, i, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i) {
        return new d[i];
    }
}
