package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class Ika implements Aka {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2264a;

    /* renamed from: b  reason: collision with root package name */
    private long f2265b;

    /* renamed from: c  reason: collision with root package name */
    private long f2266c;
    private Nga d = Nga.f2682a;

    @Override // com.google.android.gms.internal.ads.Aka
    public final long a() {
        long j = this.f2265b;
        if (!this.f2264a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2266c;
        Nga nga = this.d;
        return j + (nga.f2683b == 1.0f ? C2238tga.b(elapsedRealtime) : nga.a(elapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.Aka
    public final Nga a(Nga nga) {
        if (this.f2264a) {
            a(a());
        }
        this.d = nga;
        return nga;
    }

    public final void a(long j) {
        this.f2265b = j;
        if (this.f2264a) {
            this.f2266c = SystemClock.elapsedRealtime();
        }
    }

    public final void a(Aka aka) {
        a(aka.a());
        this.d = aka.b();
    }

    @Override // com.google.android.gms.internal.ads.Aka
    public final Nga b() {
        return this.d;
    }

    public final void c() {
        if (!this.f2264a) {
            this.f2266c = SystemClock.elapsedRealtime();
            this.f2264a = true;
        }
    }

    public final void d() {
        if (this.f2264a) {
            a(a());
            this.f2264a = false;
        }
    }
}
