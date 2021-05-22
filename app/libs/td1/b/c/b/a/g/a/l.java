package b.c.b.a.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.android.gms.common.internal.t;

public final class l implements Parcelable.Creator<k> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        b.c.b.a.b.b bVar = null;
        int i = 0;
        t tVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                bVar = (b.c.b.a.b.b) b.a(parcel, a2, b.c.b.a.b.b.CREATOR);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                tVar = (t) b.a(parcel, a2, t.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new k(i, bVar, tVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i) {
        return new k[i];
    }
}
