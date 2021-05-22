package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.a.c;
import b.c.b.a.c.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Tf  reason: case insensitive filesystem */
public final class BinderC0687Tf<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> extends AbstractBinderC2166sf {

    /* renamed from: a  reason: collision with root package name */
    private final b<NETWORK_EXTRAS, SERVER_PARAMETERS> f3194a;

    /* renamed from: b  reason: collision with root package name */
    private final NETWORK_EXTRAS f3195b;

    public BinderC0687Tf(b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f3194a = bVar;
        this.f3195b = network_extras;
    }

    private final SERVER_PARAMETERS F(String str) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                C0745Vl.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f3194a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
        newInstance.a(hashMap);
        return newInstance;
    }

    private static boolean c(Zna zna) {
        if (zna.f) {
            return true;
        }
        C2392voa.a();
        return C0459Kl.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC0297Ef Cb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final Bundle Ha() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void K(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, AbstractC0326Fi fi, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, AbstractC0326Fi fi, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
        a(aVar, zna, str, (String) null, ufVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, String str2, AbstractC2304uf ufVar) {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f3194a;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C0745Vl.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C0745Vl.a("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f3194a).requestInterstitialAd(new C0661Sf(ufVar), (Activity) b.c.b.a.c.b.Q(aVar), F(str), C0791Xf.a(zna, c(zna)), this.f3195b);
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, String str2, AbstractC2304uf ufVar, C0578Pa pa, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, C1015boa boa, Zna zna, String str, AbstractC2304uf ufVar) {
        a(aVar, boa, zna, str, null, ufVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, C1015boa boa, Zna zna, String str, String str2, AbstractC2304uf ufVar) {
        c cVar;
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f3194a;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C0745Vl.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C0745Vl.a("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f3194a;
            C0661Sf sf = new C0661Sf(ufVar);
            Activity activity = (Activity) b.c.b.a.c.b.Q(aVar);
            SERVER_PARAMETERS F = F(str);
            int i = 0;
            c[] cVarArr = {c.f252a, c.f253b, c.f254c, c.d, c.e, c.f};
            while (true) {
                if (i < 6) {
                    if (cVarArr[i].b() == boa.e && cVarArr[i].a() == boa.f3941b) {
                        cVar = cVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    cVar = new c(v.a(boa.e, boa.f3941b, boa.f3940a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(sf, activity, F, cVar, C0791Xf.a(zna, c(zna)), this.f3195b);
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, AbstractC1267fd fdVar, List<C1818nd> list) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(Zna zna, String str) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(Zna zna, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void b(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC0271Df bb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void c(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final C0194Ag da() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void destroy() {
        try {
            this.f3194a.destroy();
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final C0194Ag fa() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC2532xpa getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC2158sb ka() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC2580yf nb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void pause() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void resume() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final boolean sa() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void showInterstitial() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f3194a;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C0745Vl.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C0745Vl.a("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f3194a).showInterstitial();
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void x(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final a xb() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f3194a;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C0745Vl.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return b.c.b.a.c.b.a(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            C0745Vl.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final Bundle zztm() {
        return new Bundle();
    }
}
