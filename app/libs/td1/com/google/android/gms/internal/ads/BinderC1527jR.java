package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.r;

/* renamed from: com.google.android.gms.internal.ads.jR  reason: case insensitive filesystem */
public final class BinderC1527jR extends AbstractBinderC2310ui {

    /* renamed from: a  reason: collision with root package name */
    private final VQ f4671a;

    /* renamed from: b  reason: collision with root package name */
    private final C2560yQ f4672b;

    /* renamed from: c  reason: collision with root package name */
    private final AR f4673c;
    private C2615zC d;
    private boolean e = false;

    public BinderC1527jR(VQ vq, C2560yQ yQVar, AR ar) {
        this.f4671a = vq;
        this.f4672b = yQVar;
        this.f4673c = ar;
    }

    private final synchronized boolean Wb() {
        return this.d != null && !this.d.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final boolean Aa() {
        C2615zC zCVar = this.d;
        return zCVar != null && zCVar.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void B(String str) {
        if (((Boolean) C2392voa.e().a(C2474x.va)).booleanValue()) {
            r.a("#008 Must be called on the main UI thread.: setCustomData");
            this.f4673c.f1512b = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized AbstractC2187spa C() {
        if (!((Boolean) C2392voa.e().a(C2474x.Ge)).booleanValue()) {
            return null;
        }
        if (this.d == null) {
            return null;
        }
        return this.d.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void C(a aVar) {
        Activity activity;
        r.a("showAd must be called on the main UI thread.");
        if (this.d != null) {
            if (aVar != null) {
                Object Q = b.Q(aVar);
                if (Q instanceof Activity) {
                    activity = (Activity) Q;
                    this.d.a(this.e, activity);
                }
            }
            activity = null;
            this.d.a(this.e, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void E(a aVar) {
        r.a("pause must be called on the main UI thread.");
        if (this.d != null) {
            this.d.c().b(aVar == null ? null : (Context) b.Q(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final Bundle I() {
        r.a("getAdMetadata can only be called from the UI thread.");
        C2615zC zCVar = this.d;
        return zCVar != null ? zCVar.g() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void O(a aVar) {
        r.a("destroy must be called on the main UI thread.");
        Context context = null;
        this.f4672b.a((com.google.android.gms.ads.g.a) null);
        if (this.d != null) {
            if (aVar != null) {
                context = (Context) b.Q(aVar);
            }
            this.d.c().d(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void Za() {
        C(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void a(C0300Ei ei) {
        r.a("loadAd must be called on the main UI thread.");
        if (!C2612z.a(ei.f1888b)) {
            if (Wb()) {
                if (!((Boolean) C2392voa.e().a(C2474x.rd)).booleanValue()) {
                    return;
                }
            }
            SQ sq = new SQ(null);
            this.d = null;
            this.f4671a.a(C2492xR.f5981a);
            this.f4671a.a(ei.f1887a, ei.f1888b, sq, new C1459iR(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final void a(Ooa ooa) {
        r.a("setAdMetadataListener can only be called from the UI thread.");
        if (ooa == null) {
            this.f4672b.a((com.google.android.gms.ads.g.a) null);
        } else {
            this.f4672b.a(new C1665lR(this, ooa));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final void a(AbstractC1966pi piVar) {
        r.a("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f4672b.a(piVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final void a(AbstractC2586yi yiVar) {
        r.a("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f4672b.a(yiVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void a(boolean z) {
        r.a("setImmersiveMode must be called on the main UI thread.");
        this.e = z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final boolean aa() {
        r.a("isLoaded must be called on the main UI thread.");
        return Wb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void c(String str) {
        r.a("setUserId must be called on the main UI thread.");
        this.f4673c.f1511a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final void destroy() {
        O(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized String k() {
        if (this.d == null || this.d.d() == null) {
            return null;
        }
        return this.d.d().k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final void pause() {
        E(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final void resume() {
        z(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final void u(String str) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2103ri
    public final synchronized void z(a aVar) {
        r.a("resume must be called on the main UI thread.");
        if (this.d != null) {
            this.d.c().c(aVar == null ? null : (Context) b.Q(aVar));
        }
    }
}
