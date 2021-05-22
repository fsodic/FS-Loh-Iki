package com.google.android.gms.internal.ads;

import a.b.a.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.common.util.o;

public final class zzapn implements MediationInterstitialAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Activity f6229a;

    /* renamed from: b  reason: collision with root package name */
    private m f6230b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f6231c;

    @Override // com.google.android.gms.ads.mediation.f
    public final void onDestroy() {
        C0745Vl.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onPause() {
        C0745Vl.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onResume() {
        C0745Vl.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, m mVar, Bundle bundle, e eVar, Bundle bundle2) {
        this.f6230b = mVar;
        if (this.f6230b == null) {
            C0745Vl.d("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            C0745Vl.d("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f6230b.a(this, 0);
        } else {
            if (!(o.b() && W.a(context))) {
                C0745Vl.d("Default browser does not support custom tabs. Bailing out.");
                this.f6230b.a(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                C0745Vl.d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f6230b.a(this, 0);
                return;
            }
            this.f6229a = (Activity) context;
            this.f6231c = Uri.parse(string);
            this.f6230b.c(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        a a2 = new a.C0001a().a();
        a2.f19a.setData(this.f6231c);
        C2452wk.f5921a.post(new RunnableC0272Dg(this, new AdOverlayInfoParcel(new d(a2.f19a), null, new C0220Bg(this), null, new C0823Yl(0, 0, false))));
        q.g().e();
    }
}
