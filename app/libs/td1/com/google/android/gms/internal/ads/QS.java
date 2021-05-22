package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class QS {

    /* renamed from: a  reason: collision with root package name */
    private final long f2937a = q.j().a();

    /* renamed from: b  reason: collision with root package name */
    private final TS f2938b = new TS();

    /* renamed from: c  reason: collision with root package name */
    private long f2939c = this.f2937a;
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public final long a() {
        return this.f2937a;
    }

    public final long b() {
        return this.f2939c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return "Created: " + this.f2937a + " Last accessed: " + this.f2939c + " Accesses: " + this.d + "\nEntries retrieved: Valid: " + this.e + " Stale: " + this.f;
    }

    public final void e() {
        this.f2939c = q.j().a();
        this.d++;
    }

    public final void f() {
        this.e++;
        this.f2938b.f3178a = true;
    }

    public final void g() {
        this.f++;
        this.f2938b.f3179b++;
    }

    public final TS h() {
        TS ts = (TS) this.f2938b.clone();
        TS ts2 = this.f2938b;
        ts2.f3178a = false;
        ts2.f3179b = 0;
        return ts;
    }
}
