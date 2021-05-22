package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.mediation.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Rf  reason: case insensitive filesystem */
public final class BinderC0635Rf extends AbstractBinderC0245Cf {

    /* renamed from: a  reason: collision with root package name */
    private final t f3030a;

    public BinderC0635Rf(t tVar) {
        this.f3030a = tVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final String D() {
        return this.f3030a.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final boolean L() {
        return this.f3030a.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final a M() {
        View h = this.f3030a.h();
        if (h == null) {
            return null;
        }
        return b.a(h);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final a O() {
        View a2 = this.f3030a.a();
        if (a2 == null) {
            return null;
        }
        return b.a(a2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final boolean T() {
        return this.f3030a.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void a(a aVar) {
        this.f3030a.c((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f3030a.a((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void b(a aVar) {
        this.f3030a.a((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void d(a aVar) {
        this.f3030a.b((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final Bundle getExtras() {
        return this.f3030a.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final AbstractC2532xpa getVideoController() {
        if (this.f3030a.e() != null) {
            return this.f3030a.e().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final AbstractC0812Ya ja() {
        c.b n = this.f3030a.n();
        if (n != null) {
            return new BinderC0474La(n.a(), n.d(), n.c(), n.e(), n.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final String l() {
        return this.f3030a.l();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final a m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final AbstractC0630Ra n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final String o() {
        return this.f3030a.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final String s() {
        return this.f3030a.j();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final List t() {
        List<c.b> m = this.f3030a.m();
        if (m == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c.b bVar : m) {
            arrayList.add(new BinderC0474La(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void u() {
        this.f3030a.g();
    }
}
