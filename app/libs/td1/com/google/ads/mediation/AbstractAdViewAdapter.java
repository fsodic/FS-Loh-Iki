package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.b.g;
import com.google.android.gms.ads.b.h;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.b.k;
import com.google.android.gms.ads.b.l;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.mediation.A;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.mediation.x;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.AbstractC2532xpa;
import com.google.android.gms.internal.ads.C0459Kl;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.Ona;
import com.google.android.gms.internal.ads.zzbic;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, x, A, MediationRewardedVideoAdAdapter, zzbic {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private h zzmi;
    private k zzmj;
    private com.google.android.gms.ads.d zzmk;
    private Context zzml;
    private k zzmm;
    private com.google.android.gms.ads.reward.mediation.a zzmn;
    private final com.google.android.gms.ads.g.d zzmo = new h(this);

    static class a extends t {
        private final com.google.android.gms.ads.b.h n;

        public a(com.google.android.gms.ads.b.h hVar) {
            this.n = hVar;
            d(hVar.e().toString());
            a(hVar.f());
            b(hVar.c().toString());
            if (hVar.g() != null) {
                a(hVar.g());
            }
            c(hVar.d().toString());
            a(hVar.b().toString());
            b(true);
            a(true);
            a(hVar.h());
        }

        @Override // com.google.android.gms.ads.mediation.r
        public final void b(View view) {
            if (view instanceof com.google.android.gms.ads.b.e) {
                ((com.google.android.gms.ads.b.e) view).setNativeAd(this.n);
            }
            com.google.android.gms.ads.b.f fVar = com.google.android.gms.ads.b.f.f1034a.get(view);
            if (fVar != null) {
                fVar.a(this.n);
            }
        }
    }

    static class b extends s {
        private final g p;

        public b(g gVar) {
            this.p = gVar;
            c(gVar.d().toString());
            a(gVar.f());
            a(gVar.b().toString());
            a(gVar.e());
            b(gVar.c().toString());
            if (gVar.h() != null) {
                a(gVar.h().doubleValue());
            }
            if (gVar.i() != null) {
                e(gVar.i().toString());
            }
            if (gVar.g() != null) {
                d(gVar.g().toString());
            }
            b(true);
            a(true);
            a(gVar.j());
        }

        @Override // com.google.android.gms.ads.mediation.r
        public final void b(View view) {
            if (view instanceof com.google.android.gms.ads.b.e) {
                ((com.google.android.gms.ads.b.e) view).setNativeAd(this.p);
            }
            com.google.android.gms.ads.b.f fVar = com.google.android.gms.ads.b.f.f1034a.get(view);
            if (fVar != null) {
                fVar.a(this.p);
            }
        }
    }

    static final class c extends com.google.android.gms.ads.c implements com.google.android.gms.ads.a.a, Ona {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractAdViewAdapter f992a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.android.gms.ads.mediation.h f993b;

        public c(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.h hVar) {
            this.f992a = abstractAdViewAdapter;
            this.f993b = hVar;
        }

        @Override // com.google.android.gms.ads.c
        public final void a() {
            this.f993b.a(this.f992a);
        }

        @Override // com.google.android.gms.ads.c
        public final void a(int i) {
            this.f993b.a(this.f992a, i);
        }

        @Override // com.google.android.gms.ads.a.a
        public final void a(String str, String str2) {
            this.f993b.a(this.f992a, str, str2);
        }

        @Override // com.google.android.gms.ads.c
        public final void c() {
            this.f993b.d(this.f992a);
        }

        @Override // com.google.android.gms.ads.c
        public final void d() {
            this.f993b.c(this.f992a);
        }

        @Override // com.google.android.gms.internal.ads.Ona, com.google.android.gms.ads.c
        public final void e() {
            this.f993b.b(this.f992a);
        }

        @Override // com.google.android.gms.ads.c
        public final void f() {
            this.f993b.e(this.f992a);
        }
    }

    static class d extends y {
        private final com.google.android.gms.ads.b.k s;

        public d(com.google.android.gms.ads.b.k kVar) {
            this.s = kVar;
            d(kVar.d());
            a(kVar.f());
            b(kVar.b());
            a(kVar.e());
            c(kVar.c());
            a(kVar.a());
            a(kVar.h());
            f(kVar.i());
            e(kVar.g());
            a(kVar.l());
            b(true);
            a(true);
            a(kVar.j());
        }

        @Override // com.google.android.gms.ads.mediation.y
        public final void a(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof l) {
                ((l) view).setNativeAd(this.s);
                return;
            }
            com.google.android.gms.ads.b.f fVar = com.google.android.gms.ads.b.f.f1034a.get(view);
            if (fVar != null) {
                fVar.a(this.s);
            }
        }
    }

    static final class e extends com.google.android.gms.ads.c implements g.a, h.a, i.a, i.b, k.a {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractAdViewAdapter f994a;

        /* renamed from: b  reason: collision with root package name */
        private final o f995b;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, o oVar) {
            this.f994a = abstractAdViewAdapter;
            this.f995b = oVar;
        }

        @Override // com.google.android.gms.ads.c
        public final void a() {
            this.f995b.b(this.f994a);
        }

        @Override // com.google.android.gms.ads.c
        public final void a(int i) {
            this.f995b.a(this.f994a, i);
        }

        @Override // com.google.android.gms.ads.b.g.a
        public final void a(g gVar) {
            this.f995b.a(this.f994a, new b(gVar));
        }

        @Override // com.google.android.gms.ads.b.h.a
        public final void a(com.google.android.gms.ads.b.h hVar) {
            this.f995b.a(this.f994a, new a(hVar));
        }

        @Override // com.google.android.gms.ads.b.i.b
        public final void a(i iVar) {
            this.f995b.a(this.f994a, iVar);
        }

        @Override // com.google.android.gms.ads.b.i.a
        public final void a(i iVar, String str) {
            this.f995b.a(this.f994a, iVar, str);
        }

        @Override // com.google.android.gms.ads.b.k.a
        public final void a(com.google.android.gms.ads.b.k kVar) {
            this.f995b.a(this.f994a, new d(kVar));
        }

        @Override // com.google.android.gms.ads.c
        public final void b() {
            this.f995b.e(this.f994a);
        }

        @Override // com.google.android.gms.ads.c
        public final void c() {
            this.f995b.d(this.f994a);
        }

        @Override // com.google.android.gms.ads.c
        public final void d() {
        }

        @Override // com.google.android.gms.ads.c
        public final void e() {
            this.f995b.c(this.f994a);
        }

        @Override // com.google.android.gms.ads.c
        public final void f() {
            this.f995b.a(this.f994a);
        }
    }

    static final class f extends com.google.android.gms.ads.c implements Ona {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractAdViewAdapter f996a;

        /* renamed from: b  reason: collision with root package name */
        private final m f997b;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
            this.f996a = abstractAdViewAdapter;
            this.f997b = mVar;
        }

        @Override // com.google.android.gms.ads.c
        public final void a() {
            this.f997b.d(this.f996a);
        }

        @Override // com.google.android.gms.ads.c
        public final void a(int i) {
            this.f997b.a(this.f996a, i);
        }

        @Override // com.google.android.gms.ads.c
        public final void c() {
            this.f997b.a(this.f996a);
        }

        @Override // com.google.android.gms.ads.c
        public final void d() {
            this.f997b.c(this.f996a);
        }

        @Override // com.google.android.gms.internal.ads.Ona, com.google.android.gms.ads.c
        public final void e() {
            this.f997b.b(this.f996a);
        }

        @Override // com.google.android.gms.ads.c
        public final void f() {
            this.f997b.e(this.f996a);
        }
    }

    private final com.google.android.gms.ads.e zza(Context context, com.google.android.gms.ads.mediation.e eVar, Bundle bundle, Bundle bundle2) {
        e.a aVar = new e.a();
        Date g = eVar.g();
        if (g != null) {
            aVar.a(g);
        }
        int l = eVar.l();
        if (l != 0) {
            aVar.a(l);
        }
        Set<String> i = eVar.i();
        if (i != null) {
            for (String str : i) {
                aVar.a(str);
            }
        }
        Location location = eVar.getLocation();
        if (location != null) {
            aVar.a(location);
        }
        if (eVar.h()) {
            C2392voa.a();
            aVar.b(C0459Kl.a(context));
        }
        if (eVar.c() != -1) {
            boolean z = true;
            if (eVar.c() != 1) {
                z = false;
            }
            aVar.b(z);
        }
        aVar.a(eVar.e());
        aVar.a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar.a();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzmi;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public Bundle getInterstitialAdapterInfo() {
        f.a aVar = new f.a();
        aVar.a(1);
        return aVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.A
    public AbstractC2532xpa getVideoController() {
        com.google.android.gms.ads.s videoController;
        com.google.android.gms.ads.h hVar = this.zzmi;
        if (hVar == null || (videoController = hVar.getVideoController()) == null) {
            return null;
        }
        return videoController.a();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, com.google.android.gms.ads.mediation.e eVar, String str, com.google.android.gms.ads.reward.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        this.zzml = context.getApplicationContext();
        this.zzmn = aVar;
        this.zzmn.f(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzmn != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(com.google.android.gms.ads.mediation.e eVar, Bundle bundle, Bundle bundle2) {
        Context context = this.zzml;
        if (context == null || this.zzmn == null) {
            C0745Vl.b("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzmm = new com.google.android.gms.ads.k(context);
        this.zzmm.b(true);
        this.zzmm.a(getAdUnitId(bundle));
        this.zzmm.a(this.zzmo);
        this.zzmm.a(new g(this));
        this.zzmm.a(zza(this.zzml, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.f
    public void onDestroy() {
        com.google.android.gms.ads.h hVar = this.zzmi;
        if (hVar != null) {
            hVar.a();
            this.zzmi = null;
        }
        if (this.zzmj != null) {
            this.zzmj = null;
        }
        if (this.zzmk != null) {
            this.zzmk = null;
        }
        if (this.zzmm != null) {
            this.zzmm = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.x
    public void onImmersiveModeUpdated(boolean z) {
        com.google.android.gms.ads.k kVar = this.zzmj;
        if (kVar != null) {
            kVar.a(z);
        }
        com.google.android.gms.ads.k kVar2 = this.zzmm;
        if (kVar2 != null) {
            kVar2.a(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    public void onPause() {
        com.google.android.gms.ads.h hVar = this.zzmi;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    public void onResume() {
        com.google.android.gms.ads.h hVar = this.zzmi;
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.h hVar, Bundle bundle, com.google.android.gms.ads.f fVar, com.google.android.gms.ads.mediation.e eVar, Bundle bundle2) {
        this.zzmi = new com.google.android.gms.ads.h(context);
        this.zzmi.setAdSize(new com.google.android.gms.ads.f(fVar.b(), fVar.a()));
        this.zzmi.setAdUnitId(getAdUnitId(bundle));
        this.zzmi.setAdListener(new c(this, hVar));
        this.zzmi.a(zza(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, m mVar, Bundle bundle, com.google.android.gms.ads.mediation.e eVar, Bundle bundle2) {
        this.zzmj = new com.google.android.gms.ads.k(context);
        this.zzmj.a(getAdUnitId(bundle));
        this.zzmj.a(new f(this, mVar));
        this.zzmj.a(zza(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, o oVar, Bundle bundle, u uVar, Bundle bundle2) {
        e eVar = new e(this, oVar);
        d.a aVar = new d.a(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        aVar.a((com.google.android.gms.ads.c) eVar);
        com.google.android.gms.ads.b.d j = uVar.j();
        if (j != null) {
            aVar.a(j);
        }
        if (uVar.d()) {
            aVar.a((k.a) eVar);
        }
        if (uVar.f()) {
            aVar.a((g.a) eVar);
        }
        if (uVar.k()) {
            aVar.a((h.a) eVar);
        }
        if (uVar.b()) {
            for (String str : uVar.a().keySet()) {
                aVar.a(str, eVar, uVar.a().get(str).booleanValue() ? eVar : null);
            }
        }
        this.zzmk = aVar.a();
        this.zzmk.a(zza(context, uVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzmj.c();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzmm.c();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
