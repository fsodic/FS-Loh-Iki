package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.mediation.A;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.p;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.v;
import java.util.ArrayList;
import java.util.Iterator;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sg  reason: case insensitive filesystem */
public final class BinderC2168sg extends AbstractBinderC1686lg {

    /* renamed from: a  reason: collision with root package name */
    private final RtbAdapter f5533a;

    /* renamed from: b  reason: collision with root package name */
    private k f5534b;

    /* renamed from: c  reason: collision with root package name */
    private p f5535c;
    private String d = BuildConfig.FLAVOR;

    public BinderC2168sg(RtbAdapter rtbAdapter) {
        this.f5533a = rtbAdapter;
    }

    private static Bundle F(String str) {
        String valueOf = String.valueOf(str);
        C0745Vl.d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
            throw new RemoteException();
        }
    }

    private final d<p, Object> a(AbstractC1411hg hgVar, AbstractC2304uf ufVar) {
        return new C2582yg(this, hgVar, ufVar);
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
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f5533a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final boolean L(a aVar) {
        p pVar = this.f5535c;
        if (pVar == null) {
            return false;
        }
        try {
            pVar.a((Context) b.Q(aVar));
            return true;
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(a aVar, String str, Bundle bundle, Bundle bundle2, C1015boa boa, AbstractC1824ng ngVar) {
        com.google.android.gms.ads.b bVar;
        try {
            C2444wg wgVar = new C2444wg(this, ngVar);
            RtbAdapter rtbAdapter = this.f5533a;
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
                throw new IllegalArgumentException("Internal Error");
            }
            i iVar = new i(bVar, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(iVar);
            rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.a((Context) b.Q(aVar), arrayList, bundle, v.a(boa.e, boa.f3941b, boa.f3940a)), wgVar);
        } catch (Throwable th) {
            C0745Vl.b("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String str, String str2, Zna zna, a aVar, AbstractC0929ag agVar, AbstractC2304uf ufVar, C1015boa boa) {
        try {
            this.f5533a.loadBannerAd(new g((Context) b.Q(aVar), str, F(str2), d(zna), c(zna), zna.k, zna.g, zna.t, a(str2, zna), v.a(boa.e, boa.f3941b, boa.f3940a), this.d), new C2375vg(this, agVar, ufVar));
        } catch (Throwable th) {
            C0745Vl.b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String str, String str2, Zna zna, a aVar, AbstractC0998bg bgVar, AbstractC2304uf ufVar) {
        try {
            this.f5533a.loadInterstitialAd(new l((Context) b.Q(aVar), str, F(str2), d(zna), c(zna), zna.k, zna.g, zna.t, a(str2, zna), this.d), new C2306ug(this, bgVar, ufVar));
        } catch (Throwable th) {
            C0745Vl.b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String str, String str2, Zna zna, a aVar, AbstractC1342gg ggVar, AbstractC2304uf ufVar) {
        try {
            this.f5533a.loadNativeAd(new n((Context) b.Q(aVar), str, F(str2), d(zna), c(zna), zna.k, zna.g, zna.t, a(str2, zna), this.d), new C2513xg(this, ggVar, ufVar));
        } catch (Throwable th) {
            C0745Vl.b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String str, String str2, Zna zna, a aVar, AbstractC1411hg hgVar, AbstractC2304uf ufVar) {
        try {
            this.f5533a.loadRewardedAd(new q((Context) b.Q(aVar), str, F(str2), d(zna), c(zna), zna.k, zna.g, zna.t, a(str2, zna), this.d), a(hgVar, ufVar));
        } catch (Throwable th) {
            C0745Vl.b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String[] strArr, Bundle[] bundleArr) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void b(String str, String str2, Zna zna, a aVar, AbstractC1411hg hgVar, AbstractC2304uf ufVar) {
        try {
            this.f5533a.loadRewardedInterstitialAd(new q((Context) b.Q(aVar), str, F(str2), d(zna), c(zna), zna.k, zna.g, zna.t, a(str2, zna), this.d), a(hgVar, ufVar));
        } catch (Throwable th) {
            C0745Vl.b("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final C0194Ag da() {
        C0194Ag.a(this.f5533a.getSDKVersionInfo());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final C0194Ag fa() {
        C0194Ag.a(this.f5533a.getVersionInfo());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final AbstractC2532xpa getVideoController() {
        RtbAdapter rtbAdapter = this.f5533a;
        if (!(rtbAdapter instanceof A)) {
            return null;
        }
        try {
            return ((A) rtbAdapter).getVideoController();
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void m(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void n(String str) {
        this.d = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final boolean o(a aVar) {
        k kVar = this.f5534b;
        if (kVar == null) {
            return false;
        }
        try {
            kVar.a((Context) b.Q(aVar));
            return true;
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            return true;
        }
    }
}
