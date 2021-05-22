package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class MU extends a {
    public static final Parcelable.Creator<MU> CREATOR = new PU();

    /* renamed from: a  reason: collision with root package name */
    private final int f2590a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2591b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2592c;
    private final String d;
    private final int e;

    MU(int i, int i2, int i3, String str, String str2) {
        this.f2590a = i;
        this.f2591b = i2;
        this.f2592c = str;
        this.d = str2;
        this.e = i3;
    }

    public MU(int i, EnumC1274fga fga, String str, String str2) {
        this(1, i, fga.a(), str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2590a);
        c.a(parcel, 2, this.f2591b);
        c.a(parcel, 3, this.f2592c, false);
        c.a(parcel, 4, this.d, false);
        c.a(parcel, 5, this.e);
        c.a(parcel, a2);
    }
}
