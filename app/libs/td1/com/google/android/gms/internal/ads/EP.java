package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.y;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

public final class EP extends Koa implements y, AbstractC0391Hv, Xla {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0229Bp f1860a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1861b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f1862c;
    private AtomicBoolean d = new AtomicBoolean();
    private final String e;
    private final C2283uP f;
    private final MP g;
    private final C0823Yl h;
    private long i;
    private C0439Jr j;
    protected C0725Ur k;

    public EP(AbstractC0229Bp bp, Context context, String str, C2283uP uPVar, MP mp, C0823Yl yl) {
        this.f1862c = new FrameLayout(context);
        this.f1860a = bp;
        this.f1861b = context;
        this.e = str;
        this.f = uPVar;
        this.g = mp;
        mp.a(this);
        this.h = yl;
    }

    /* access modifiers changed from: private */
    /* renamed from: Yb */
    public final void Xb() {
        if (this.d.compareAndSet(false, true)) {
            C0725Ur ur = this.k;
            if (!(ur == null || ur.n() == null)) {
                this.g.a(this.k.n());
            }
            this.g.a();
            this.f1862c.removeAllViews();
            C0439Jr jr = this.j;
            if (jr != null) {
                q.f().b(jr);
            }
            C0725Ur ur2 = this.k;
            if (ur2 != null) {
                ur2.a(q.j().b() - this.i);
            }
            destroy();
        }
    }

    /* access modifiers changed from: private */
    public final C1015boa Zb() {
        return JR.a(this.f1861b, Collections.singletonList(this.k.k()));
    }

    /* access modifiers changed from: private */
    public final com.google.android.gms.ads.internal.overlay.q b(C0725Ur ur) {
        boolean g2 = ur.g();
        int intValue = ((Integer) C2392voa.e().a(C2474x.Vc)).intValue();
        p pVar = new p();
        pVar.e = 50;
        pVar.f1114a = g2 ? intValue : 0;
        pVar.f1115b = g2 ? 0 : intValue;
        pVar.f1116c = 0;
        pVar.d = intValue;
        return new com.google.android.gms.ads.internal.overlay.q(this.f1861b, pVar, this);
    }

    /* access modifiers changed from: private */
    public static RelativeLayout.LayoutParams c(C0725Ur ur) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(ur.g() ? 11 : 9);
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public final void d(C0725Ur ur) {
        ur.a(this);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final a Ab() {
        r.a("getAdFrame must be called on the main UI thread.");
        return b.a(this.f1862c);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized AbstractC2187spa C() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Uoa Fa() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Bundle I() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void Ib() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2599yoa Qa() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0391Hv
    public final void Rb() {
        if (this.k != null) {
            this.i = q.j().b();
            int h2 = this.k.h();
            if (h2 > 0) {
                this.j = new C0439Jr(this.f1860a.b(), q.j());
                this.j.a(h2, new GP(this));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Xla
    public final void Sb() {
        Xb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.y
    public final void Tb() {
        Xb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Wb() {
        this.f1860a.a().execute(new CP(this));
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String Z() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void _a() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Dpa dpa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Ooa ooa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(S s) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Uoa uoa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(_oa _oa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC0942ama ama) {
        this.g.a(ama);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(C1015boa boa) {
        r.a("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void a(C1028c cVar) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC1344gh ghVar) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1496ioa ioa) {
        this.f.a(ioa);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC1619kh khVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2118rpa rpa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2530xoa xoa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2586yi yiVar) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized boolean a(Zna zna) {
        r.a("loadAd must be called on the main UI thread.");
        q.c();
        if (C2452wk.p(this.f1861b) && zna.s == null) {
            C0745Vl.b("Failed to load the ad because app ID is missing.");
            this.g.c(8);
            return false;
        } else if (q()) {
            return false;
        } else {
            this.d = new AtomicBoolean();
            return this.f.a(zna, this.e, new FP(this), new IP(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void b(AbstractC2599yoa yoa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void c(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void d(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void destroy() {
        r.a("destroy must be called on the main UI thread.");
        if (this.k != null) {
            this.k.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void e(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized AbstractC2532xpa getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized C1015boa ib() {
        r.a("getAdSize must be called on the main UI thread.");
        if (this.k == null) {
            return null;
        }
        return JR.a(this.f1861b, Collections.singletonList(this.k.k()));
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void pause() {
        r.a("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized boolean q() {
        return this.f.q();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized void resume() {
        r.a("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final synchronized String zb() {
        return this.e;
    }
}
