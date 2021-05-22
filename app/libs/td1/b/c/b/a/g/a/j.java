package b.c.b.a.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.android.gms.common.internal.s;

public final class j implements Parcelable.Creator<i> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        s sVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                sVar = (s) b.a(parcel, a2, s.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new i(i, sVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i) {
        return new i[i];
    }
}
