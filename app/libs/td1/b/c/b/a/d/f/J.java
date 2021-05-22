package b.c.b.a.d.f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class J implements Parcelable.Creator<H> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ H createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    j = b.x(parcel, a2);
                    break;
                case 2:
                    j2 = b.x(parcel, a2);
                    break;
                case 3:
                    z = b.s(parcel, a2);
                    break;
                case 4:
                    str = b.o(parcel, a2);
                    break;
                case 5:
                    str2 = b.o(parcel, a2);
                    break;
                case 6:
                    str3 = b.o(parcel, a2);
                    break;
                case 7:
                    bundle = b.f(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new H(j, j2, z, str, str2, str3, bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ H[] newArray(int i) {
        return new H[i];
    }
}
