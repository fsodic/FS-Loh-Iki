package com.google.android.gms.internal.ads;

import android.os.Bundle;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import java.util.List;

public final class ZB extends AbstractBinderC1814nb {

    /* renamed from: a  reason: collision with root package name */
    private final String f3612a;

    /* renamed from: b  reason: collision with root package name */
    private final C0525Mz f3613b;

    /* renamed from: c  reason: collision with root package name */
    private final C0707Tz f3614c;

    public ZB(String str, C0525Mz mz, C0707Tz tz) {
        this.f3612a = str;
        this.f3613b = mz;
        this.f3614c = tz;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String D() {
        return this.f3614c.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final void b(Bundle bundle) {
        this.f3613b.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final boolean c(Bundle bundle) {
        return this.f3613b.c(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final void d(Bundle bundle) {
        this.f3613b.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final void destroy() {
        this.f3613b.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final Bundle getExtras() {
        return this.f3614c.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final AbstractC2532xpa getVideoController() {
        return this.f3614c.n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final AbstractC0812Ya ja() {
        return this.f3614c.C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String k() {
        return this.f3612a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String l() {
        return this.f3614c.g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final a m() {
        return this.f3614c.B();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final AbstractC0630Ra n() {
        return this.f3614c.A();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String o() {
        return this.f3614c.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String s() {
        return this.f3614c.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final List<?> t() {
        return this.f3614c.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final a z() {
        return b.a(this.f3613b);
    }
}
