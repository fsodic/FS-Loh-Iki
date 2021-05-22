package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.c.b;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.a;
import com.google.android.gms.common.internal.r;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Li  reason: case insensitive filesystem */
public final class C0482Li implements a {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0326Fi f2519a;

    public C0482Li(AbstractC0326Fi fi) {
        this.f2519a = fi;
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(Bundle bundle) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdMetadataChanged.");
        try {
            this.f2519a.a(bundle);
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onVideoCompleted.");
        try {
            this.f2519a.n(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdFailedToLoad.");
        try {
            this.f2519a.c(b.a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, com.google.android.gms.ads.g.b bVar) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onRewarded.");
        if (bVar != null) {
            try {
                this.f2519a.a(b.a(mediationRewardedVideoAdAdapter), new C0456Ki(bVar));
            } catch (RemoteException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        } else {
            this.f2519a.a(b.a(mediationRewardedVideoAdAdapter), new C0456Ki(BuildConfig.FLAVOR, 1));
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdOpened.");
        try {
            this.f2519a.j(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onVideoStarted.");
        try {
            this.f2519a.J(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLoaded.");
        try {
            this.f2519a.h(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLeftApplication.");
        try {
            this.f2519a.D(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onInitializationSucceeded.");
        try {
            this.f2519a.u(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdClosed.");
        try {
            this.f2519a.N(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }
}
