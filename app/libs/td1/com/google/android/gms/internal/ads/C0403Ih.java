package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Ih  reason: case insensitive filesystem */
public final class C0403Ih implements Parcelable.Creator<C0299Eh> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0299Eh createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                z = b.s(parcel, a2);
            } else if (a3 != 3) {
                b.z(parcel, a2);
            } else {
                arrayList = b.q(parcel, a2);
            }
        }
        b.r(parcel, b2);
        return new C0299Eh(z, arrayList);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0299Eh[] newArray(int i) {
        return new C0299Eh[i];
    }
}
