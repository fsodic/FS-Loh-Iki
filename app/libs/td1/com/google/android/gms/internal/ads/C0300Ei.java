package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Ei  reason: case insensitive filesystem */
public final class C0300Ei extends a {
    public static final Parcelable.Creator<C0300Ei> CREATOR = new C0274Di();

    /* renamed from: a  reason: collision with root package name */
    public final Zna f1887a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1888b;

    public C0300Ei(Zna zna, String str) {
        this.f1887a = zna;
        this.f1888b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f1887a, i, false);
        c.a(parcel, 3, this.f1888b, false);
        c.a(parcel, a2);
    }
}
