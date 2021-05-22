package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import org.cocos2dx.lib.BuildConfig;

@KeepName
public class PlusCommonExtras extends a {
    public static final Parcelable.Creator<PlusCommonExtras> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    private final int f6232a;

    /* renamed from: b  reason: collision with root package name */
    private String f6233b;

    /* renamed from: c  reason: collision with root package name */
    private String f6234c;

    public PlusCommonExtras() {
        this.f6232a = 1;
        this.f6233b = BuildConfig.FLAVOR;
        this.f6234c = BuildConfig.FLAVOR;
    }

    PlusCommonExtras(int i, String str, String str2) {
        this.f6232a = i;
        this.f6233b = str;
        this.f6234c = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusCommonExtras)) {
            return false;
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
        return this.f6232a == plusCommonExtras.f6232a && q.a(this.f6233b, plusCommonExtras.f6233b) && q.a(this.f6234c, plusCommonExtras.f6234c);
    }

    public int hashCode() {
        return q.a(Integer.valueOf(this.f6232a), this.f6233b, this.f6234c);
    }

    public String toString() {
        q.a a2 = q.a(this);
        a2.a("versionCode", Integer.valueOf(this.f6232a));
        a2.a("Gpsrc", this.f6233b);
        a2.a("ClientCallingPackage", this.f6234c);
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f6233b, false);
        c.a(parcel, 2, this.f6234c, false);
        c.a(parcel, 1000, this.f6232a);
        c.a(parcel, a2);
    }
}
