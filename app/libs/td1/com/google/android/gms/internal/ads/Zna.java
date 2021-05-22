package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.List;

public final class Zna extends a {
    public static final Parcelable.Creator<Zna> CREATOR = new C0946aoa();

    /* renamed from: a  reason: collision with root package name */
    public final int f3677a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final long f3678b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f3679c;
    @Deprecated
    public final int d;
    public final List<String> e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final eqa j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List<String> o;
    public final String p;
    public final String q;
    @Deprecated
    public final boolean r;
    public final Qna s;
    public final int t;
    public final String u;
    public final List<String> v;

    public Zna(int i2, long j2, Bundle bundle, int i3, List<String> list, boolean z, int i4, boolean z2, String str, eqa eqa, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, Qna qna, int i5, String str5, List<String> list3) {
        this.f3677a = i2;
        this.f3678b = j2;
        this.f3679c = bundle == null ? new Bundle() : bundle;
        this.d = i3;
        this.e = list;
        this.f = z;
        this.g = i4;
        this.h = z2;
        this.i = str;
        this.j = eqa;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
        this.s = qna;
        this.t = i5;
        this.u = str5;
        this.v = list3 == null ? new ArrayList<>() : list3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Zna)) {
            return false;
        }
        Zna zna = (Zna) obj;
        return this.f3677a == zna.f3677a && this.f3678b == zna.f3678b && q.a(this.f3679c, zna.f3679c) && this.d == zna.d && q.a(this.e, zna.e) && this.f == zna.f && this.g == zna.g && this.h == zna.h && q.a(this.i, zna.i) && q.a(this.j, zna.j) && q.a(this.k, zna.k) && q.a(this.l, zna.l) && q.a(this.m, zna.m) && q.a(this.n, zna.n) && q.a(this.o, zna.o) && q.a(this.p, zna.p) && q.a(this.q, zna.q) && this.r == zna.r && this.t == zna.t && q.a(this.u, zna.u) && q.a(this.v, zna.v);
    }

    public final int hashCode() {
        return q.a(Integer.valueOf(this.f3677a), Long.valueOf(this.f3678b), this.f3679c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.t), this.u, this.v);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3677a);
        c.a(parcel, 2, this.f3678b);
        c.a(parcel, 3, this.f3679c, false);
        c.a(parcel, 4, this.d);
        c.b(parcel, 5, this.e, false);
        c.a(parcel, 6, this.f);
        c.a(parcel, 7, this.g);
        c.a(parcel, 8, this.h);
        c.a(parcel, 9, this.i, false);
        c.a(parcel, 10, (Parcelable) this.j, i2, false);
        c.a(parcel, 11, (Parcelable) this.k, i2, false);
        c.a(parcel, 12, this.l, false);
        c.a(parcel, 13, this.m, false);
        c.a(parcel, 14, this.n, false);
        c.b(parcel, 15, this.o, false);
        c.a(parcel, 16, this.p, false);
        c.a(parcel, 17, this.q, false);
        c.a(parcel, 18, this.r);
        c.a(parcel, 19, (Parcelable) this.s, i2, false);
        c.a(parcel, 20, this.t);
        c.a(parcel, 21, this.u, false);
        c.b(parcel, 22, this.v, false);
        c.a(parcel, a2);
    }
}
