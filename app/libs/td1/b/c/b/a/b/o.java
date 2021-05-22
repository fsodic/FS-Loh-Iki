package b.c.b.a.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class o implements Parcelable.Creator<b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.w(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.w(parcel, a2);
            } else if (a3 == 3) {
                pendingIntent = (PendingIntent) b.a(parcel, a2, PendingIntent.CREATOR);
            } else if (a3 != 4) {
                b.z(parcel, a2);
            } else {
                str = b.o(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new b(i, i2, pendingIntent, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i) {
        return new b[i];
    }
}
