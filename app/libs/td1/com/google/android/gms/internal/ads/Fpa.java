package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.h.a;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.v;
import com.google.android.gms.ads.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Fpa {

    /* renamed from: a  reason: collision with root package name */
    private final Date f1991a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1992b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f1993c;
    private final int d;
    private final Set<String> e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map<Class<? extends v>, v> i;
    private final String j;
    private final String k;
    private final a l;
    private final int m;
    private final Set<String> n;
    private final Bundle o;
    private final Set<String> p;
    private final boolean q;
    private final com.google.android.gms.ads.f.a r;
    private final int s;
    private final String t;

    public Fpa(Epa epa) {
        this(epa, null);
    }

    public Fpa(Epa epa, a aVar) {
        this.f1991a = Epa.a(epa);
        this.f1992b = Epa.b(epa);
        this.f1993c = Epa.c(epa);
        this.d = Epa.d(epa);
        this.e = Collections.unmodifiableSet(Epa.e(epa));
        this.f = Epa.f(epa);
        this.g = Epa.g(epa);
        this.h = Epa.h(epa);
        this.i = Collections.unmodifiableMap(Epa.i(epa));
        this.j = Epa.j(epa);
        this.k = Epa.k(epa);
        this.l = aVar;
        this.m = Epa.l(epa);
        this.n = Collections.unmodifiableSet(Epa.m(epa));
        this.o = Epa.n(epa);
        this.p = Collections.unmodifiableSet(Epa.o(epa));
        this.q = Epa.p(epa);
        this.r = Epa.q(epa);
        this.s = Epa.r(epa);
        this.t = Epa.s(epa);
    }

    public final Bundle a(Class<? extends j> cls) {
        return this.h.getBundle(cls.getName());
    }

    @Deprecated
    public final Date a() {
        return this.f1991a;
    }

    public final boolean a(Context context) {
        q a2 = Ipa.c().a();
        C2392voa.a();
        String a3 = C0459Kl.a(context);
        return this.n.contains(a3) || a2.d().contains(a3);
    }

    public final String b() {
        return this.f1992b;
    }

    public final Bundle c() {
        return this.o;
    }

    @Deprecated
    public final int d() {
        return this.d;
    }

    public final Set<String> e() {
        return this.e;
    }

    public final Location f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final String h() {
        return this.t;
    }

    public final String i() {
        return this.j;
    }

    @Deprecated
    public final boolean j() {
        return this.q;
    }

    public final List<String> k() {
        return new ArrayList(this.f1993c);
    }

    public final String l() {
        return this.k;
    }

    public final a m() {
        return this.l;
    }

    public final Map<Class<? extends v>, v> n() {
        return this.i;
    }

    public final Bundle o() {
        return this.h;
    }

    public final int p() {
        return this.m;
    }

    public final Set<String> q() {
        return this.p;
    }

    public final com.google.android.gms.ads.f.a r() {
        return this.r;
    }

    public final int s() {
        return this.s;
    }
}
