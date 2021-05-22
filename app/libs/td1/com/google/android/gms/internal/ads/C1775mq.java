package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mq  reason: case insensitive filesystem */
final class C1775mq implements AbstractC0518Ms {

    /* renamed from: a  reason: collision with root package name */
    private final C0492Ls f4998a;

    /* renamed from: b  reason: collision with root package name */
    private _ea<BR> f4999b;

    /* renamed from: c  reason: collision with root package name */
    private _ea<C1941pR> f5000c;
    private _ea<Set<C0523Mx<AbstractC1436hv>>> d;
    private _ea<C1367gv> e;
    private _ea<Set<C0523Mx<AbstractC0261Cv>>> f;
    private _ea<C2469wv> g;
    private _ea<String> h;
    private _ea<BinderC0390Hu> i;
    private _ea<C0955aw> j;
    private _ea<C0882_s> k;
    private _ea<AbstractC0631Rb> l;
    private _ea<Runnable> m;
    private _ea<C0388Hs> n;
    private final /* synthetic */ C1637kq o;

    private C1775mq(C1637kq kqVar, C2054qt qtVar, C0492Ls ls) {
        this.o = kqVar;
        this.f4998a = ls;
        this.f4999b = C2122rt.a(qtVar);
        this.f5000c = C1985pt.a(qtVar);
        Yea a2 = Wea.a(0, 2);
        a2.b(this.o.Hb);
        a2.b(this.o.Ib);
        this.d = a2.a();
        this.e = Oea.a(C1849nv.a(this.d));
        Yea a3 = Wea.a(4, 3);
        a3.a(this.o.Wb);
        a3.a(this.o.Xb);
        a3.a(this.o.Yb);
        a3.b(this.o.ic);
        a3.b(this.o.jc);
        a3.b(this.o.kc);
        a3.a(this.o.Zb);
        this.f = a3.a();
        this.g = Oea.a(C2607yv.a(this.f));
        this.h = C2191st.a(qtVar);
        this.i = C0364Gu.a(this.f5000c, this.h);
        this.j = Oea.a(C0288Dw.a());
        this.k = C0701Tt.a(this.f4999b, this.f5000c, this.e, this.g, this.o.lc, this.i, this.j);
        this.l = new C0544Ns(ls);
        this.m = new C0570Os(ls);
        this.n = Oea.a(new C0622Qs(this.k, this.l, this.m, this.o.sc.d));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0518Ms
    public final AbstractC0951as a() {
        C0388Hs hs = this.n.get();
        Xea.a(hs, "Cannot return null from a non-@Nullable @Provides method");
        return hs;
    }
}
