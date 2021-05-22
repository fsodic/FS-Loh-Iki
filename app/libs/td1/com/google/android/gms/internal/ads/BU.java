package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class BU extends a {
    public static final Parcelable.Creator<BU> CREATOR = new EU();

    /* renamed from: a  reason: collision with root package name */
    private final int f1612a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1613b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1614c;

    BU(int i, String str, String str2) {
        this.f1612a = i;
        this.f1613b = str;
        this.f1614c = str2;
    }

    public BU(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1612a);
        c.a(parcel, 2, this.f1613b, false);
        c.a(parcel, 3, this.f1614c, false);
        c.a(parcel, a2);
    }
}
