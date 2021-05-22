package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.d;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C0745Vl;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<c, e>, MediationInterstitialAdapter<c, e> {

    /* renamed from: a  reason: collision with root package name */
    private View f1001a;

    /* renamed from: b  reason: collision with root package name */
    private CustomEventBanner f1002b;

    /* renamed from: c  reason: collision with root package name */
    private CustomEventInterstitial f1003c;

    /* access modifiers changed from: package-private */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f1004a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.ads.mediation.c f1005b;

        public a(CustomEventAdapter customEventAdapter, com.google.ads.mediation.c cVar) {
            this.f1004a = customEventAdapter;
            this.f1005b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f1006a;

        /* renamed from: b  reason: collision with root package name */
        private final d f1007b;

        public b(CustomEventAdapter customEventAdapter, d dVar) {
            this.f1006a = customEventAdapter;
            this.f1007b = dVar;
        }
    }

    private static <T> T a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C0745Vl.d(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.b
    public final void destroy() {
        CustomEventBanner customEventBanner = this.f1002b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f1003c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.b
    public final Class<c> getAdditionalParametersType() {
        return c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f1001a;
    }

    @Override // com.google.ads.mediation.b
    public final Class<e> getServerParametersType() {
        return e.class;
    }

    public final void requestBannerAd(com.google.ads.mediation.c cVar, Activity activity, e eVar, b.c.a.c cVar2, com.google.ads.mediation.a aVar, c cVar3) {
        this.f1002b = (CustomEventBanner) a(eVar.f1010b);
        if (this.f1002b == null) {
            cVar.a(this, b.c.a.a.INTERNAL_ERROR);
        } else {
            this.f1002b.requestBannerAd(new a(this, cVar), activity, eVar.f1009a, eVar.f1011c, cVar2, aVar, cVar3 == null ? null : cVar3.a(eVar.f1009a));
        }
    }

    public final void requestInterstitialAd(d dVar, Activity activity, e eVar, com.google.ads.mediation.a aVar, c cVar) {
        this.f1003c = (CustomEventInterstitial) a(eVar.f1010b);
        if (this.f1003c == null) {
            dVar.a(this, b.c.a.a.INTERNAL_ERROR);
        } else {
            this.f1003c.requestInterstitialAd(new b(this, dVar), activity, eVar.f1009a, eVar.f1011c, aVar, cVar == null ? null : cVar.a(eVar.f1009a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f1003c.showInterstitial();
    }
}
