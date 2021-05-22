package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2399vu;
import com.google.android.gms.internal.ads.C0952at;
import com.google.android.gms.internal.ads.Uma;
import java.util.concurrent.Executor;

public final class TP<R extends AbstractC2399vu<AdT>, AdT extends C0952at> implements AbstractC1940pQ<R, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1940pQ<R, AdT> f3172a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1940pQ<R, C1320gQ<AdT>> f3173b;

    /* renamed from: c  reason: collision with root package name */
    private final LS<AdT> f3174c;
    private R d;
    private final Executor e;

    public TP(AbstractC1940pQ<R, AdT> pQVar, AbstractC1940pQ<R, C1320gQ<AdT>> pQVar2, LS<AdT> ls, Executor executor) {
        this.f3172a = pQVar;
        this.f3173b = pQVar2;
        this.f3174c = ls;
        this.e = executor;
    }

    private final SW<AdT> a(CS<AdT> cs, C2284uQ uQVar, AbstractC2077rQ<R> rQVar) {
        AbstractC2330uu<R> a2 = rQVar.a(uQVar.f5717b);
        if (cs.f1696c != null) {
            R a3 = a2.a();
            if (a3.c() != null) {
                cs.f1696c.e().a(a3.c());
            }
            return JW.a(cs.f1696c);
        }
        a2.a(cs.f1695b);
        SW<AdT> a4 = this.f3172a.a(uQVar, new VP(a2));
        this.d = this.f3172a.a();
        return a4;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized R a() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(AbstractC2077rQ rQVar, PS ps) {
        RS rs;
        if (ps == null || ps.f2830a == null || (rs = ps.f2831b) == null) {
            throw new C0896aF(YR.f3560a, "Empty prefetch");
        }
        Uma.c n = Uma.n();
        Uma.a.C0035a n2 = Uma.a.n();
        n2.a(Uma.b.IN_MEMORY);
        n2.a(Uma.d.n());
        n.a(n2);
        ps.f2830a.f1694a.c().a((Uma) n.j());
        return a(ps.f2830a, ((_P) rs).f3716b, rQVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C2284uQ uQVar, _P _p, AbstractC2077rQ rQVar, C1320gQ gQVar) {
        if (gQVar != null) {
            _P _p2 = new _P(_p.f3715a, _p.f3716b, _p.f3717c, _p.d, _p.e, _p.f, gQVar.f4389a);
            if (gQVar.f4391c != null) {
                this.d = null;
                this.f3174c.a(_p2);
                return a(gQVar.f4391c, uQVar, rQVar);
            }
            SW<PS<AdT>> b2 = this.f3174c.b(_p2);
            if (b2 != null) {
                this.d = (R) ((AbstractC2399vu) rQVar.a(uQVar.f5717b).a());
                return JW.a(b2, new YP(this, rQVar), this.e);
            }
            this.f3174c.a(_p2);
            uQVar = new C2284uQ(uQVar.f5717b, gQVar.f4390b);
        }
        SW<AdT> a2 = this.f3172a.a(uQVar, rQVar);
        this.d = this.f3172a.a();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1940pQ
    public final synchronized SW<AdT> a(C2284uQ uQVar, AbstractC2077rQ<R> rQVar) {
        GR b2;
        b2 = rQVar.a(uQVar.f5717b).a().b();
        return AW.c((SW) this.f3173b.a(uQVar, rQVar)).a(new WP(this, uQVar, new _P(rQVar, uQVar, b2.d, b2.f, this.e, b2.j, null), rQVar), this.e);
    }
}
