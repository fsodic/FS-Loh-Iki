package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Pj  reason: case insensitive filesystem */
public final class C0587Pj extends a {
    public static final Parcelable.Creator<C0587Pj> CREATOR = new C0665Sj();
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public final String f2872a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2873b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final C1015boa f2874c;
    public final Zna d;

    public C0587Pj(String str, String str2, C1015boa boa, Zna zna) {
        this.f2872a = str;
        this.f2873b = str2;
        this.f2874c = boa;
        this.d = zna;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2872a, false);
        c.a(parcel, 2, this.f2873b, false);
        c.a(parcel, 3, (Parcelable) this.f2874c, i, false);
        c.a(parcel, 4, (Parcelable) this.d, i, false);
        c.a(parcel, a2);
    }
}
