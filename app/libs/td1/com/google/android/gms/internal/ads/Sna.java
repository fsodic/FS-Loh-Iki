package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class Sna extends a {
    public static final Parcelable.Creator<Sna> CREATOR = new Rna();

    /* renamed from: a  reason: collision with root package name */
    public final int f3128a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3129b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3130c;

    public Sna(int i, String str, String str2) {
        this.f3128a = i;
        this.f3129b = str;
        this.f3130c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3128a);
        c.a(parcel, 2, this.f3129b, false);
        c.a(parcel, 3, this.f3130c, false);
        c.a(parcel, a2);
    }
}
