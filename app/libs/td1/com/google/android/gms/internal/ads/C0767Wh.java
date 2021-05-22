package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Wh  reason: case insensitive filesystem */
public final class C0767Wh extends a {
    public static final Parcelable.Creator<C0767Wh> CREATOR = new C0741Vh();

    /* renamed from: a  reason: collision with root package name */
    String f3446a;

    public C0767Wh(String str) {
        this.f3446a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f3446a, false);
        c.a(parcel, a2);
    }
}
