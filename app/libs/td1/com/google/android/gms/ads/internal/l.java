package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.AbstractC0942ama;
import com.google.android.gms.internal.ads.AbstractC1344gh;
import com.google.android.gms.internal.ads.AbstractC1619kh;
import com.google.android.gms.internal.ads.AbstractC2118rpa;
import com.google.android.gms.internal.ads.AbstractC2187spa;
import com.google.android.gms.internal.ads.AbstractC2530xoa;
import com.google.android.gms.internal.ads.AbstractC2532xpa;
import com.google.android.gms.internal.ads.AbstractC2586yi;
import com.google.android.gms.internal.ads.AbstractC2599yoa;
import com.google.android.gms.internal.ads.C0459Kl;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C0823Yl;
import com.google.android.gms.internal.ads.C0875_l;
import com.google.android.gms.internal.ads.C1015boa;
import com.google.android.gms.internal.ads.C1028c;
import com.google.android.gms.internal.ads.C1330ga;
import com.google.android.gms.internal.ads.C1496ioa;
import com.google.android.gms.internal.ads.C1955pca;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.Dpa;
import com.google.android.gms.internal.ads.Koa;
import com.google.android.gms.internal.ads.Ooa;
import com.google.android.gms.internal.ads.Rba;
import com.google.android.gms.internal.ads.S;
import com.google.android.gms.internal.ads.Uoa;
import com.google.android.gms.internal.ads.Zna;
import com.google.android.gms.internal.ads._oa;
import java.util.Map;
import java.util.concurrent.Future;

public final class l extends Koa {

    /* renamed from: a  reason: collision with root package name */
    private final C0823Yl f1088a;

    /* renamed from: b  reason: collision with root package name */
    private final C1015boa f1089b;

    /* renamed from: c  reason: collision with root package name */
    private final Future<C1955pca> f1090c = C0875_l.f3755a.a(new m(this));
    private final Context d;
    private final o e;
    private WebView f = new WebView(this.d);
    private AbstractC2599yoa g;
    private C1955pca h;
    private AsyncTask<Void, Void, String> i;

    public l(Context context, C1015boa boa, String str, C0823Yl yl) {
        this.d = context;
        this.f1088a = yl;
        this.f1089b = boa;
        this.e = new o(context, str);
        x(0);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.setWebViewClient(new k(this));
        this.f.setOnTouchListener(new n(this));
    }

    /* access modifiers changed from: private */
    public final String G(String str) {
        if (this.h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.h.a(parse, this.d, null, null);
        } catch (Rba e2) {
            C0745Vl.c("Unable to process ad data", e2);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    public final void H(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.d.startActivity(intent);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final a Ab() {
        r.a("getAdFrame must be called on the main UI thread.");
        return b.a(this.f);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2187spa C() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final int F(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C2392voa.a();
            return C0459Kl.b(this.d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Uoa Fa() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Bundle I() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void Ib() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2599yoa Qa() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* access modifiers changed from: package-private */
    public final String Wb() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(C1330ga.d.a());
        builder.appendQueryParameter("query", this.e.a());
        builder.appendQueryParameter("pubId", this.e.c());
        Map<String, String> d2 = this.e.d();
        for (String str : d2.keySet()) {
            builder.appendQueryParameter(str, d2.get(str));
        }
        Uri build = builder.build();
        C1955pca pca = this.h;
        if (pca != null) {
            try {
                build = pca.a(build, this.d);
            } catch (Rba e2) {
                C0745Vl.c("Unable to process ad data", e2);
            }
        }
        String Xb = Xb();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(Xb).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(Xb);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String Xb() {
        String b2 = this.e.b();
        if (TextUtils.isEmpty(b2)) {
            b2 = "www.google.com";
        }
        String a2 = C1330ga.d.a();
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 8 + String.valueOf(a2).length());
        sb.append("https://");
        sb.append(b2);
        sb.append(a2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final String Z() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void _a() {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Dpa dpa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Ooa ooa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(S s) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Uoa uoa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(_oa _oa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC0942ama ama) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1015boa boa) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1028c cVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC1344gh ghVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1496ioa ioa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC1619kh khVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2118rpa rpa) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2530xoa xoa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2586yi yiVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean a(Zna zna) {
        r.a(this.f, "This Search Ad has already been torn down");
        this.e.a(zna, this.f1088a);
        this.i = new p(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void b(AbstractC2599yoa yoa) {
        this.g = yoa;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void c(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void d(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void destroy() {
        r.a("destroy must be called on the main UI thread.");
        this.i.cancel(true);
        this.f1090c.cancel(true);
        this.f.destroy();
        this.f = null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void e(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2532xpa getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final C1015boa ib() {
        return this.f1089b;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final String k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void pause() {
        r.a("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean q() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void resume() {
        r.a("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final void x(int i2) {
        if (this.f != null) {
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final String zb() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }
}
