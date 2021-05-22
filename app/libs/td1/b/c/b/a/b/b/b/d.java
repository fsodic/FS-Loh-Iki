package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.b;

public final class d implements Parcelable.Creator<a.C0012a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.C0012a createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        b.c.b.a.b.b.a.b bVar = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.w(parcel, a2);
                    break;
                case 2:
                    i2 = b.w(parcel, a2);
                    break;
                case 3:
                    z = b.s(parcel, a2);
                    break;
                case 4:
                    i3 = b.w(parcel, a2);
                    break;
                case 5:
                    z2 = b.s(parcel, a2);
                    break;
                case 6:
                    str = b.o(parcel, a2);
                    break;
                case 7:
                    i4 = b.w(parcel, a2);
                    break;
                case 8:
                    str2 = b.o(parcel, a2);
                    break;
                case 9:
                    bVar = (b.c.b.a.b.b.a.b) b.a(parcel, a2, b.c.b.a.b.b.a.b.CREATOR);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new a.C0012a(i, i2, z, i3, z2, str, i4, str2, bVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.C0012a[] newArray(int i) {
        return new a.C0012a[i];
    }
}
