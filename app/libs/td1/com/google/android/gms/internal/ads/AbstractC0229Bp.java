package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.C0203Ap;
import com.google.android.gms.internal.ads.C2602yq;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Bp  reason: case insensitive filesystem */
public abstract class AbstractC0229Bp implements AbstractC0854Zq {

    /* renamed from: a  reason: collision with root package name */
    private static AbstractC0229Bp f1657a;

    @Deprecated
    public static AbstractC0229Bp a(Context context, int i) {
        synchronized (AbstractC0229Bp.class) {
            if (f1657a == null) {
                return a(new C0823Yl(201604000, i, true, false), context, new C0801Xp());
            }
            return f1657a;
        }
    }

    public static AbstractC0229Bp a(Context context, AbstractC1891of ofVar, int i) {
        AbstractC0229Bp a2 = a(context, i);
        a2.f().a(ofVar);
        return a2;
    }

    @Deprecated
    private static AbstractC0229Bp a(C0823Yl yl, Context context, C2602yq.a aVar) {
        AbstractC0229Bp bp;
        synchronized (AbstractC0229Bp.class) {
            if (f1657a == null) {
                C1706lq lqVar = new C1706lq();
                C0203Ap.a aVar2 = new C0203Ap.a();
                aVar2.a(yl);
                aVar2.a(context);
                lqVar.a(new C0203Ap(aVar2));
                lqVar.a(new C2602yq(aVar));
                f1657a = lqVar.a();
                C2474x.a(context);
                q.g().a(context, yl);
                q.i().a(context);
                q.c().a(context);
                q.c().b(context);
                C1625kk.a(context);
                q.f().a(context);
                q.x().a(context);
                if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue()) {
                    new C1517jH(context, yl, new Dma(new Hma(context)), new TG(new RG(context), f1657a.d())).a();
                }
            }
            bp = f1657a;
        }
        return bp;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0854Zq
    public final AbstractC2420wO a(C0715Uh uh, int i) {
        return a(new C1319gP(uh, i));
    }

    /* access modifiers changed from: protected */
    public abstract AbstractC2420wO a(C1319gP gPVar);

    public abstract Executor a();

    public abstract ScheduledExecutorService b();

    public abstract Executor c();

    public abstract VW d();

    public abstract C0729Uv e();

    public abstract C1789nD f();

    public abstract BinderC0282Dq g();

    public abstract AbstractC0206As h();

    public abstract AbstractC0647Rr i();

    public abstract JP j();

    public abstract AbstractC0602Py k();

    public abstract AbstractC1853nz l();

    public abstract FC m();

    public abstract AbstractC1321gR n();

    public abstract UK o();

    public abstract XK p();

    public abstract RR<C1306gC> q();
}
