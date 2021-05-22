package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.fr  reason: case insensitive filesystem */
public final class C1294fr implements AbstractC1436hv {

    /* renamed from: a  reason: collision with root package name */
    private final SR f4347a;

    public C1294fr(SR sr) {
        this.f4347a = sr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void b(Context context) {
        try {
            this.f4347a.a();
        } catch (MR e) {
            C0745Vl.c("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void c(Context context) {
        try {
            this.f4347a.f();
            if (context != null) {
                this.f4347a.a(context);
            }
        } catch (MR e) {
            C0745Vl.c("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void d(Context context) {
        try {
            this.f4347a.e();
        } catch (MR e) {
            C0745Vl.c("Cannot invoke onPause for the mediation adapter.", e);
        }
    }
}
