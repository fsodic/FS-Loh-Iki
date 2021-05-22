package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.de  reason: case insensitive filesystem */
public final class C1132de {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4119a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4120b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4121c;
    private final C0823Yl d;
    private AbstractC1008bl<AbstractC0607Qd> e;
    private AbstractC1008bl<AbstractC0607Qd> f;
    private C2302ue g;
    private int h;

    public C1132de(Context context, C0823Yl yl, String str) {
        this.f4119a = new Object();
        this.h = 1;
        this.f4121c = str;
        this.f4120b = context.getApplicationContext();
        this.d = yl;
        this.e = new C2095re();
        this.f = new C2095re();
    }

    public C1132de(Context context, C0823Yl yl, String str, AbstractC1008bl<AbstractC0607Qd> blVar, AbstractC1008bl<AbstractC0607Qd> blVar2) {
        this(context, yl, str);
        this.e = blVar;
        this.f = blVar2;
    }

    /* access modifiers changed from: protected */
    public final C2302ue a(C1955pca pca) {
        C2302ue ueVar = new C2302ue(this.f);
        C0875_l.e.execute(new RunnableC1063ce(this, pca, ueVar));
        ueVar.a(new C1751me(this, ueVar), new C1958pe(this, ueVar));
        return ueVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC0607Qd qd) {
        if (qd.isDestroyed()) {
            this.h = 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C1955pca pca, C2302ue ueVar) {
        try {
            Context context = this.f4120b;
            C0823Yl yl = this.d;
            AbstractC0607Qd cd = C0214Ba.f1619c.a().booleanValue() ? new C0243Cd(context, yl) : new C0659Sd(context, yl, pca, null);
            cd.a(new C1407he(this, ueVar, cd));
            cd.a("/jsLoaded", new C1476ie(this, ueVar, cd));
            C2661zl zlVar = new C2661zl();
            C1682le leVar = new C1682le(this, pca, cd, zlVar);
            zlVar.a(leVar);
            cd.a("/requestReload", leVar);
            if (this.f4121c.endsWith(".js")) {
                cd.c(this.f4121c);
            } else if (this.f4121c.startsWith("<html>")) {
                cd.d(this.f4121c);
            } else {
                cd.e(this.f4121c);
            }
            C2452wk.f5921a.postDelayed(new RunnableC1613ke(this, ueVar, cd), (long) C1889oe.f5149a);
        } catch (Throwable th) {
            C0745Vl.b("Error creating webview.", th);
            q.g().a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            ueVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C2302ue ueVar, AbstractC0607Qd qd) {
        synchronized (this.f4119a) {
            if (ueVar.a() != -1) {
                if (ueVar.a() != 1) {
                    ueVar.b();
                    VW vw = C0875_l.e;
                    qd.getClass();
                    vw.execute(RunnableC1544je.a(qd));
                    C1763mk.f("Could not receive loaded message in a timely manner. Rejecting.");
                }
            }
        }
    }

    public final C2027qe b(C1955pca pca) {
        synchronized (this.f4119a) {
            synchronized (this.f4119a) {
                if (this.g != null && this.h == 0) {
                    this.g.a(new C1269fe(this), C1200ee.f4224a);
                }
            }
            if (this.g == null || this.g.a() == -1) {
                this.h = 2;
                this.g = a((C1955pca) null);
                return this.g.c();
            } else if (this.h == 0) {
                return this.g.c();
            } else if (this.h == 1) {
                this.h = 2;
                a((C1955pca) null);
                return this.g.c();
            } else if (this.h == 2) {
                return this.g.c();
            } else {
                return this.g.c();
            }
        }
    }
}
