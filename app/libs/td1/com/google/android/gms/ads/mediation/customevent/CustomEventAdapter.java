package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C0745Vl;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: a  reason: collision with root package name */
    private View f1130a;

    /* renamed from: b  reason: collision with root package name */
    private CustomEventBanner f1131b;

    /* renamed from: c  reason: collision with root package name */
    private CustomEventInterstitial f1132c;
    private CustomEventNative d;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f1133a;

        /* renamed from: b  reason: collision with root package name */
        private final m f1134b;

        public a(CustomEventAdapter customEventAdapter, m mVar) {
            this.f1133a = customEventAdapter;
            this.f1134b = mVar;
        }
    }

    static final class b implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f1136a;

        /* renamed from: b  reason: collision with root package name */
        private final h f1137b;

        public b(CustomEventAdapter customEventAdapter, h hVar) {
            this.f1136a = customEventAdapter;
            this.f1137b = hVar;
        }
    }

    static class c implements f {

        /* renamed from: a  reason: collision with root package name */
        private final CustomEventAdapter f1138a;

        /* renamed from: b  reason: collision with root package name */
        private final o f1139b;

        public c(CustomEventAdapter customEventAdapter, o oVar) {
            this.f1138a = customEventAdapter;
            this.f1139b = oVar;
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

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f1130a;
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.f1131b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f1132c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onPause() {
        CustomEventBanner customEventBanner = this.f1131b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f1132c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onResume() {
        CustomEventBanner customEventBanner = this.f1131b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f1132c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(Context context, h hVar, Bundle bundle, f fVar, e eVar, Bundle bundle2) {
        this.f1131b = (CustomEventBanner) a(bundle.getString("class_name"));
        if (this.f1131b == null) {
            hVar.a(this, 0);
        } else {
            this.f1131b.requestBannerAd(context, new b(this, hVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), fVar, eVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, m mVar, Bundle bundle, e eVar, Bundle bundle2) {
        this.f1132c = (CustomEventInterstitial) a(bundle.getString("class_name"));
        if (this.f1132c == null) {
            mVar.a(this, 0);
        } else {
            this.f1132c.requestInterstitialAd(context, new a(this, mVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), eVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void requestNativeAd(Context context, o oVar, Bundle bundle, u uVar, Bundle bundle2) {
        this.d = (CustomEventNative) a(bundle.getString("class_name"));
        if (this.d == null) {
            oVar.a(this, 0);
        } else {
            this.d.requestNativeAd(context, new c(this, oVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), uVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f1132c.showInterstitial();
    }
}
