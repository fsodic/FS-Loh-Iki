package com.google.android.gms.internal.ads;

import a.c.g;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Tz  reason: case insensitive filesystem */
public final class C0707Tz {

    /* renamed from: a  reason: collision with root package name */
    private int f3219a;

    /* renamed from: b  reason: collision with root package name */
    private AbstractC2532xpa f3220b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0630Ra f3221c;
    private View d;
    private List<?> e;
    private List<Qpa> f = Collections.emptyList();
    private Qpa g;
    private Bundle h;
    private AbstractC1564jo i;
    private AbstractC1564jo j;
    private a k;
    private View l;
    private a m;
    private double n;
    private AbstractC0812Ya o;
    private AbstractC0812Ya p;
    private String q;
    private g<String, BinderC0474La> r = new g<>();
    private g<String, String> s = new g<>();
    private float t;
    private String u;

    public static C0707Tz a(AbstractC0271Df df) {
        try {
            BinderC0733Uz a2 = a(df.getVideoController(), (AbstractC0297Ef) null);
            AbstractC0630Ra n2 = df.n();
            String l2 = df.l();
            List<?> t2 = df.t();
            String s2 = df.s();
            Bundle extras = df.getExtras();
            String o2 = df.o();
            a m2 = df.m();
            String D = df.D();
            AbstractC0812Ya ja = df.ja();
            C0707Tz tz = new C0707Tz();
            tz.f3219a = 1;
            tz.f3220b = a2;
            tz.f3221c = n2;
            tz.d = (View) b(df.O());
            tz.a("headline", l2);
            tz.e = t2;
            tz.a("body", s2);
            tz.h = extras;
            tz.a("call_to_action", o2);
            tz.l = (View) b(df.M());
            tz.m = m2;
            tz.a("advertiser", D);
            tz.p = ja;
            return tz;
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    public static C0707Tz a(AbstractC0297Ef ef) {
        try {
            return a(a(ef.getVideoController(), ef), ef.n(), (View) b(ef.O()), ef.l(), ef.t(), ef.s(), ef.getExtras(), ef.o(), (View) b(ef.M()), ef.m(), ef.E(), ef.y(), ef.B(), ef.w(), ef.D(), ef.pa());
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    private static C0707Tz a(AbstractC2532xpa xpa, AbstractC0630Ra ra, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, a aVar, String str4, String str5, double d2, AbstractC0812Ya ya, String str6, float f2) {
        C0707Tz tz = new C0707Tz();
        tz.f3219a = 6;
        tz.f3220b = xpa;
        tz.f3221c = ra;
        tz.d = view;
        tz.a("headline", str);
        tz.e = list;
        tz.a("body", str2);
        tz.h = bundle;
        tz.a("call_to_action", str3);
        tz.l = view2;
        tz.m = aVar;
        tz.a("store", str4);
        tz.a("price", str5);
        tz.n = d2;
        tz.o = ya;
        tz.a("advertiser", str6);
        tz.a(f2);
        return tz;
    }

    public static C0707Tz a(AbstractC2580yf yfVar) {
        try {
            BinderC0733Uz a2 = a(yfVar.getVideoController(), (AbstractC0297Ef) null);
            AbstractC0630Ra n2 = yfVar.n();
            String l2 = yfVar.l();
            List<?> t2 = yfVar.t();
            String s2 = yfVar.s();
            Bundle extras = yfVar.getExtras();
            String o2 = yfVar.o();
            a m2 = yfVar.m();
            String E = yfVar.E();
            String y = yfVar.y();
            double B = yfVar.B();
            AbstractC0812Ya w = yfVar.w();
            C0707Tz tz = new C0707Tz();
            tz.f3219a = 2;
            tz.f3220b = a2;
            tz.f3221c = n2;
            tz.d = (View) b(yfVar.O());
            tz.a("headline", l2);
            tz.e = t2;
            tz.a("body", s2);
            tz.h = extras;
            tz.a("call_to_action", o2);
            tz.l = (View) b(yfVar.M());
            tz.m = m2;
            tz.a("store", E);
            tz.a("price", y);
            tz.n = B;
            tz.o = w;
            return tz;
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to get native ad from app install ad mapper", e2);
            return null;
        }
    }

    private static BinderC0733Uz a(AbstractC2532xpa xpa, AbstractC0297Ef ef) {
        if (xpa == null) {
            return null;
        }
        return new BinderC0733Uz(xpa, ef);
    }

    private final synchronized void a(float f2) {
        this.t = f2;
    }

    public static C0707Tz b(AbstractC0271Df df) {
        try {
            return a(a(df.getVideoController(), (AbstractC0297Ef) null), df.n(), (View) b(df.O()), df.l(), df.t(), df.s(), df.getExtras(), df.o(), (View) b(df.M()), df.m(), null, null, -1.0d, df.ja(), df.D(), 0.0f);
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    public static C0707Tz b(AbstractC2580yf yfVar) {
        try {
            return a(a(yfVar.getVideoController(), (AbstractC0297Ef) null), yfVar.n(), (View) b(yfVar.O()), yfVar.l(), yfVar.t(), yfVar.s(), yfVar.getExtras(), yfVar.o(), (View) b(yfVar.M()), yfVar.m(), yfVar.E(), yfVar.y(), yfVar.B(), yfVar.w(), null, 0.0f);
        } catch (RemoteException e2) {
            C0745Vl.c("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    private static <T> T b(a aVar) {
        if (aVar == null) {
            return null;
        }
        return (T) b.Q(aVar);
    }

    private final synchronized String c(String str) {
        return this.s.get(str);
    }

    public final synchronized AbstractC0630Ra A() {
        return this.f3221c;
    }

    public final synchronized a B() {
        return this.m;
    }

    public final synchronized AbstractC0812Ya C() {
        return this.p;
    }

    public final synchronized void a() {
        if (this.i != null) {
            this.i.destroy();
            this.i = null;
        }
        if (this.j != null) {
            this.j.destroy();
            this.j = null;
        }
        this.k = null;
        this.r.clear();
        this.s.clear();
        this.f3220b = null;
        this.f3221c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final synchronized void a(double d2) {
        this.n = d2;
    }

    public final synchronized void a(int i2) {
        this.f3219a = i2;
    }

    public final synchronized void a(View view) {
        this.l = view;
    }

    public final synchronized void a(a aVar) {
        this.k = aVar;
    }

    public final synchronized void a(Qpa qpa) {
        this.g = qpa;
    }

    public final synchronized void a(AbstractC0630Ra ra) {
        this.f3221c = ra;
    }

    public final synchronized void a(AbstractC0812Ya ya) {
        this.o = ya;
    }

    public final synchronized void a(AbstractC1564jo joVar) {
        this.i = joVar;
    }

    public final synchronized void a(AbstractC2532xpa xpa) {
        this.f3220b = xpa;
    }

    public final synchronized void a(String str) {
        this.q = str;
    }

    public final synchronized void a(String str, BinderC0474La la) {
        if (la == null) {
            this.r.remove(str);
        } else {
            this.r.put(str, la);
        }
    }

    public final synchronized void a(String str, String str2) {
        if (str2 == null) {
            this.s.remove(str);
        } else {
            this.s.put(str, str2);
        }
    }

    public final synchronized void a(List<BinderC0474La> list) {
        this.e = list;
    }

    public final synchronized String b() {
        return c("advertiser");
    }

    public final synchronized void b(AbstractC0812Ya ya) {
        this.p = ya;
    }

    public final synchronized void b(AbstractC1564jo joVar) {
        this.j = joVar;
    }

    public final synchronized void b(String str) {
        this.u = str;
    }

    public final synchronized void b(List<Qpa> list) {
        this.f = list;
    }

    public final synchronized String c() {
        return c("body");
    }

    public final synchronized String d() {
        return c("call_to_action");
    }

    public final synchronized String e() {
        return this.q;
    }

    public final synchronized Bundle f() {
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    public final synchronized String g() {
        return c("headline");
    }

    public final synchronized List<?> h() {
        return this.e;
    }

    public final synchronized float i() {
        return this.t;
    }

    public final synchronized List<Qpa> j() {
        return this.f;
    }

    public final synchronized String k() {
        return c("price");
    }

    public final synchronized double l() {
        return this.n;
    }

    public final synchronized String m() {
        return c("store");
    }

    public final synchronized AbstractC2532xpa n() {
        return this.f3220b;
    }

    public final synchronized int o() {
        return this.f3219a;
    }

    public final synchronized View p() {
        return this.d;
    }

    public final AbstractC0812Ya q() {
        List<?> list = this.e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return AbstractBinderC0786Xa.a((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized Qpa r() {
        return this.g;
    }

    public final synchronized View s() {
        return this.l;
    }

    public final synchronized AbstractC1564jo t() {
        return this.i;
    }

    public final synchronized AbstractC1564jo u() {
        return this.j;
    }

    public final synchronized a v() {
        return this.k;
    }

    public final synchronized g<String, BinderC0474La> w() {
        return this.r;
    }

    public final synchronized String x() {
        return this.u;
    }

    public final synchronized g<String, String> y() {
        return this.s;
    }

    public final synchronized AbstractC0812Ya z() {
        return this.o;
    }
}
