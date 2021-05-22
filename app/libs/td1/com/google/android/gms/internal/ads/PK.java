package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.C1162dx;
import com.google.android.gms.internal.ads.C2537xu;
import java.util.concurrent.Executor;

public final class PK implements LK<C0952at> {

    /* renamed from: a  reason: collision with root package name */
    private final IR f2817a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0229Bp f2818b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2819c;
    private final JK d;
    private C1434ht e;

    public PK(AbstractC0229Bp bp, Context context, JK jk, IR ir) {
        this.f2818b = bp;
        this.f2819c = context;
        this.d = jk;
        this.f2817a = ir;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.d.e().c(1);
    }

    @Override // com.google.android.gms.internal.ads.LK
    public final boolean a(Zna zna, String str, KK kk, NK<? super C0952at> nk) {
        AbstractC1853nz nzVar;
        C1162dx dxVar;
        Executor a2;
        Runnable rk;
        q.c();
        if (C2452wk.p(this.f2819c) && zna.s == null) {
            C0745Vl.b("Failed to load the ad because app ID is missing.");
            a2 = this.f2818b.a();
            rk = new OK(this);
        } else if (str == null) {
            C0745Vl.b("Ad unit ID should not be null for NativeAdLoader.");
            a2 = this.f2818b.a();
            rk = new RK(this);
        } else {
            PR.a(this.f2819c, zna.f);
            int i = kk instanceof MK ? ((MK) kk).f2574a : 1;
            IR ir = this.f2817a;
            ir.a(zna);
            ir.a(i);
            GR d2 = ir.d();
            if (((Boolean) C2392voa.e().a(C2474x.cf)).booleanValue()) {
                nzVar = this.f2818b.l();
                C2537xu.a aVar = new C2537xu.a();
                aVar.a(this.f2819c);
                aVar.a(d2);
                nzVar.b(aVar.a());
                dxVar = new C1162dx.a().a();
            } else {
                nzVar = this.f2818b.l();
                C2537xu.a aVar2 = new C2537xu.a();
                aVar2.a(this.f2819c);
                aVar2.a(d2);
                nzVar.b(aVar2.a());
                C1162dx.a aVar3 = new C1162dx.a();
                aVar3.a(this.d.d(), this.f2818b.a());
                aVar3.a(this.d.e(), this.f2818b.a());
                aVar3.a(this.d.f(), this.f2818b.a());
                aVar3.a(this.d.g(), this.f2818b.a());
                aVar3.a(this.d.c(), this.f2818b.a());
                aVar3.a(d2.m, this.f2818b.a());
                dxVar = aVar3.a();
            }
            nzVar.b(dxVar);
            nzVar.b(this.d.a());
            AbstractC1646kz c2 = nzVar.c();
            this.f2818b.q().a(1);
            this.e = new C1434ht(this.f2818b.c(), this.f2818b.b(), c2.a().b());
            this.e.a(new QK(this, nk, c2));
            return true;
        }
        a2.execute(rk);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.d.e().c(8);
    }

    @Override // com.google.android.gms.internal.ads.LK
    public final boolean q() {
        C1434ht htVar = this.e;
        return htVar != null && htVar.a();
    }
}
