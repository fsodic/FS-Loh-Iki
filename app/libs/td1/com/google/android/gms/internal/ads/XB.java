package com.google.android.gms.internal.ads;

import android.os.Bundle;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import java.util.List;

public final class XB extends AbstractBinderC1538jb {

    /* renamed from: a  reason: collision with root package name */
    private final String f3475a;

    /* renamed from: b  reason: collision with root package name */
    private final C0525Mz f3476b;

    /* renamed from: c  reason: collision with root package name */
    private final C0707Tz f3477c;

    public XB(String str, C0525Mz mz, C0707Tz tz) {
        this.f3475a = str;
        this.f3476b = mz;
        this.f3477c = tz;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final double B() {
        return this.f3477c.l();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String E() {
        return this.f3477c.m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final void b(Bundle bundle) {
        this.f3476b.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final boolean c(Bundle bundle) {
        return this.f3476b.c(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final void d(Bundle bundle) {
        this.f3476b.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final void destroy() {
        this.f3476b.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final Bundle getExtras() {
        return this.f3477c.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final AbstractC2532xpa getVideoController() {
        return this.f3477c.n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String k() {
        return this.f3475a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String l() {
        return this.f3477c.g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final a m() {
        return this.f3477c.B();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final AbstractC0630Ra n() {
        return this.f3477c.A();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String o() {
        return this.f3477c.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String s() {
        return this.f3477c.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final List<?> t() {
        return this.f3477c.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final AbstractC0812Ya w() {
        return this.f3477c.z();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String y() {
        return this.f3477c.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final a z() {
        return b.a(this.f3476b);
    }
}
