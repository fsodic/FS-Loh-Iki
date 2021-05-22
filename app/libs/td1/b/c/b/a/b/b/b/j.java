package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

public final class j implements Parcelable.Creator<g> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                str = b.o(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                arrayList = b.c(parcel, a2, h.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new g(i, str, arrayList);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i) {
        return new g[i];
    }
}
