package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.e.a;
import com.google.android.gms.ads.e.b;
import com.google.android.gms.ads.g.c;
import com.google.android.gms.ads.q;
import com.google.android.gms.common.internal.r;
import java.util.HashMap;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

public class Ipa {

    /* renamed from: a  reason: collision with root package name */
    private static Ipa f2277a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f2278b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private AbstractC1017bpa f2279c;
    private boolean d = false;
    private c e;
    private q f = new q.a().a();
    private b g;

    class a extends AbstractBinderC1542jd {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.android.gms.ads.e.c f2280a;

        private a(com.google.android.gms.ads.e.c cVar) {
            this.f2280a = cVar;
        }

        /* synthetic */ a(Ipa ipa, com.google.android.gms.ads.e.c cVar, Mpa mpa) {
            this(cVar);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC1611kd
        public final void b(List<C1130dd> list) {
            com.google.android.gms.ads.e.c cVar = this.f2280a;
            Ipa ipa = Ipa.this;
            cVar.a(Ipa.a((Ipa) list));
        }
    }

    private Ipa() {
    }

    /* access modifiers changed from: private */
    public static b a(List<C1130dd> list) {
        HashMap hashMap = new HashMap();
        for (C1130dd ddVar : list) {
            hashMap.put(ddVar.f4116a, new C1680ld(ddVar.f4117b ? a.EnumC0024a.READY : a.EnumC0024a.NOT_READY, ddVar.d, ddVar.f4118c));
        }
        return new C1887od(hashMap);
    }

    private final void a(q qVar) {
        try {
            this.f2279c.a(new cqa(qVar));
        } catch (RemoteException e2) {
            C0745Vl.b("Unable to set request configuration parcel.", e2);
        }
    }

    private final void b(Context context) {
        if (this.f2279c == null) {
            this.f2279c = (AbstractC1017bpa) new C1979poa(C2392voa.b(), context).a(context, false);
        }
    }

    public static Ipa c() {
        Ipa ipa;
        synchronized (Ipa.class) {
            if (f2277a == null) {
                f2277a = new Ipa();
            }
            ipa = f2277a;
        }
        return ipa;
    }

    public final c a(Context context) {
        synchronized (this.f2278b) {
            if (this.e != null) {
                return this.e;
            }
            this.e = new C0352Gi(context, (AbstractC2103ri) new C2254toa(C2392voa.b(), context, new BinderC1684lf()).a(context, false));
            return this.e;
        }
    }

    public final q a() {
        return this.f;
    }

    public final void a(Context context, String str, com.google.android.gms.ads.e.c cVar) {
        synchronized (this.f2278b) {
            if (!this.d) {
                if (context != null) {
                    try {
                        C1340gf.a().a(context, str);
                        b(context);
                        this.d = true;
                        if (cVar != null) {
                            this.f2279c.a(new a(this, cVar, null));
                        }
                        this.f2279c.a(new BinderC1684lf());
                        this.f2279c.H();
                        this.f2279c.b(str, b.c.b.a.c.b.a(new Lpa(this, context)));
                        if (!(this.f.b() == -1 && this.f.c() == -1)) {
                            a(this.f);
                        }
                        C2474x.a(context);
                        if (!((Boolean) C2392voa.e().a(C2474x.md)).booleanValue() && !b().endsWith("0")) {
                            C0745Vl.b("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                            this.g = new Npa(this);
                            if (cVar != null) {
                                C0459Kl.f2428a.post(new Kpa(this, cVar));
                            }
                        }
                    } catch (RemoteException e2) {
                        C0745Vl.c("MobileAdsSettingManager initialization failed", e2);
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.google.android.gms.ads.e.c cVar) {
        cVar.a(this.g);
    }

    public final String b() {
        String c2;
        synchronized (this.f2278b) {
            r.b(this.f2279c != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                c2 = C2014qV.c(this.f2279c.Va());
            } catch (RemoteException e2) {
                C0745Vl.b("Unable to get version string.", e2);
                return BuildConfig.FLAVOR;
            }
        }
        return c2;
    }
}
