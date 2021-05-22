package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.mediation.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Yf  reason: case insensitive filesystem */
public final class BinderC0817Yf extends AbstractBinderC0375Hf {

    /* renamed from: a  reason: collision with root package name */
    private final y f3577a;

    public BinderC0817Yf(y yVar) {
        this.f3577a = yVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final double B() {
        if (this.f3577a.o() != null) {
            return this.f3577a.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final float Ba() {
        return this.f3577a.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String D() {
        return this.f3577a.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String E() {
        return this.f3577a.p();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final float Ea() {
        return this.f3577a.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final boolean L() {
        return this.f3577a.m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final a M() {
        View t = this.f3577a.t();
        if (t == null) {
            return null;
        }
        return b.a(t);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final a O() {
        View a2 = this.f3577a.a();
        if (a2 == null) {
            return null;
        }
        return b.a(a2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final boolean T() {
        return this.f3577a.l();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final void a(a aVar) {
        this.f3577a.b((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f3577a.a((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final void b(a aVar) {
        this.f3577a.a((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final Bundle getExtras() {
        return this.f3577a.g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final AbstractC2532xpa getVideoController() {
        if (this.f3577a.q() != null) {
            return this.f3577a.q().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String l() {
        return this.f3577a.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final a m() {
        Object u = this.f3577a.u();
        if (u == null) {
            return null;
        }
        return b.a(u);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final AbstractC0630Ra n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String o() {
        return this.f3577a.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final float pa() {
        return this.f3577a.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String s() {
        return this.f3577a.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final List t() {
        List<c.b> j = this.f3577a.j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (c.b bVar : j) {
                arrayList.add(new BinderC0474La(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final void u() {
        this.f3577a.s();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final AbstractC0812Ya w() {
        c.b i = this.f3577a.i();
        if (i != null) {
            return new BinderC0474La(i.a(), i.d(), i.c(), i.e(), i.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String y() {
        return this.f3577a.n();
    }
}
