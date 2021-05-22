package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Dq  reason: case insensitive filesystem */
public final class BinderC0282Dq extends AbstractBinderC0948apa {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1825a;

    /* renamed from: b  reason: collision with root package name */
    private final C0823Yl f1826b;

    /* renamed from: c  reason: collision with root package name */
    private final C1789nD f1827c;
    private final AbstractC1862oH<SR, YH> d;
    private final C1314gK e;
    private final PE f;
    private final C2243tj g;
    private final C1927pD h;
    private boolean i = false;

    BinderC0282Dq(Context context, C0823Yl yl, C1789nD nDVar, AbstractC1862oH<SR, YH> oHVar, C1314gK gKVar, PE pe, C2243tj tjVar, C1927pD pDVar) {
        this.f1825a = context;
        this.f1826b = yl;
        this.f1827c = nDVar;
        this.d = oHVar;
        this.e = gKVar;
        this.f = pe;
        this.g = tjVar;
        this.h = pDVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void Ca() {
        this.f.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final synchronized void H() {
        if (this.i) {
            C0745Vl.d("Mobile ads is initialized already.");
            return;
        }
        C2474x.a(this.f1825a);
        q.g().a(this.f1825a, this.f1826b);
        q.i().a(this.f1825a);
        this.i = true;
        this.f.b();
        if (((Boolean) C2392voa.e().a(C2474x.jb)).booleanValue()) {
            this.e.a();
        }
        if (((Boolean) C2392voa.e().a(C2474x.rc)).booleanValue()) {
            this.h.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final List<C1130dd> Ma() {
        return this.f.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final synchronized boolean Ua() {
        return q.h().b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final String Va() {
        return this.f1826b.f3587a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final synchronized void a(float f2) {
        q.h().a(f2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(a aVar, String str) {
        if (aVar == null) {
            C0745Vl.b("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) b.Q(aVar);
        if (context == null) {
            C0745Vl.b("Context is null. Failed to open debug menu.");
            return;
        }
        C0536Nk nk = new C0536Nk(context);
        nk.a(str);
        nk.b(this.f1826b.f3587a);
        nk.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(cqa cqa) {
        this.g.a(this.f1825a, cqa);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(AbstractC1611kd kdVar) {
        this.f.a(kdVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(AbstractC1891of ofVar) {
        this.f1827c.a(ofVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Runnable runnable) {
        r.a("Adapters must be initialized on the main thread.");
        Map<String, C1546jf> e2 = q.g().i().m().e();
        if (!(e2 == null || e2.isEmpty())) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C0745Vl.c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f1827c.a()) {
                HashMap hashMap = new HashMap();
                for (C1546jf jfVar : e2.values()) {
                    for (C1615kf kfVar : jfVar.f4697a) {
                        String str = kfVar.k;
                        for (String str2 : kfVar.f4794c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        C1931pH<SR, YH> a2 = this.d.a(str3, jSONObject);
                        if (a2 != null) {
                            AdapterT adaptert = a2.f5211b;
                            if (!adaptert.d()) {
                                if (adaptert.k()) {
                                    adaptert.a(this.f1825a, (YH) a2.f5212c, (List) entry.getValue());
                                    String valueOf = String.valueOf(str3);
                                    C0745Vl.a(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (MR e3) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        C0745Vl.c(sb.toString(), e3);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void b(String str, a aVar) {
        String str2;
        C2474x.a(this.f1825a);
        if (((Boolean) C2392voa.e().a(C2474x.sc)).booleanValue()) {
            q.c();
            str2 = C2452wk.o(this.f1825a);
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) C2392voa.e().a(C2474x.qc)).booleanValue() | ((Boolean) C2392voa.e().a(C2474x.sa)).booleanValue();
            RunnableC0360Gq gq = null;
            if (((Boolean) C2392voa.e().a(C2474x.sa)).booleanValue()) {
                booleanValue = true;
                gq = new RunnableC0360Gq(this, (Runnable) b.Q(aVar));
            }
            if (booleanValue) {
                q.k().a(this.f1825a, this.f1826b, str, gq);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final synchronized void e(boolean z) {
        q.h().a(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final synchronized float gb() {
        return q.h().a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void j(String str) {
        this.e.a(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final synchronized void x(String str) {
        C2474x.a(this.f1825a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C2392voa.e().a(C2474x.qc)).booleanValue()) {
                q.k().a(this.f1825a, this.f1826b, str, (Runnable) null);
            }
        }
    }
}
