package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import b.c.b.a.c.a;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Mz  reason: case insensitive filesystem */
public final class C0525Mz extends C0952at {
    private final Executor h;
    private final C0707Tz i;
    private final AbstractC0891aA j;
    private final C1924pA k;
    private final C0811Xz l;
    private final C1098dA m;
    private final Lea<ZB> n;
    private final Lea<XB> o;
    private final Lea<BinderC0962bC> p;
    private final Lea<TB> q;
    private final Lea<BinderC0893aC> r;
    private OA s;
    private boolean t;
    private final C2037qj u;
    private final C1955pca v;
    private final C0823Yl w;
    private final Context x;
    private final C0681Sz y;
    private final C2209tK z;

    public C0525Mz(C0882_s _sVar, Executor executor, C0707Tz tz, AbstractC0891aA aAVar, C1924pA pAVar, C0811Xz xz, C1098dA dAVar, Lea<ZB> lea, Lea<XB> lea2, Lea<BinderC0962bC> lea3, Lea<TB> lea4, Lea<BinderC0893aC> lea5, C2037qj qjVar, C1955pca pca, C0823Yl yl, Context context, C0681Sz sz, C2209tK tKVar) {
        super(_sVar);
        this.h = executor;
        this.i = tz;
        this.j = aAVar;
        this.k = pAVar;
        this.l = xz;
        this.m = dAVar;
        this.n = lea;
        this.o = lea2;
        this.p = lea3;
        this.q = lea4;
        this.r = lea5;
        this.u = qjVar;
        this.v = pca;
        this.w = yl;
        this.x = context;
        this.y = sz;
        this.z = tKVar;
    }

    public static boolean d(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    @Override // com.google.android.gms.internal.ads.C0952at
    public final synchronized void a() {
        this.h.execute(new RunnableC0551Nz(this));
        super.a();
    }

    public final synchronized void a(Bundle bundle) {
        this.j.a(bundle);
    }

    public final synchronized void a(View view) {
        this.j.a(view);
    }

    public final synchronized void a(View view, MotionEvent motionEvent, View view2) {
        this.j.a(view, motionEvent, view2);
    }

    public final synchronized void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z2) {
        this.k.b(this.s);
        this.j.a(view, view2, map, map2, z2);
    }

    public final synchronized void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z2) {
        if (!this.t) {
            if (z2) {
                this.k.c(this.s);
                this.j.a(view, map, map2);
                this.t = true;
                return;
            }
            if (!z2) {
                if (((Boolean) C2392voa.e().a(C2474x.hc)).booleanValue() && map != null) {
                    for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                        View view2 = entry.getValue().get();
                        if (view2 != null && d(view2)) {
                            this.k.c(this.s);
                            this.j.a(view, map, map2);
                            this.t = true;
                            return;
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(OA oa) {
        AbstractC1740mX a2;
        this.s = oa;
        this.k.a(oa);
        this.j.a(oa.Nb(), oa.Ob(), oa.Qb(), oa, oa);
        if (((Boolean) C2392voa.e().a(C2474x.Ab)).booleanValue() && (a2 = this.v.a()) != null) {
            a2.a(oa.Nb());
        }
        if (oa.Kb() != null) {
            oa.Kb().a(this.u);
        }
    }

    public final synchronized void a(AbstractC0657Sb sb) {
        this.j.a(sb);
    }

    public final synchronized void a(AbstractC1223epa epa) {
        this.j.a(epa);
    }

    public final synchronized void a(AbstractC1498ipa ipa) {
        this.j.a(ipa);
    }

    public final synchronized void a(AbstractC2118rpa rpa) {
        this.z.a(rpa);
    }

    public final synchronized void a(String str) {
        this.j.a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0525Mz.a(java.lang.String, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2) {
        this.j.a(this.s.Nb(), this.s.Mb(), this.s.Ob(), z2);
    }

    @Override // com.google.android.gms.internal.ads.C0952at
    public final void b() {
        this.h.execute(new RunnableC0499Lz(this));
        if (this.i.o() != 7) {
            Executor executor = this.h;
            AbstractC0891aA aAVar = this.j;
            aAVar.getClass();
            executor.execute(RunnableC0577Oz.a(aAVar));
        }
        super.b();
    }

    public final synchronized void b(Bundle bundle) {
        this.j.b(bundle);
    }

    public final void b(View view) {
        a v2 = this.i.v();
        boolean z2 = this.i.u() != null;
        if (this.l.a() && v2 != null && z2 && view != null) {
            q.r().a(v2, view);
        }
    }

    public final synchronized void b(OA oa) {
        this.j.a(oa.Nb(), oa.Mb());
        if (oa.Jb() != null) {
            oa.Jb().setClickable(false);
            oa.Jb().removeAllViews();
        }
        if (oa.Kb() != null) {
            oa.Kb().b(this.u);
        }
        this.s = null;
    }

    public final void c(View view) {
        a v2 = this.i.v();
        if (this.l.a() && v2 != null && view != null) {
            q.r().b(v2, view);
        }
    }

    public final synchronized boolean c(Bundle bundle) {
        if (this.t) {
            return true;
        }
        boolean c2 = this.j.c(bundle);
        this.t = c2;
        return c2;
    }

    public final synchronized void g() {
        this.j.x();
    }

    public final synchronized boolean h() {
        return this.j.G();
    }

    public final synchronized void i() {
        if (this.s == null) {
            C0745Vl.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.h.execute(new RunnableC0629Qz(this, this.s instanceof ViewTreeObserver$OnGlobalLayoutListenerC1855oA));
        }
    }

    public final synchronized void j() {
        if (!this.t) {
            this.j.a();
        }
    }

    public final boolean k() {
        return this.l.d();
    }

    public final boolean l() {
        return this.l.a();
    }

    public final C0681Sz m() {
        return this.y;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        this.j.destroy();
        this.i.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        try {
            int o2 = this.i.o();
            if (o2 != 1) {
                if (o2 != 2) {
                    if (o2 != 3) {
                        if (o2 != 6) {
                            if (o2 != 7) {
                                C0745Vl.b("Wrong native template id!");
                            } else if (this.m.e() != null) {
                                this.m.e().a(this.q.get());
                            }
                        } else if (this.m.c() != null) {
                            a("Google", true);
                            this.m.c().a(this.p.get());
                        }
                    } else if (this.m.a(this.i.e()) != null) {
                        if (this.i.t() != null) {
                            a("Google", true);
                        }
                        this.m.a(this.i.e()).a(this.r.get());
                    }
                } else if (this.m.b() != null) {
                    a("Google", true);
                    this.m.b().a(this.o.get());
                }
            } else if (this.m.a() != null) {
                a("Google", true);
                this.m.a().a(this.n.get());
            }
        } catch (RemoteException e) {
            C0745Vl.b("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized void p() {
        this.j.v();
    }
}
