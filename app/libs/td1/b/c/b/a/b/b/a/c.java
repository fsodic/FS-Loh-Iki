package b.c.b.a.b.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class c implements Parcelable.Creator<b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        a aVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                aVar = (a) b.a(parcel, a2, a.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new b(i, aVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i) {
        return new b[i];
    }
}
