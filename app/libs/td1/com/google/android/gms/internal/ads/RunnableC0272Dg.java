package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Dg  reason: case insensitive filesystem */
final class RunnableC0272Dg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AdOverlayInfoParcel f1792a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzapn f1793b;

    RunnableC0272Dg(zzapn zzapn, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f1793b = zzapn;
        this.f1792a = adOverlayInfoParcel;
    }

    public final void run() {
        q.b();
        n.a(this.f1793b.f6229a, this.f1792a, true);
    }
}
