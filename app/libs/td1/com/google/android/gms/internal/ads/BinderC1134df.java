package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import b.c.b.a.c.b;
import b.c.b.a.e.a.a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.df  reason: case insensitive filesystem */
public final class BinderC1134df extends AbstractBinderC2324up {

    /* renamed from: a  reason: collision with root package name */
    private final a f4122a;

    BinderC1134df(a aVar) {
        this.f4122a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final void A(String str) {
        this.f4122a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final void D(String str) {
        this.f4122a.b(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final String Da() {
        return this.f4122a.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final long Ia() {
        return this.f4122a.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final String Ka() {
        return this.f4122a.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final Map a(String str, String str2, boolean z) {
        return this.f4122a.a(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final void a(String str, String str2, Bundle bundle) {
        this.f4122a.a(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final void a(String str, String str2, b.c.b.a.c.a aVar) {
        this.f4122a.a(str, str2, aVar != null ? b.Q(aVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final String ab() {
        return this.f4122a.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final List b(String str, String str2) {
        return this.f4122a.a(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final void b(b.c.b.a.c.a aVar, String str, String str2) {
        this.f4122a.a(aVar != null ? (Activity) b.Q(aVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final void c(String str, String str2, Bundle bundle) {
        this.f4122a.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final String cb() {
        return this.f4122a.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final void e(Bundle bundle) {
        this.f4122a.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final Bundle f(Bundle bundle) {
        return this.f4122a.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final void h(Bundle bundle) {
        this.f4122a.c(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final String kb() {
        return this.f4122a.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2393vp
    public final int m(String str) {
        return this.f4122a.c(str);
    }
}
