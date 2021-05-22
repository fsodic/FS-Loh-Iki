package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.lK  reason: case insensitive filesystem */
public final class BinderC1658lK extends Koa {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4836a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2599yoa f4837b;

    /* renamed from: c  reason: collision with root package name */
    private final GR f4838c;
    private final AbstractC0951as d;
    private final ViewGroup e;

    public BinderC1658lK(Context context, AbstractC2599yoa yoa, GR gr, AbstractC0951as asVar) {
        this.f4836a = context;
        this.f4837b = yoa;
        this.f4838c = gr;
        this.d = asVar;
        FrameLayout frameLayout = new FrameLayout(this.f4836a);
        frameLayout.removeAllViews();
        frameLayout.addView(this.d.i(), q.e().b());
        frameLayout.setMinimumHeight(ib().f3942c);
        frameLayout.setMinimumWidth(ib().f);
        this.e = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final a Ab() {
        return b.a(this.e);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2187spa C() {
        return this.d.d();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Uoa Fa() {
        return this.f4838c.m;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Bundle I() {
        C0745Vl.c("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void Ib() {
        this.d.l();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2599yoa Qa() {
        return this.f4837b;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final String Z() {
        if (this.d.d() != null) {
            return this.d.d().k();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void _a() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Dpa dpa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Ooa ooa) {
        C0745Vl.c("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(S s) {
        C0745Vl.c("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Uoa uoa) {
        C0745Vl.c("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(_oa _oa) {
        C0745Vl.c("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC0942ama ama) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1015boa boa) {
        r.a("setAdSize must be called on the main UI thread.");
        AbstractC0951as asVar = this.d;
        if (asVar != null) {
            asVar.a(this.e, boa);
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1028c cVar) {
        C0745Vl.c("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC1344gh ghVar) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1496ioa ioa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC1619kh khVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2118rpa rpa) {
        C0745Vl.c("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2530xoa xoa) {
        C0745Vl.c("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2586yi yiVar) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean a(Zna zna) {
        C0745Vl.c("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void b(AbstractC2599yoa yoa) {
        C0745Vl.c("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void c(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void d(boolean z) {
        C0745Vl.c("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void destroy() {
        r.a("destroy must be called on the main UI thread.");
        this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void e(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2532xpa getVideoController() {
        return this.d.g();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final C1015boa ib() {
        r.a("getAdSize must be called on the main UI thread.");
        return JR.a(this.f4836a, Collections.singletonList(this.d.h()));
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final String k() {
        if (this.d.d() != null) {
            return this.d.d().k();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void pause() {
        r.a("destroy must be called on the main UI thread.");
        this.d.c().b(null);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean q() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void resume() {
        r.a("destroy must be called on the main UI thread.");
        this.d.c().c(null);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final String zb() {
        return this.f4838c.f;
    }
}
