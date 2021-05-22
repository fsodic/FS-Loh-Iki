package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bq  reason: case insensitive filesystem */
final class C1018bq extends AbstractC2420wO {

    /* renamed from: a  reason: collision with root package name */
    private final C1319gP f3943a;

    /* renamed from: b  reason: collision with root package name */
    private _ea<C2144sO> f3944b;

    /* renamed from: c  reason: collision with root package name */
    private _ea<String> f3945c;
    private _ea<DO> d;
    private _ea<Integer> e;
    private _ea<HO> f;
    private _ea<NO> g;
    private _ea<SO> h;
    private _ea<Boolean> i;
    private _ea<ApplicationInfo> j;
    private _ea<C0906aP> k;
    private _ea<C1250fP> l;
    private _ea<C2214tP> m;
    private _ea<String> n;
    private _ea<C0895aE> o;
    private _ea<C0895aE> p;
    private _ea<C0895aE> q;
    private _ea<C0895aE> r;
    private _ea<Map<EnumC2563yT, C0895aE>> s;
    private _ea<Set<C0523Mx<IT>>> t;
    private _ea<Set<C0523Mx<IT>>> u;
    private _ea v;
    private _ea<BT> w;
    private final /* synthetic */ C0749Vp x;

    private C1018bq(C0749Vp vp, C1319gP gPVar) {
        this.x = vp;
        this.f3943a = gPVar;
        this.f3944b = new C2213tO(C0776Wq.a(), C0749Vp.x(this.x), C0749Vp.a(this.x), C0910aT.a());
        this.f3945c = new C1525jP(gPVar);
        this.d = new FO(C0619Qp.f2971a, C0749Vp.x(this.x), this.f3945c, C0910aT.a());
        this.e = new C1594kP(gPVar);
        this.f = new LO(C0776Wq.a(), this.e, C0749Vp.x(this.x), C0749Vp.v(this.x), C0749Vp.a(this.x), C0910aT.a());
        this.g = new PO(C0620Qq.f2974a, C0910aT.a(), C0749Vp.x(this.x));
        this.h = new UO(C0672Sq.f3133a, C0910aT.a(), this.f3945c);
        this.i = new C1663lP(gPVar);
        this.j = new C1457iP(gPVar);
        this.k = new C1113dP(C0749Vp.y(this.x), C0749Vp.a(this.x), this.i, this.j);
        this.l = new C1388hP(C0724Uq.f3297a, C0749Vp.a(this.x), C0749Vp.x(this.x));
        this.m = new C2352vP(C0910aT.a());
        this.n = new C1801nP(gPVar);
        this.o = Oea.a(PD.a());
        this.p = Oea.a(ND.a());
        this.q = Oea.a(SD.a());
        this.r = Oea.a(UD.a());
        Vea a2 = Uea.a(4);
        a2.a(EnumC2563yT.GMS_SIGNALS, this.o);
        Vea vea = a2;
        vea.a(EnumC2563yT.BUILD_URL, this.p);
        Vea vea2 = vea;
        vea2.a(EnumC2563yT.HTTP, this.q);
        Vea vea3 = vea2;
        vea3.a(EnumC2563yT.PRE_PROCESS, this.r);
        this.s = vea3.a();
        this.t = Oea.a(new WD(this.n, C0749Vp.x(this.x), C0910aT.a(), this.s));
        Yea a3 = Wea.a(0, 1);
        a3.b(this.t);
        this.u = a3.a();
        this.v = KT.a(this.u);
        this.w = Oea.a(GT.a(C0910aT.a(), C0749Vp.a(this.x), this.v));
    }

    private final WO d() {
        C1303g gVar = new C1303g();
        Xea.a(gVar, "Cannot return null from a non-@Nullable @Provides method");
        VW b2 = C0910aT.b();
        List<String> e2 = this.f3943a.e();
        Xea.a(e2, "Cannot return null from a non-@Nullable @Provides method");
        return new WO(gVar, b2, e2);
    }

