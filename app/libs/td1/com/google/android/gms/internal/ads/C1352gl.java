package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.q;

/* renamed from: com.google.android.gms.internal.ads.gl  reason: case insensitive filesystem */
public final class C1352gl {

    /* renamed from: a  reason: collision with root package name */
    public final String f4415a;

    /* renamed from: b  reason: collision with root package name */
    private final double f4416b;

    /* renamed from: c  reason: collision with root package name */
    private final double f4417c;
    public final double d;
    public final int e;

    public C1352gl(String str, double d2, double d3, double d4, int i) {
        this.f4415a = str;
        this.f4417c = d2;
        this.f4416b = d3;
        this.d = d4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1352gl)) {
            return false;
        }
        C1352gl glVar = (C1352gl) obj;
        return q.a(this.f4415a, glVar.f4415a) && this.f4416b == glVar.f4416b && this.f4417c == glVar.f4417c && this.e == glVar.e && Double.compare(this.d, glVar.d) == 0;
    }

    public final int hashCode() {
        return q.a(this.f4415a, Double.valueOf(this.f4416b), Double.valueOf(this.f4417c), Double.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        q.a a2 = q.a(this);
        a2.a("name", this.f4415a);
        a2.a("minBound", Double.valueOf(this.f4417c));
        a2.a("maxBound", Double.valueOf(this.f4416b));
        a2.a("percent", Double.valueOf(this.d));
        a2.a("count", Integer.valueOf(this.e));
        return a2.toString();
    }
}
