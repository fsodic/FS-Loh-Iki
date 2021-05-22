package b.c.b.a.b.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.a.a;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

public final class d implements Parcelable.Creator<a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                arrayList = b.c(parcel, a2, a.C0011a.CREATOR);
            }
        }
        b.r(parcel, b2);
        return new a(i, arrayList);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
