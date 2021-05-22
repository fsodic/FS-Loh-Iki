package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1081a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1082b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1083c;
    public final boolean d;
    public final float e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    g(boolean z, boolean z2, String str, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this.f1081a = z;
        this.f1082b = z2;
        this.f1083c = str;
        this.d = z3;
        this.e = f2;
        this.f = i2;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public g(boolean z, boolean z2, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this(false, z2, null, false, 0.0f, -1, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1081a);
        c.a(parcel, 3, this.f1082b);
        c.a(parcel, 4, this.f1083c, false);
        c.a(parcel, 5, this.d);
        c.a(parcel, 6, this.e);
        c.a(parcel, 7, this.f);
        c.a(parcel, 8, this.g);
        c.a(parcel, 9, this.h);
        c.a(parcel, 10, this.i);
        c.a(parcel, a2);
    }
}
