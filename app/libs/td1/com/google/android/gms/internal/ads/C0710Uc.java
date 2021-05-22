package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Uc  reason: case insensitive filesystem */
public final class C0710Uc implements Parcelable.Creator<C0632Rc> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0632Rc createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    z = b.s(parcel, a2);
                    break;
                case 2:
                    str = b.o(parcel, a2);
                    break;
                case 3:
                    i = b.w(parcel, a2);
                    break;
                case 4:
                    bArr = b.g(parcel, a2);
                    break;
                case 5:
                    strArr = b.p(parcel, a2);
                    break;
                case 6:
                    strArr2 = b.p(parcel, a2);
                    break;
                case 7:
                    z2 = b.s(parcel, a2);
                    break;
                case 8:
                    j = b.x(parcel, a2);
                    break;
                default:
                    b.z(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C0632Rc(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0632Rc[] newArray(int i) {
        return new C0632Rc[i];
    }
}
