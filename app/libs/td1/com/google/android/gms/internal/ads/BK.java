package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import b.c.b.a.c.a;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C1162dx;
import com.google.android.gms.internal.ads.C2537xu;
import java.util.concurrent.Executor;

public final class BK extends Koa {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0229Bp f1600a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1601b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f1602c;
    private final C2623zK d = new C2623zK();
    private final C2554yK e = new C2554yK();
    private final C2560yQ f = new C2560yQ(new C1873oS());
    private final C2209tK g = new C2209tK();
    private final IR h = new IR();
    private S i;
    private C1990py j;
    private SW<C1990py> k;
    private boolean l = false;

    public BK(AbstractC0229Bp bp, Context context, C1015boa boa, String str) {
        this.f1600a = bp;
        IR ir = this.h;
        ir.a(boa);
        ir.a(str);
        this.f1602c = bp.a();
        this.f1601b = context;
    }

    private final synchronized boolean Wb() {
        return this.j != null && !this.j.g();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final a Ab() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized AbstractC2187spa C() {
        if (!((Boolean) C2392voa.e().a(C2474x.Ge)).booleanValue()) {
            return null;
        }
        if (this.j == null) {
            return null;
        }
        return this.j.d();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Uoa Fa() {
        return this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Bundle I() {
        r.a("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void Ib() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2599yoa Qa() {
        return this.d.c();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String Z() {
        if (this.j == null || this.j.d() == null) {
            return null;
        }
        return this.j.d().k();
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
        this.i = s;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Uoa uoa) {
        r.a("setAppEventListener must be called on the main UI thread.");
        this.e.a(uoa);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(_oa _oa) {
        r.a("setCorrelationIdProvider must be called on the main UI thread");
        this.h.a(_oa);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC0942ama ama) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1015boa boa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(C1028c cVar) {
        this.h.a(cVar);
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
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2586yi yiVar) {
        this.f.a(yiVar);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(boolean z) {
        r.a("setImmersiveMode must be called on the main UI thread.");
        this.l = z;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized boolean a(Zna zna) {
        AbstractC0524My my;
        r.a("loadAd must be called on the main UI thread.");
        q.c();
        if (C2452wk.p(this.f1601b) && zna.s == null) {
            C0745Vl.b("Failed to load the ad because app ID is missing.");
            if (this.d != null) {
                this.d.c(8);
            }
            return false;
        } else if (this.k != null || Wb()) {
            return false;
        } else {
            PR.a(this.f1601b, zna.f);
            this.j = null;
            IR ir = this.h;
            ir.a(zna);
            GR d2 = ir.d();
            if (((Boolean) C2392voa.e().a(C2474x.bf)).booleanValue()) {
                AbstractC0602Py k2 = this.f1600a.k();
                C2537xu.a aVar = new C2537xu.a();
                aVar.a(this.f1601b);
                aVar.a(d2);
                k2.e(aVar.a());
                k2.d(new C1162dx.a().a());
                k2.b(new TJ(this.i));
                my = k2.f();
            } else {
                C1162dx.a aVar2 = new C1162dx.a();
                if (this.f != null) {
                    aVar2.a((AbstractC0520Mu) this.f, this.f1600a.a());
                    aVar2.a((AbstractC0261Cv) this.f, this.f1600a.a());
                    aVar2.a((AbstractC0650Ru) this.f, this.f1600a.a());
                }
                AbstractC0602Py k3 = this.f1600a.k();
                C2537xu.a aVar3 = new C2537xu.a();
                aVar3.a(this.f1601b);
                aVar3.a(d2);
                k3.e(aVar3.a());
                aVar2.a((AbstractC0520Mu) this.d, this.f1600a.a());
                aVar2.a((AbstractC0261Cv) this.d, this.f1600a.a());
                aVar2.a((AbstractC0650Ru) this.d, this.f1600a.a());
                aVar2.a((Ona) this.d, this.f1600a.a());
                aVar2.a(this.e, this.f1600a.a());
                aVar2.a(this.g, this.f1600a.a());
                k3.d(aVar2.a());
                k3.b(new TJ(this.i));
                my = k3.f();
            }
            this.k = my.a().b();
            JW.a(this.k, new AK(this, my), this.f1602c);
            return true;
        }
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
        this.h.b(z);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void destroy() {
        r.a("destroy must be called on the main UI thread.");
        if (this.j != null) {
            this.j.c().d(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void e(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2532xpa getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final C1015boa ib() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String k() {
        if (this.j == null || this.j.d() == null) {
            return null;
        }
        return this.j.d().k();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized boolean p() {
        r.a("isLoaded must be called on the main UI thread.");
        return Wb();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void pause() {
        r.a("pause must be called on the main UI thread.");
        if (this.j != null) {
            this.j.c().b(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized boolean q() {
        return this.k != null && !this.k.isDone();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void resume() {
        r.a("resume must be called on the main UI thread.");
        if (this.j != null) {
            this.j.c().c(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void showInterstitial() {
        r.a("showInterstitial must be called on the main UI thread.");
        if (this.j != null) {
            this.j.a(this.l);
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String zb() {
        return this.h.b();
    }
}
