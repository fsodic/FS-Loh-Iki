package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class Qja {

    /* renamed from: a  reason: collision with root package name */
    public final String f2956a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2957b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2958c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final boolean l;

    public Qja() {
        this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    private Qja(String str, String str2, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, int i5, int i6, boolean z5) {
        this.f2956a = null;
        this.f2957b = null;
        this.f2958c = false;
        this.d = true;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = true;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Qja.class == obj.getClass()) {
            Qja qja = (Qja) obj;
            return this.d == qja.d && this.e == qja.e && this.f == qja.f && this.h == qja.h && this.i == qja.i && this.l == qja.l && this.j == qja.j && this.k == qja.k && this.g == qja.g && TextUtils.equals(null, null) && TextUtils.equals(null, null);
        }
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.d ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k;
    }
}
