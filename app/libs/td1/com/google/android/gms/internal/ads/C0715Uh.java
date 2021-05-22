package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Uh  reason: case insensitive filesystem */
public final class C0715Uh extends a {
    public static final Parcelable.Creator<C0715Uh> CREATOR = new C0689Th();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f3269a;

    /* renamed from: b  reason: collision with root package name */
    public final C0823Yl f3270b;

    /* renamed from: c  reason: collision with root package name */
    public final ApplicationInfo f3271c;
    public final String d;
    public final List<String> e;
    public final PackageInfo f;
    public final String g;
    public final boolean h;
    public final String i;
    public C2562yS j;
    public String k;

    public C0715Uh(Bundle bundle, C0823Yl yl, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3, C2562yS ySVar, String str4) {
        this.f3269a = bundle;
        this.f3270b = yl;
        this.d = str;
        this.f3271c = applicationInfo;
        this.e = list;
        this.f = packageInfo;
        this.g = str2;
        this.h = z;
        this.i = str3;
        this.j = ySVar;
        this.k = str4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3269a, false);
        c.a(parcel, 2, (Parcelable) this.f3270b, i2, false);
        c.a(parcel, 3, (Parcelable) this.f3271c, i2, false);
        c.a(parcel, 4, this.d, false);
        c.b(parcel, 5, this.e, false);
        c.a(parcel, 6, (Parcelable) this.f, i2, false);
        c.a(parcel, 7, this.g, false);
        c.a(parcel, 8, this.h);
        c.a(parcel, 9, this.i, false);
        c.a(parcel, 10, (Parcelable) this.j, i2, false);
        c.a(parcel, 11, this.k, false);
        c.a(parcel, a2);
    }
}
