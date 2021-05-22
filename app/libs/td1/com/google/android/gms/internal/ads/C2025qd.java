package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.qd  reason: case insensitive filesystem */
public final class C2025qd implements Parcelable.Creator<C1818nd> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1818nd createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.o(parcel, a2);
            } else if (a3 != 2) {
                b.z(parcel, a2);
            } else {
                bundle = b.f(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C1818nd(str, bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1818nd[] newArray(int i) {
        return new C1818nd[i];
    }
}
