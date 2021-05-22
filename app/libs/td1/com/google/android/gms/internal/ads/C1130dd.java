package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.dd  reason: case insensitive filesystem */
public final class C1130dd extends a {
    public static final Parcelable.Creator<C1130dd> CREATOR = new C1336gd();

    /* renamed from: a  reason: collision with root package name */
    public final String f4116a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4117b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4118c;
    public final String d;

    public C1130dd(String str, boolean z, int i, String str2) {
        this.f4116a = str;
        this.f4117b = z;
        this.f4118c = i;
        this.d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4116a, false);
        c.a(parcel, 2, this.f4117b);
        c.a(parcel, 3, this.f4118c);
        c.a(parcel, 4, this.d, false);
        c.a(parcel, a2);
    }
}
