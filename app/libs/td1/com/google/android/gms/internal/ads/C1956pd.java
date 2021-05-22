package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.pd  reason: case insensitive filesystem */
public final class C1956pd extends a {
    public static final Parcelable.Creator<C1956pd> CREATOR = new C2162sd();

    /* renamed from: a  reason: collision with root package name */
    public final int f5248a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5249b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5250c;
    public final int d;

    public C1956pd(int i, int i2, String str, int i3) {
        this.f5248a = i;
        this.f5249b = i2;
        this.f5250c = str;
        this.d = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5249b);
        c.a(parcel, 2, this.f5250c, false);
        c.a(parcel, 3, this.d);
        c.a(parcel, 1000, this.f5248a);
        c.a(parcel, a2);
    }
}
