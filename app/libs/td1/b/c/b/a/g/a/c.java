package b.c.b.a.g.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class c implements Parcelable.Creator<b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.w(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                intent = (Intent) b.a(parcel, a2, Intent.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new b(i, i2, intent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i) {
        return new b[i];
    }
}
