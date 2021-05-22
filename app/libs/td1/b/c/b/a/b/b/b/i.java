package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

public final class i implements Parcelable.Creator<f> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                arrayList = b.c(parcel, a2, g.CREATOR);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                str = b.o(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new f(i, arrayList, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i) {
        return new f[i];
    }
}
