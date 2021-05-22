package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import java.util.Arrays;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    private final int f6235a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6236b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f6237c;
    private final String[] d;
    private final String[] e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final PlusCommonExtras j;

    e(int i2, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5, PlusCommonExtras plusCommonExtras) {
        this.f6235a = i2;
        this.f6236b = str;
        this.f6237c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = plusCommonExtras;
    }

    public e(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, PlusCommonExtras plusCommonExtras) {
        this.f6235a = 1;
        this.f6236b = str;
        this.f6237c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str2;
        this.g = str3;
        this.h = null;
        this.i = null;
        this.j = plusCommonExtras;
    }

    public final Bundle B() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", com.google.android.gms.common.internal.a.e.a(this.j));
        return bundle;
    }

    public final String[] c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6235a == eVar.f6235a && q.a(this.f6236b, eVar.f6236b) && Arrays.equals(this.f6237c, eVar.f6237c) && Arrays.equals(this.d, eVar.d) && Arrays.equals(this.e, eVar.e) && q.a(this.f, eVar.f) && q.a(this.g, eVar.g) && q.a(this.h, eVar.h) && q.a(this.i, eVar.i) && q.a(this.j, eVar.j);
    }

    public final int hashCode() {
        return q.a(Integer.valueOf(this.f6235a), this.f6236b, this.f6237c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final String toString() {
        q.a a2 = q.a(this);
        a2.a("versionCode", Integer.valueOf(this.f6235a));
        a2.a("accountName", this.f6236b);
        a2.a("requestedScopes", this.f6237c);
        a2.a("visibleActivities", this.d);
        a2.a("requiredFeatures", this.e);
        a2.a("packageNameForAuth", this.f);
        a2.a("callingPackageName", this.g);
        a2.a("applicationName", this.h);
        a2.a("extra", this.j.toString());
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f6236b, false);
        c.a(parcel, 2, this.f6237c, false);
        c.a(parcel, 3, this.d, false);
        c.a(parcel, 4, this.e, false);
        c.a(parcel, 5, this.f, false);
        c.a(parcel, 6, this.g, false);
        c.a(parcel, 7, this.h, false);
        c.a(parcel, 1000, this.f6235a);
        c.a(parcel, 8, this.i, false);
        c.a(parcel, 9, (Parcelable) this.j, i2, false);
        c.a(parcel, a2);
    }

    public final String y() {
        return this.f;
    }
}
