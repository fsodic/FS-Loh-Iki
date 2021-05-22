package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.sK  reason: case insensitive filesystem */
public final class C2140sK implements GW<AbstractC0951as> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC2466ws f5501a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BinderC1934pK f5502b;

    C2140sK(BinderC1934pK pKVar, AbstractC2466ws wsVar) {
        this.f5502b = pKVar;
        this.f5501a = wsVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(AbstractC0951as asVar) {
        AbstractC0951as asVar2 = asVar;
        synchronized (this.f5502b) {
            this.f5502b.m = null;
            if (this.f5502b.l != null) {
                this.f5502b.l.a();
            }
            this.f5502b.l = asVar2;
            this.f5502b.f5217c.removeAllViews();
            if (asVar2.i() != null) {
                ViewParent parent = asVar2.i().getParent();
                if (parent instanceof ViewGroup) {
                    String k = this.f5502b.k();
                    StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(k);
                    sb.append(" already has a parent view. Removing its old parent.");
                    C0745Vl.d(sb.toString());
                    ((ViewGroup) parent).removeView(asVar2.i());
                }
            }
            if (((Boolean) C2392voa.e().a(C2474x.Ze)).booleanValue()) {
                C0210Aw f = asVar2.f();
                f.a(this.f5502b.d);
                f.a(this.f5502b.e);
                f.a(this.f5502b.f);
                f.a(this.f5502b.g);
            }
            this.f5502b.f5217c.addView(asVar2.i());
            asVar2.b();
            if (((Boolean) C2392voa.e().a(C2474x.Ze)).booleanValue()) {
                Executor a2 = this.f5502b.f5215a.a();
                C2623zK zKVar = this.f5502b.d;
                zKVar.getClass();
                a2.execute(RunnableC2071rK.a(zKVar));
            }
            this.f5502b.h.b(asVar2.k());
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        Sna a2 = C0896aF.a(th);
        synchronized (this.f5502b) {
            this.f5502b.m = null;
            this.f5501a.b().c(a2.f3128a);
            if (((Boolean) C2392voa.e().a(C2474x.Ze)).booleanValue()) {
                this.f5502b.f5215a.a().execute(new RunnableC2278uK(this, a2));
            }
            this.f5502b.h.b(60);
            PR.a(a2.f3128a, th, "BannerAdManagerShim.onFailure");
        }
    }
}
