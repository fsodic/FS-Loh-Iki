package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.b;

public final class e implements Parcelable.Creator<h> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        a.C0012a aVar = null;
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
                aVar = (a.C0012a) b.a(parcel, a2, a.C0012a.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new h(i, str, aVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i) {
        return new h[i];
    }
}
