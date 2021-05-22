package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class k implements Parcelable.Creator<c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Parcel parcel2 = null;
        int i = 0;
        f fVar = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                parcel2 = b.m(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                fVar = (f) b.a(parcel, a2, f.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new c(i, parcel2, fVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i) {
        return new c[i];
    }
}
