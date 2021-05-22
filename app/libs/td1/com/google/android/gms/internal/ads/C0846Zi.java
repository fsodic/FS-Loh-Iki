package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Zi  reason: case insensitive filesystem */
public final class C0846Zi extends a {
    public static final Parcelable.Creator<C0846Zi> CREATOR = new C0935aj();

    /* renamed from: a  reason: collision with root package name */
    public final String f3661a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3662b;

    public C0846Zi(String str, String str2) {
        this.f3661a = str;
        this.f3662b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3661a, false);
        c.a(parcel, 2, this.f3662b, false);
        c.a(parcel, a2);
    }
}
