package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.v;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.boa  reason: case insensitive filesystem */
public final class C1015boa extends a {
    public static final Parcelable.Creator<C1015boa> CREATOR = new C1221eoa();

    /* renamed from: a  reason: collision with root package name */
    public final String f3940a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3941b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3942c;
    public final boolean d;
    public final int e;
    public final int f;
    public final C1015boa[] g;
    public final boolean h;
    public final boolean i;
    public boolean j;
    public boolean k;
    private boolean l;
    public boolean m;
    public boolean n;

    public C1015boa() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public C1015boa(Context context, f fVar) {
        this(context, new f[]{fVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1015boa(android.content.Context r13, com.google.android.gms.ads.f[] r14) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1015boa.<init>(android.content.Context, com.google.android.gms.ads.f[]):void");
    }

    C1015boa(String str, int i2, int i3, boolean z, int i4, int i5, C1015boa[] boaArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f3940a = str;
        this.f3941b = i2;
        this.f3942c = i3;
        this.d = z;
        this.e = i4;
        this.f = i5;
        this.g = boaArr;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
    }

    public static C1015boa L() {
        return new C1015boa("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false);
    }

    public static C1015boa M() {
        return new C1015boa("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static C1015boa N() {
        return new C1015boa("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false);
    }

    public static C1015boa O() {
        return new C1015boa("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false);
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) c(displayMetrics)) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public final f P() {
        return v.a(this.e, this.f3941b, this.f3940a);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f3940a, false);
        c.a(parcel, 3, this.f3941b);
        c.a(parcel, 4, this.f3942c);
        c.a(parcel, 5, this.d);
        c.a(parcel, 6, this.e);
        c.a(parcel, 7, this.f);
        c.a(parcel, 8, (Parcelable[]) this.g, i2, false);
        c.a(parcel, 9, this.h);
        c.a(parcel, 10, this.i);
        c.a(parcel, 11, this.j);
        c.a(parcel, 12, this.k);
        c.a(parcel, 13, this.l);
        c.a(parcel, 14, this.m);
        c.a(parcel, 15, this.n);
        c.a(parcel, a2);
    }
}
