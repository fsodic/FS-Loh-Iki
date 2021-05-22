package com.google.android.gms.internal.ads;

import android.os.Bundle;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bC  reason: case insensitive filesystem */
public final class BinderC0962bC extends AbstractBinderC0735Vb {

    /* renamed from: a  reason: collision with root package name */
    private final String f3867a;

    /* renamed from: b  reason: collision with root package name */
    private final C0525Mz f3868b;

    /* renamed from: c  reason: collision with root package name */
    private final C0707Tz f3869c;

    public BinderC0962bC(String str, C0525Mz mz, C0707Tz tz) {
        this.f3867a = str;
        this.f3868b = mz;
        this.f3869c = tz;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final double B() {
        return this.f3869c.l();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final AbstractC2187spa C() {
        if (!((Boolean) C2392voa.e().a(C2474x.Ge)).booleanValue()) {
            return null;
        }
        return this.f3868b.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final String D() {
        return this.f3869c.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void Db() {
        this.f3868b.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final String E() {
        return this.f3869c.m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final boolean G() {
        return this.f3868b.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final boolean Ga() {
        return !this.f3869c.j().isEmpty() && this.f3869c.r() != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void a(AbstractC0657Sb sb) {
        this.f3868b.a(sb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void a(AbstractC1223epa epa) {
        this.f3868b.a(epa);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void a(AbstractC1498ipa ipa) {
        this.f3868b.a(ipa);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void a(AbstractC2118rpa rpa) {
        this.f3868b.a(rpa);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void b(Bundle bundle) {
        this.f3868b.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final boolean c(Bundle bundle) {
        return this.f3868b.c(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void d(Bundle bundle) {
        this.f3868b.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void destroy() {
        this.f3868b.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final List<?> fb() {
        return Ga() ? this.f3869c.j() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final Bundle getExtras() {
        return this.f3869c.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final AbstractC2532xpa getVideoController() {
        return this.f3869c.n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final AbstractC0708Ua ha() {
        return this.f3868b.m().a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final String k() {
        return this.f3867a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final String l() {
        return this.f3869c.g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final a m() {
        return this.f3869c.B();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final AbstractC0630Ra n() {
        return this.f3869c.A();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final String o() {
        return this.f3869c.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final String s() {
        return this.f3869c.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final List<?> t() {
        return this.f3869c.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void v() {
        this.f3868b.p();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final AbstractC0812Ya w() {
        return this.f3869c.z();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final void x() {
        this.f3868b.g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final String y() {
        return this.f3869c.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0761Wb
    public final a z() {
        return b.a(this.f3868b);
    }
}
