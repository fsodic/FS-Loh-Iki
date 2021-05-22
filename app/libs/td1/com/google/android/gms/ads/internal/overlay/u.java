package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b.c.b.a.c.a;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.AbstractBinderC0766Wg;
import com.google.android.gms.internal.ads.Ona;

public final class u extends AbstractBinderC0766Wg {

    /* renamed from: a  reason: collision with root package name */
    private AdOverlayInfoParcel f1119a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f1120b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1121c = false;
    private boolean d = false;

    public u(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f1119a = adOverlayInfoParcel;
        this.f1120b = activity;
    }

    private final synchronized void Wb() {
        if (!this.d) {
            if (this.f1119a.f1098c != null) {
                this.f1119a.f1098c.J();
            }
            this.d = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final boolean Fb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void G(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void Oa() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void g(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f1121c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void ia() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void j(Bundle bundle) {
        o oVar;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1119a;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                Ona ona = adOverlayInfoParcel.f1097b;
                if (ona != null) {
                    ona.e();
                }
                if (!(this.f1120b.getIntent() == null || !this.f1120b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (oVar = this.f1119a.f1098c) == null)) {
                    oVar.I();
                }
            }
            q.a();
            Activity activity = this.f1120b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f1119a;
            if (!b.a(activity, adOverlayInfoParcel2.f1096a, adOverlayInfoParcel2.i)) {
                this.f1120b.finish();
                return;
            }
            return;
        }
        this.f1120b.finish();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void jb() {
        if (this.f1120b.isFinishing()) {
            Wb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onDestroy() {
        if (this.f1120b.isFinishing()) {
            Wb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onPause() {
        o oVar = this.f1119a.f1098c;
        if (oVar != null) {
            oVar.onPause();
        }
        if (this.f1120b.isFinishing()) {
            Wb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onResume() {
        if (this.f1121c) {
            this.f1120b.finish();
            return;
        }
        this.f1121c = true;
        o oVar = this.f1119a.f1098c;
        if (oVar != null) {
            oVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void rb() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void wb() {
    }
}
