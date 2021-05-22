package b.c.b.a.b.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.a.a;
import com.google.android.gms.common.internal.a.b;

public final class e implements Parcelable.Creator<a.C0011a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.C0011a createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
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
                i2 = b.w(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new a.C0011a(i, str, i2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.C0011a[] newArray(int i) {
        return new a.C0011a[i];
    }
}
