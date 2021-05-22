package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C1162dx;
import com.google.android.gms.internal.ads.C2537xu;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.pK  reason: case insensitive filesystem */
public final class BinderC1934pK extends Koa implements AbstractC0833Yv {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0229Bp f5215a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5216b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f5217c;
    private final C2623zK d = new C2623zK();
    private final C2347vK e = new C2347vK();
    private final C2554yK f = new C2554yK();
    private final C2209tK g = new C2209tK();
    private final C0729Uv h;
    private C1015boa i;
    private final IR j = new IR();
    private S k;
    private AbstractC0951as l;
    private SW<AbstractC0951as> m;

    public BinderC1934pK(AbstractC0229Bp bp, Context context, C1015boa boa, String str) {
        this.f5217c = new FrameLayout(context);
        this.f5215a = bp;
        this.f5216b = context;
        IR ir = this.j;
        ir.a(boa);
        ir.a(str);
        this.h = bp.e();
        this.h.a(this, this.f5215a.a());
        this.i = boa;
    }

    private final synchronized AbstractC2466ws a(GR gr) {
        if (((Boolean) C2392voa.e().a(C2474x.Ze)).booleanValue()) {
            AbstractC0206As h2 = this.f5215a.h();
            C2537xu.a aVar = new C2537xu.a();
            aVar.a(this.f5216b);
            aVar.a(gr);
            h2.a(aVar.a());
            h2.e(new C1162dx.a().a());
            h2.a(new TJ(this.k));
            h2.a(new C1302fz(C1098dA.f4044a, null));
            h2.a(new C0700Ts(this.h));
            h2.b(new C0881_r(this.f5217c));
            return h2.e();
        }
        AbstractC0206As h3 = this.f5215a.h();
        C2537xu.a aVar2 = new C2537xu.a();
        aVar2.a(this.f5216b);
        aVar2.a(gr);
        h3.a(aVar2.a());
        C1162dx.a aVar3 = new C1162dx.a();
        aVar3.a((Ona) this.d, this.f5215a.a());
        aVar3.a(this.e, this.f5215a.a());
        aVar3.a((AbstractC0520Mu) this.d, this.f5215a.a());
        aVar3.a((AbstractC0261Cv) this.d, this.f5215a.a());
        aVar3.a((AbstractC0650Ru) this.d, this.f5215a.a());
        aVar3.a(this.f, this.f5215a.a());
        aVar3.a(this.g, this.f5215a.a());
        h3.e(aVar3.a());
        h3.a(new TJ(this.k));
        h3.a(new C1302fz(C1098dA.f4044a, null));
        h3.a(new C0700Ts(this.h));
        h3.b(new C0881_r(this.f5217c));
        return h3.e();
    }

    private final synchronized boolean c(Zna zna) {
        r.a("loadAd must be called on the main UI thread.");
        q.c();
        if (C2452wk.p(this.f5216b) && zna.s == null) {
            C0745Vl.b("Failed to load the ad because app ID is missing.");
            if (this.d != null) {
                this.d.c(8);
            }
            return false;
        } else if (this.m != null) {
            return false;
        } else {
            PR.a(this.f5216b, zna.f);
            IR ir = this.j;
            ir.a(zna);
            GR d2 = ir.d();
            if (!C2087ra.f5421c.a().booleanValue() || !this.j.e().k || this.d == null) {
                AbstractC2466ws a2 = a(d2);
                this.m = a2.a().b();
                JW.a(this.m, new C2140sK(this, a2), this.f5215a.a());
                return true;
            }
            this.d.c(1);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final a Ab() {
        r.a("destroy must be called on the main UI thread.");
        return b.a(this.f5217c);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized AbstractC2187spa C() {
        if (!((Boolean) C2392voa.e().a(C2474x.Ge)).booleanValue()) {
            return null;
        }
        if (this.l == null) {
            return null;
        }
        return this.l.d();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Uoa Fa() {
        return this.f.a();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Bundle I() {
        r.a("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void Ib() {
        r.a("recordManualImpression must be called on the main UI thread.");
        if (this.l != null) {
            this.l.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2599yoa Qa() {
        return this.d.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0833Yv
    public final synchronized void Ub() {
        boolean z;
        ViewParent parent = this.f5217c.getParent();
        if (!(parent instanceof View)) {
            z = false;
        } else {
            View view = (View) parent;
            z = q.c().a(view, view.getContext());
        }
        if (z) {
            if (!(this.l == null || this.l.j() == null)) {
                this.j.a(JR.a(this.f5216b, Collections.singletonList(this.l.j())));
            }
            c(this.j.a());
            return;
        }
        this.h.b(60);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String Z() {
        if (this.l == null || this.l.d() == null) {
            return null;
        }
        return this.l.d().k();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void _a() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Dpa dpa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Ooa ooa) {
        r.a("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(S s) {
        r.a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.k = s;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Uoa uoa) {
        r.a("setAppEventListener must be called on the main UI thread.");
        this.f.a(uoa);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(_oa _oa) {
        r.a("setCorrelationIdProvider must be called on the main UI thread");
        this.j.a(_oa);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC0942ama ama) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(C1015boa boa) {
        r.a("setAdSize must be called on the main UI thread.");
        this.j.a(boa);
        this.i = boa;
        if (this.l != null) {
            this.l.a(this.f5217c, boa);
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(C1028c cVar) {
        r.a("setVideoOptions must be called on the main UI thread.");
        this.j.a(cVar);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC1344gh ghVar) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1496ioa ioa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC1619kh khVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2118rpa rpa) {
        r.a("setPaidEventListener must be called on the main UI thread.");
        this.g.a(rpa);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2530xoa xoa) {
        r.a("setAdListener must be called on the main UI thread.");
        this.e.a(xoa);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2586yi yiVar) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized boolean a(Zna zna) {
        this.j.a(this.i);
        this.j.a(this.i.n);
        return c(zna);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void b(AbstractC2599yoa yoa) {
        r.a("setAdListener must be called on the main UI thread.");
        this.d.a(yoa);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void c(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void d(boolean z) {
        r.a("setManualImpressionsEnabled must be called from the main thread.");
        this.j.b(z);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void destroy() {
        r.a("destroy must be called on the main UI thread.");
        if (this.l != null) {
            this.l.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void e(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized AbstractC2532xpa getVideoController() {
        r.a("getVideoController must be called from the main thread.");
        if (this.l == null) {
            return null;
        }
        return this.l.g();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized C1015boa ib() {
        r.a("getAdSize must be called on the main UI thread.");
        if (this.l != null) {
            return JR.a(this.f5216b, Collections.singletonList(this.l.h()));
        }
        return this.j.e();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String k() {
        if (this.l == null || this.l.d() == null) {
            return null;
        }
        return this.l.d().k();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void pause() {
        r.a("pause must be called on the main UI thread.");
        if (this.l != null) {
            this.l.c().b(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized boolean q() {
        return this.m != null && !this.m.isDone();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void resume() {
        r.a("resume must be called on the main UI thread.");
        if (this.l != null) {
            this.l.c().c(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String zb() {
        return this.j.b();
    }
}
