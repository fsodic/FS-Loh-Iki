package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.g.a;
import com.google.android.gms.internal.ads.C1162dx;
import com.google.android.gms.internal.ads.C2537xu;
import java.util.concurrent.Executor;

public final class VQ implements LK<C2615zC> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3336a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3337b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0229Bp f3338c;
    private final C2560yQ d;
    private final AbstractC1940pQ<CC, C2615zC> e;
    private final AR f;
    private final IR g;
    private SW<C2615zC> h;

    public VQ(Context context, Executor executor, AbstractC0229Bp bp, AbstractC1940pQ<CC, C2615zC> pQVar, C2560yQ yQVar, IR ir, AR ar) {
        this.f3336a = context;
        this.f3337b = executor;
        this.f3338c = bp;
        this.e = pQVar;
        this.d = yQVar;
        this.g = ir;
        this.f = ar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final FC a(AbstractC2146sQ sQVar) {
        C0908aR aRVar = (C0908aR) sQVar;
        if (((Boolean) C2392voa.e().a(C2474x._e)).booleanValue()) {
            FC m = this.f3338c.m();
            C2537xu.a aVar = new C2537xu.a();
            aVar.a(this.f3336a);
            aVar.a(aRVar.f3809a);
            aVar.a(aRVar.f3810b);
            aVar.a(this.f);
            m.d(aVar.a());
            m.c(new C1162dx.a().a());
            return m;
        }
        C2560yQ a2 = C2560yQ.a(this.d);
        FC m2 = this.f3338c.m();
        C2537xu.a aVar2 = new C2537xu.a();
        aVar2.a(this.f3336a);
        aVar2.a(aRVar.f3809a);
        aVar2.a(aRVar.f3810b);
        aVar2.a(this.f);
        m2.d(aVar2.a());
        C1162dx.a aVar3 = new C1162dx.a();
        aVar3.a((AbstractC0520Mu) a2, this.f3337b);
        aVar3.a((AbstractC0261Cv) a2, this.f3337b);
        aVar3.a((AbstractC0650Ru) a2, this.f3337b);
        aVar3.a((a) a2, this.f3337b);
        aVar3.a((AbstractC0884_u) a2, this.f3337b);
        aVar3.a((AbstractC0651Rv) a2, this.f3337b);
        aVar3.a(a2);
        m2.c(aVar3.a());
        return m2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.d.c(1);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.g.c().a(i);
    }

    @Override // com.google.android.gms.internal.ads.LK
    public final boolean a(Zna zna, String str, KK kk, NK<? super C2615zC> nk) {
        C0300Ei ei = new C0300Ei(zna, str);
        String str2 = kk instanceof SQ ? ((SQ) kk).f3084a : null;
        if (ei.f1888b == null) {
            C0745Vl.b("Ad unit ID should not be null for rewarded video ad.");
            this.f3337b.execute(new UQ(this));
            return false;
        }
        SW<C2615zC> sw = this.h;
        if (sw != null && !sw.isDone()) {
            return false;
        }
        PR.a(this.f3336a, ei.f1887a.f);
        IR ir = this.g;
        ir.a(ei.f1888b);
        ir.a(C1015boa.M());
        ir.a(ei.f1887a);
        GR d2 = ir.d();
        C0908aR aRVar = new C0908aR(null);
        aRVar.f3809a = d2;
        aRVar.f3810b = str2;
        this.h = this.e.a(new C2284uQ(aRVar), new XQ(this));
        JW.a(this.h, new WQ(this, nk, aRVar), this.f3337b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.LK
    public final boolean q() {
        SW<C2615zC> sw = this.h;
        return sw != null && !sw.isDone();
    }
}
