package com.google.android.gms.games.internal.a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class c implements Parcelable.Creator<a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        long j = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    str = b.o(parcel, a2);
                    break;
                case 2:
                    str2 = b.o(parcel, a2);
                    break;
                case 3:
                    j = b.x(parcel, a2);
                    break;
                case 4:
                    uri = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) b.a(parcel, a2, Uri.CREATOR);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new a(str, str2, j, uri, uri2, uri3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
