package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.a.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

/* renamed from: com.google.android.gms.internal.ads.Sf  reason: case insensitive filesystem */
public final class C0661Sf<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> implements c, d {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2304uf f3110a;

    public C0661Sf(AbstractC2304uf ufVar) {
        this.f3110a = ufVar;
    }

    @Override // com.google.ads.mediation.c
    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        C0745Vl.a(sb.toString());
        C2392voa.a();
        if (!C0459Kl.b()) {
            C0745Vl.d("#008 Must be called on the main UI thread.", null);
            C0459Kl.f2428a.post(new RunnableC0739Vf(this, aVar));
            return;
        }
        try {
            this.f3110a.c(C0791Xf.a(aVar));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.d
    public final void a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        C0745Vl.a(sb.toString());
        C2392voa.a();
        if (!C0459Kl.b()) {
            C0745Vl.d("#008 Must be called on the main UI thread.", null);
            C0459Kl.f2428a.post(new RunnableC0765Wf(this, aVar));
            return;
        }
        try {
            this.f3110a.c(C0791Xf.a(aVar));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }
}
