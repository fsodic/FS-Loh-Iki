package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.mediation.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Of  reason: case insensitive filesystem */
public final class BinderC0557Of extends AbstractBinderC0219Bf {

    /* renamed from: a  reason: collision with root package name */
    private final s f2765a;

    public BinderC0557Of(s sVar) {
        this.f2765a = sVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final double B() {
        return this.f2765a.o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final String E() {
        return this.f2765a.p();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final boolean L() {
        return this.f2765a.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final a M() {
        View h = this.f2765a.h();
        if (h == null) {
            return null;
        }
        return b.a(h);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final a O() {
        View a2 = this.f2765a.a();
        if (a2 == null) {
            return null;
        }
        return b.a(a2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final boolean T() {
        return this.f2765a.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final void a(a aVar) {
        this.f2765a.c((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f2765a.a((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final void b(a aVar) {
        this.f2765a.a((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final void d(a aVar) {
        this.f2765a.b((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final Bundle getExtras() {
        return this.f2765a.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final AbstractC2532xpa getVideoController() {
        if (this.f2765a.e() != null) {
            return this.f2765a.e().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final String l() {
        return this.f2765a.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final a m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final AbstractC0630Ra n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final String o() {
        return this.f2765a.j();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final String s() {
        return this.f2765a.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final List t() {
        List<c.b> m = this.f2765a.m();
        if (m == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c.b bVar : m) {
            arrayList.add(new BinderC0474La(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final void u() {
        this.f2765a.g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final AbstractC0812Ya w() {
        c.b l = this.f2765a.l();
        if (l != null) {
            return new BinderC0474La(l.a(), l.d(), l.c(), l.e(), l.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2580yf
    public final String y() {
        return this.f2765a.n();
    }
}