    private final C2558yO e() {
        AbstractC0743Vj a2 = C0698Tq.a();
        VW b2 = C0910aT.b();
        String b3 = this.f3943a.b();
        Xea.a(b3, "Cannot return null from a non-@Nullable @Provides method");
        return new C2558yO(a2, b2, b3, this.f3943a.c());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2420wO
    public final C1112dO<JSONObject> a() {
        VW b2 = C0910aT.b();
        C1868oN oNVar = new C1868oN(new SO(C0594Pq.a(), C0910aT.b(), C1525jP.a(this.f3943a)), 0, (ScheduledExecutorService) C0749Vp.a(this.x).get());
        Xea.a(oNVar, "Cannot return null from a non-@Nullable @Provides method");
        C1868oN oNVar2 = oNVar;
        C1868oN oNVar3 = new C1868oN(new C0906aP(C0256Cq.a(C0749Vp.t(this.x)), (ScheduledExecutorService) C0749Vp.a(this.x).get(), this.f3943a.d(), C1457iP.a(this.f3943a)), ((Long) C2392voa.e().a(C2474x.mc)).longValue(), (ScheduledExecutorService) C0749Vp.a(this.x).get());
        Xea.a(oNVar3, "Cannot return null from a non-@Nullable @Provides method");
        C1868oN oNVar4 = new C1868oN(new C1250fP(C0646Rq.a(), (ScheduledExecutorService) C0749Vp.a(this.x).get(), C0281Dp.a(C0749Vp.u(this.x))), ((Long) C2392voa.e().a(C2474x.uc)).longValue(), (ScheduledExecutorService) C0749Vp.a(this.x).get());
        Xea.a(oNVar4, "Cannot return null from a non-@Nullable @Provides method");
        C1868oN oNVar5 = new C1868oN(new C2144sO(C0698Tq.a(), C0281Dp.a(C0749Vp.u(this.x)), (ScheduledExecutorService) C0749Vp.a(this.x).get(), C0910aT.b()), 0, (ScheduledExecutorService) C0749Vp.a(this.x).get());
        Xea.a(oNVar5, "Cannot return null from a non-@Nullable @Provides method");
        C1868oN oNVar6 = new C1868oN(new C2214tP(C0910aT.b()), 0, (ScheduledExecutorService) C0749Vp.a(this.x).get());
        Xea.a(oNVar6, "Cannot return null from a non-@Nullable @Provides method");
        AbstractC1180eO<? extends AbstractC0905aO<JSONObject>> a2 = C1732mP.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return C1456iO.a(b2, HV.a(oNVar2, oNVar3, oNVar4, oNVar5, oNVar6, a2, new DO(null, C0281Dp.a(C0749Vp.u(this.x)), C1525jP.a(this.f3943a), C0910aT.b()), new NO(C0542Nq.a(), C0910aT.b(), C0281Dp.a(C0749Vp.u(this.x))), d(), e(), new HO(C0698Tq.a(), this.f3943a.h(), C0281Dp.a(C0749Vp.u(this.x)), (C0847Zj) C0749Vp.v(this.x).get(), (ScheduledExecutorService) C0749Vp.a(this.x).get(), C0910aT.b()), (AbstractC1180eO) C0749Vp.w(this.x).get()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2420wO
    public final C1112dO<JSONObject> b() {
        return C2076rP.a(C0594Pq.a(), C0749Vp.w(this.x).get(), e(), d(), Oea.b(this.f3944b), Oea.b(this.d), Oea.b(this.f), Oea.b(this.g), Oea.b(this.h), Oea.b(this.k), Oea.b(this.l), Oea.b(this.m), C0910aT.b(), (ScheduledExecutorService) C0749Vp.a(this.x).get());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2420wO
    public final BT c() {
        return this.w.get();
    }
}
