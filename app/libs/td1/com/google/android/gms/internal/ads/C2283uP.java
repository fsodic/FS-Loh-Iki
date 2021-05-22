package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C1162dx;
import com.google.android.gms.internal.ads.C2537xu;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uP  reason: case insensitive filesystem */
public final class C2283uP implements LK<C0725Ur> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5713a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5714b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0229Bp f5715c;
    private final MP d;
    private final AbstractC1940pQ<AbstractC0569Or, C0725Ur> e;
    private final ViewGroup f;
    private final IR g;
    private SW<C0725Ur> h;

    public C2283uP(Context context, Executor executor, AbstractC0229Bp bp, AbstractC1940pQ<AbstractC0569Or, C0725Ur> pQVar, MP mp, IR ir) {
        this.f5713a = context;
        this.f5714b = executor;
        this.f5715c = bp;
        this.e = pQVar;
        this.d = mp;
        this.g = ir;
        this.f = new FrameLayout(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized AbstractC0647Rr a(AbstractC2146sQ sQVar) {
        BP bp = (BP) sQVar;
        if (((Boolean) C2392voa.e().a(C2474x.af)).booleanValue()) {
            AbstractC0647Rr i = this.f5715c.i();
            i.a(new C0881_r(this.f));
            C2537xu.a aVar = new C2537xu.a();
            aVar.a(this.f5713a);
            aVar.a(bp.f1608a);
            i.c(aVar.a());
            i.a(new C1162dx.a().a());
            return i;
        }
        MP a2 = MP.a(this.d);
        C1162dx.a aVar2 = new C1162dx.a();
        aVar2.a((AbstractC0650Ru) a2, this.f5714b);
        aVar2.a((AbstractC0391Hv) a2, this.f5714b);
        aVar2.a(a2);
        AbstractC0647Rr i2 = this.f5715c.i();
        i2.a(new C0881_r(this.f));
        C2537xu.a aVar3 = new C2537xu.a();
        aVar3.a(this.f5713a);
        aVar3.a(bp.f1608a);
        i2.c(aVar3.a());
        i2.a(aVar2.a());
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.d.c(1);
    }

    public final void a(C1496ioa ioa) {
        this.g.a(ioa);
    }

    @Override // com.google.android.gms.internal.ads.LK
    public final synchronized boolean a(Zna zna, String str, KK kk, NK<? super C0725Ur> nk) {
        r.a("loadAd must be called on the main UI thread.");
        if (str == null) {
            C0745Vl.b("Ad unit ID should not be null for app open ad.");
            this.f5714b.execute(new RunnableC2490xP(this));
            return false;
        } else if (this.h != null) {
            return false;
        } else {
            PR.a(this.f5713a, zna.f);
            IR ir = this.g;
            ir.a(str);
            ir.a(C1015boa.N());
            ir.a(zna);
            GR d2 = ir.d();
            BP bp = new BP(null);
            bp.f1608a = d2;
            this.h = this.e.a(new C2284uQ(bp), new C2421wP(this));
            JW.a(this.h, new C2628zP(this, nk, bp), this.f5714b);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.LK
    public final boolean q() {
        SW<C0725Ur> sw = this.h;
        return sw != null && !sw.isDone();
    }
}
