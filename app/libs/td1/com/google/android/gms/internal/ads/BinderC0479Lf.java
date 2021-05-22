package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.A;
import com.google.android.gms.ads.mediation.AbstractC0135a;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.p;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.mediation.x;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.v;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lf  reason: case insensitive filesystem */
public final class BinderC0479Lf extends AbstractBinderC2166sf {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2511a;

    /* renamed from: b  reason: collision with root package name */
    private C0505Mf f2512b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0326Fi f2513c;
    private a d;
    private p e;

    public BinderC0479Lf(AbstractC0135a aVar) {
        this.f2511a = aVar;
    }

    public BinderC0479Lf(f fVar) {
        this.f2511a = fVar;
    }

    private final Bundle a(String str, Zna zna, String str2) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        C0745Vl.a(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f2511a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zna != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zna.g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    private final d<p, Object> a(AbstractC2304uf ufVar) {
        return new C0531Nf(this, ufVar);
    }

    private static String a(String str, Zna zna) {
        String str2 = zna.u;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private static boolean c(Zna zna) {
        if (zna.f) {
            return true;
        }
        C2392voa.a();
        return C0459Kl.a();
    }

    private final Bundle d(Zna zna) {
        Bundle bundle;
        Bundle bundle2 = zna.m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f2511a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC0297Ef Cb() {
        y b2 = this.f2512b.b();
        if (b2 != null) {
            return new BinderC0817Yf(b2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final Bundle Ha() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void K(a aVar) {
        if (this.f2511a instanceof AbstractC0135a) {
            C0745Vl.a("Show rewarded ad from adapter.");
            p pVar = this.e;
            if (pVar != null) {
                pVar.a((Context) b.Q(aVar));
            } else {
                C0745Vl.b("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = AbstractC0135a.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, AbstractC0326Fi fi, List<String> list) {
        if (this.f2511a instanceof InitializableMediationRewardedVideoAdAdapter) {
            C0745Vl.a("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f2511a;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    arrayList.add(a(str, (Zna) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) b.Q(aVar), new C0482Li(fi), arrayList);
            } catch (Throwable th) {
                C0745Vl.c("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, AbstractC0326Fi fi, String str2) {
        Bundle bundle;
        C0401If r7;
        Object obj = this.f2511a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            C0745Vl.a("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f2511a;
                Bundle a2 = a(str2, zna, (String) null);
                if (zna != null) {
                    C0401If r6 = new C0401If(zna.f3678b == -1 ? null : new Date(zna.f3678b), zna.d, zna.e != null ? new HashSet(zna.e) : null, zna.k, c(zna), zna.g, zna.r, zna.t, a(str2, zna));
                    bundle = zna.m != null ? zna.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    r7 = r6;
                } else {
                    r7 = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) b.Q(aVar), r7, str, new C0482Li(fi), a2, bundle);
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof AbstractC0135a) {
            this.d = aVar;
            this.f2513c = fi;
            fi.u(b.a(obj));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC0135a.class.getCanonicalName();
            String canonicalName3 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
        a(aVar, zna, str, (String) null, ufVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, String str2, AbstractC2304uf ufVar) {
        if (this.f2511a instanceof MediationInterstitialAdapter) {
            C0745Vl.a("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f2511a;
                Bundle bundle = null;
                C0401If r3 = new C0401If(zna.f3678b == -1 ? null : new Date(zna.f3678b), zna.d, zna.e != null ? new HashSet(zna.e) : null, zna.k, c(zna), zna.g, zna.r, zna.t, a(str, zna));
                if (zna.m != null) {
                    bundle = zna.m.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) b.Q(aVar), new C0505Mf(ufVar), a(str, zna, str2), r3, bundle);
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, String str2, AbstractC2304uf ufVar, C0578Pa pa, List<String> list) {
        Object obj = this.f2511a;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                Bundle bundle = null;
                C0609Qf qf = new C0609Qf(zna.f3678b == -1 ? null : new Date(zna.f3678b), zna.d, zna.e != null ? new HashSet(zna.e) : null, zna.k, c(zna), zna.g, pa, list, zna.r, zna.t, a(str, zna));
                if (zna.m != null) {
                    bundle = zna.m.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.f2512b = new C0505Mf(ufVar);
                mediationNativeAdapter.requestNativeAd((Context) b.Q(aVar), this.f2512b, a(str, zna, str2), qf, bundle);
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, C1015boa boa, Zna zna, String str, AbstractC2304uf ufVar) {
        a(aVar, boa, zna, str, null, ufVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, C1015boa boa, Zna zna, String str, String str2, AbstractC2304uf ufVar) {
        if (this.f2511a instanceof MediationBannerAdapter) {
            C0745Vl.a("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f2511a;
                Bundle bundle = null;
                C0401If r4 = new C0401If(zna.f3678b == -1 ? null : new Date(zna.f3678b), zna.d, zna.e != null ? new HashSet(zna.e) : null, zna.k, c(zna), zna.g, zna.r, zna.t, a(str, zna));
                if (zna.m != null) {
                    bundle = zna.m.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) b.Q(aVar), new C0505Mf(ufVar), a(str, zna, str2), boa.n ? v.a(boa.e, boa.f3941b) : v.a(boa.e, boa.f3941b, boa.f3940a), r4, bundle);
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, AbstractC1267fd fdVar, List<C1818nd> list) {
        com.google.android.gms.ads.b bVar;
        if (this.f2511a instanceof AbstractC0135a) {
            C0453Kf kf = new C0453Kf(this, fdVar);
            ArrayList arrayList = new ArrayList();
            for (C1818nd ndVar : list) {
                String str = ndVar.f5057a;
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    bVar = com.google.android.gms.ads.b.BANNER;
                } else if (c2 == 1) {
                    bVar = com.google.android.gms.ads.b.INTERSTITIAL;
                } else if (c2 == 2) {
                    bVar = com.google.android.gms.ads.b.REWARDED;
                } else if (c2 == 3) {
                    bVar = com.google.android.gms.ads.b.NATIVE;
                } else {
                    throw new RemoteException();
                }
                arrayList.add(new i(bVar, ndVar.f5058b));
            }
            ((AbstractC0135a) this.f2511a).initialize((Context) b.Q(aVar), kf, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(Zna zna, String str) {
        a(zna, str, (String) null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(Zna zna, String str, String str2) {
        Object obj = this.f2511a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            C0745Vl.a("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f2511a;
                Bundle bundle = null;
                C0401If r4 = new C0401If(zna.f3678b == -1 ? null : new Date(zna.f3678b), zna.d, zna.e != null ? new HashSet(zna.e) : null, zna.k, c(zna), zna.g, zna.r, zna.t, a(str, zna));
                if (zna.m != null) {
                    bundle = zna.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(r4, a(str, zna, str2), bundle);
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof AbstractC0135a) {
            b(this.d, zna, str, new BinderC0583Pf((AbstractC0135a) obj, this.f2513c));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC0135a.class.getCanonicalName();
            String canonicalName3 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(boolean z) {
        Object obj = this.f2511a;
        if (!(obj instanceof x)) {
            String canonicalName = x.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.a(sb.toString());
            return;
        }
        try {
            ((x) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void b(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
        if (this.f2511a instanceof AbstractC0135a) {
            C0745Vl.a("Requesting rewarded ad from adapter.");
            try {
                ((AbstractC0135a) this.f2511a).loadRewardedAd(new q((Context) b.Q(aVar), BuildConfig.FLAVOR, a(str, zna, (String) null), d(zna), c(zna), zna.k, zna.g, zna.t, a(str, zna), BuildConfig.FLAVOR), a(ufVar));
            } catch (Exception e2) {
                C0745Vl.b(BuildConfig.FLAVOR, e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = AbstractC0135a.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC0271Df bb() {
        r a2 = this.f2512b.a();
        if (a2 instanceof t) {
            return new BinderC0635Rf((t) a2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void c(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
        if (this.f2511a instanceof AbstractC0135a) {
            C0745Vl.a("Requesting rewarded interstitial ad from adapter.");
            try {
                ((AbstractC0135a) this.f2511a).loadRewardedInterstitialAd(new q((Context) b.Q(aVar), BuildConfig.FLAVOR, a(str, zna, (String) null), d(zna), c(zna), zna.k, zna.g, zna.t, a(str, zna), BuildConfig.FLAVOR), a(ufVar));
            } catch (Exception e2) {
                C0745Vl.b(BuildConfig.FLAVOR, e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = AbstractC0135a.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final C0194Ag da() {
        Object obj = this.f2511a;
        if (!(obj instanceof AbstractC0135a)) {
            return null;
        }
        C0194Ag.a(((AbstractC0135a) obj).getSDKVersionInfo());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void destroy() {
        Object obj = this.f2511a;
        if (obj instanceof f) {
            try {
                ((f) obj).onDestroy();
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final C0194Ag fa() {
        Object obj = this.f2511a;
        if (!(obj instanceof AbstractC0135a)) {
            return null;
        }
        C0194Ag.a(((AbstractC0135a) obj).getVersionInfo());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.f2511a;
        if (obj instanceof zzbic) {
            return ((zzbic) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbic.class.getCanonicalName();
        String canonicalName2 = this.f2511a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C0745Vl.d(sb.toString());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC2532xpa getVideoController() {
        Object obj = this.f2511a;
        if (!(obj instanceof A)) {
            return null;
        }
        try {
            return ((A) obj).getVideoController();
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final boolean isInitialized() {
        Object obj = this.f2511a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            C0745Vl.a("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f2511a).isInitialized();
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof AbstractC0135a) {
            return this.f2513c != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC0135a.class.getCanonicalName();
            String canonicalName3 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC2158sb ka() {
        com.google.android.gms.ads.b.i c2 = this.f2512b.c();
        if (c2 instanceof C2227tb) {
            return ((C2227tb) c2).a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC2580yf nb() {
        r a2 = this.f2512b.a();
        if (a2 instanceof s) {
            return new BinderC0557Of((s) a2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void pause() {
        Object obj = this.f2511a;
        if (obj instanceof f) {
            try {
                ((f) obj).onPause();
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void resume() {
        Object obj = this.f2511a;
        if (obj instanceof f) {
            try {
                ((f) obj).onResume();
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final boolean sa() {
        return this.f2511a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void showInterstitial() {
        if (this.f2511a instanceof MediationInterstitialAdapter) {
            C0745Vl.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f2511a).showInterstitial();
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void showVideo() {
        Object obj = this.f2511a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            C0745Vl.a("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f2511a).showVideo();
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof AbstractC0135a) {
            p pVar = this.e;
            if (pVar != null) {
                pVar.a((Context) b.Q(this.d));
            } else {
                C0745Vl.b("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC0135a.class.getCanonicalName();
            String canonicalName3 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void x(a aVar) {
        Context context = (Context) b.Q(aVar);
        Object obj = this.f2511a;
        if (obj instanceof w) {
            ((w) obj).a(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final a xb() {
        Object obj = this.f2511a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return b.a(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C0745Vl.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final Bundle zztm() {
        Object obj = this.f2511a;
        if (obj instanceof zzbid) {
            return ((zzbid) obj).zztm();
        }
        String canonicalName = zzbid.class.getCanonicalName();
        String canonicalName2 = this.f2511a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C0745Vl.d(sb.toString());
        return new Bundle();
    }
}
