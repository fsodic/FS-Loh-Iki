package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.s;

/* renamed from: com.google.android.gms.internal.ads.Mf  reason: case insensitive filesystem */
public final class C0505Mf implements h, m, o {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2304uf f2604a;

    /* renamed from: b  reason: collision with root package name */
    private r f2605b;

    /* renamed from: c  reason: collision with root package name */
    private y f2606c;
    private i d;

    public C0505Mf(AbstractC2304uf ufVar) {
        this.f2604a = ufVar;
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter, y yVar, r rVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            s sVar = new s();
            sVar.a(new BinderC0427Jf());
            if (yVar != null && yVar.r()) {
                yVar.a(sVar);
            }
            if (rVar != null && rVar.f()) {
                rVar.a(sVar);
            }
        }
    }

    public final r a() {
        return this.f2605b;
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdClosed.");
        try {
            this.f2604a.j();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void a(MediationBannerAdapter mediationBannerAdapter, int i) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        C0745Vl.a(sb.toString());
        try {
            this.f2604a.c(i);
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAppEvent.");
        try {
            this.f2604a.a(str, str2);
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.m
    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLeftApplication.");
        try {
            this.f2604a.i();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.m
    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C0745Vl.a(sb.toString());
        try {
            this.f2604a.c(i);
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdOpened.");
        try {
            this.f2604a.h();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void a(MediationNativeAdapter mediationNativeAdapter, int i) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C0745Vl.a(sb.toString());
        try {
            this.f2604a.c(i);
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void a(MediationNativeAdapter mediationNativeAdapter, i iVar) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(iVar.J());
        C0745Vl.a(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.d = iVar;
        try {
            this.f2604a.a();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void a(MediationNativeAdapter mediationNativeAdapter, i iVar, String str) {
        if (iVar instanceof C2227tb) {
            try {
                this.f2604a.a(((C2227tb) iVar).a(), str);
            } catch (RemoteException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        } else {
            C0745Vl.d("Unexpected native custom template ad type.");
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void a(MediationNativeAdapter mediationNativeAdapter, r rVar) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLoaded.");
        this.f2605b = rVar;
        this.f2606c = null;
        a(mediationNativeAdapter, this.f2606c, this.f2605b);
        try {
            this.f2604a.a();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void a(MediationNativeAdapter mediationNativeAdapter, y yVar) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLoaded.");
        this.f2606c = yVar;
        this.f2605b = null;
        a(mediationNativeAdapter, this.f2606c, this.f2605b);
        try {
            this.f2604a.a();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    public final y b() {
        return this.f2606c;
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void b(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdClicked.");
        try {
            this.f2604a.e();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.m
    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdClicked.");
        try {
            this.f2604a.e();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdClosed.");
        try {
            this.f2604a.j();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    public final i c() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void c(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLoaded.");
        try {
            this.f2604a.a();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.m
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLoaded.");
        try {
            this.f2604a.a();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void c(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        r rVar = this.f2605b;
        y yVar = this.f2606c;
        if (this.d == null) {
            if (rVar == null && yVar == null) {
                C0745Vl.d("#007 Could not call remote method.", null);
                return;
            } else if (yVar != null && !yVar.l()) {
                C0745Vl.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (rVar != null && !rVar.c()) {
                C0745Vl.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        C0745Vl.a("Adapter called onAdClicked.");
        try {
            this.f2604a.e();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void d(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLeftApplication.");
        try {
            this.f2604a.i();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.m
    public final void d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdClosed.");
        try {
            this.f2604a.j();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void d(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdLeftApplication.");
        try {
            this.f2604a.i();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdOpened.");
        try {
            this.f2604a.h();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.m
    public final void e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        C0745Vl.a("Adapter called onAdOpened.");
        try {
            this.f2604a.h();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.o
    public final void e(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.r.a("#008 Must be called on the main UI thread.");
        r rVar = this.f2605b;
        y yVar = this.f2606c;
        if (this.d == null) {
            if (rVar == null && yVar == null) {
                C0745Vl.d("#007 Could not call remote method.", null);
                return;
            } else if (yVar != null && !yVar.m()) {
                C0745Vl.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (rVar != null && !rVar.d()) {
                C0745Vl.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        C0745Vl.a("Adapter called onAdImpression.");
        try {
            this.f2604a.b();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }
}
