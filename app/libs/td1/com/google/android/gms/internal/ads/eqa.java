package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class eqa extends a {
    public static final Parcelable.Creator<eqa> CREATOR = new gqa();

    /* renamed from: a  reason: collision with root package name */
    public final String f4252a;

    public eqa(com.google.android.gms.ads.h.a aVar) {
        aVar.a();
        throw null;
    }

    eqa(String str) {
        this.f4252a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 15, this.f4252a, false);
        c.a(parcel, a2);
    }
}
