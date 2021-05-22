package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f1102a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1103b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1104c;
    public final String d;
    public final String e;
    public final String f;
    private final String g;
    public final Intent h;

    public d(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f1102a = str;
        this.f1103b = str2;
        this.f1104c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1102a, false);
        c.a(parcel, 3, this.f1103b, false);
        c.a(parcel, 4, this.f1104c, false);
        c.a(parcel, 5, this.d, false);
        c.a(parcel, 6, this.e, false);
        c.a(parcel, 7, this.f, false);
        c.a(parcel, 8, this.g, false);
        c.a(parcel, 9, (Parcelable) this.h, i, false);
        c.a(parcel, a2);
    }
}
