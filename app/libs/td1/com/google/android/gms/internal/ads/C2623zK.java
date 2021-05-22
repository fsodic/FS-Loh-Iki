package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zK  reason: case insensitive filesystem */
public final class C2623zK implements AbstractC0520Mu, AbstractC0650Ru, AbstractC1229ev, AbstractC0261Cv, Ona {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC2599yoa f6170a;

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final synchronized void a() {
        if (this.f6170a != null) {
            try {
                this.f6170a.a();
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void a(AbstractC1897oi oiVar, String str, String str2) {
    }

    public final synchronized void a(AbstractC2599yoa yoa) {
        this.f6170a = yoa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final synchronized void b() {
        if (this.f6170a != null) {
            try {
                this.f6170a.b();
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAdImpression.", e);
            }
        }
    }

    public final synchronized AbstractC2599yoa c() {
        return this.f6170a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final synchronized void c(int i) {
        if (this.f6170a != null) {
            try {
                this.f6170a.c(i);
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAdFailedToLoad.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ona
    public final synchronized void e() {
        if (this.f6170a != null) {
            try {
                this.f6170a.e();
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final synchronized void h() {
        if (this.f6170a != null) {
            try {
                this.f6170a.h();
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAdOpened.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final synchronized void i() {
        if (this.f6170a != null) {
            try {
                this.f6170a.i();
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final synchronized void j() {
        if (this.f6170a != null) {
            try {
                this.f6170a.j();
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAdClosed.", e);
            }
        }
    }
}
