package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.p;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.cp  reason: case insensitive filesystem */
public final class C1085cp extends C1980pp implements AbstractC0774Wo {
    private boolean A;
    private View.OnAttachStateChangeListener B;
    protected AbstractC1564jo d;
    private final C0581Pd<AbstractC1564jo> e = new C0581Pd<>();
    private final Object f = new Object();
    private Ona g;
    private o h;
    private AbstractC0878_o i;
    private AbstractC0852Zo j;
    private AbstractC1472ic k;
    private AbstractC1609kc l;
    private AbstractC1016bp m;
    private boolean n = false;
    private volatile boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private t s;
    private C0584Pg t;
    private c u;
    private C0376Hg v;
    private AbstractC1761mj w;
    private boolean x;
    private boolean y;
    private int z;

    /* access modifiers changed from: private */
    public final void a(View view, AbstractC1761mj mjVar, int i2) {
        if (mjVar.c() && i2 > 0) {
            mjVar.a(view);
            if (mjVar.c()) {
                C2452wk.f5921a.postDelayed(new RunnableC1222ep(this, view, mjVar, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        d dVar;
        C0376Hg hg = this.v;
        boolean z2 = false;
        boolean a2 = hg != null ? hg.a() : false;
        q.b();
        Context context = this.d.getContext();
        if (!a2) {
            z2 = true;
        }
        n.a(context, adOverlayInfoParcel, z2);
        if (this.w != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && (dVar = adOverlayInfoParcel.f1096a) != null) {
                str = dVar.f1103b;
            }
            this.w.a(str);
        }
    }

    private final WebResourceResponse e(C1911op opVar) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(opVar.f5174a);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : opVar.d.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    q.c().a(this.d.getContext(), this.d.q().f3587a, false, httpURLConnection);
                    C0563Ol ol = new C0563Ol();
                    ol.a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    ol.a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        q.c();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        } else if (headerField.startsWith("tel:")) {
                            return null;
                        } else {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                C0745Vl.d("Protocol is null");
                                return p();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                C0745Vl.a(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                C0745Vl.d(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return p();
                            }
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        q.c();
        return C2452wk.a(httpURLConnection);
    }

    private final void n() {
        if (this.B != null) {
            this.d.getView().removeOnAttachStateChangeListener(this.B);
        }
    }

    private final void o() {
        if (this.i != null && ((this.x && this.z <= 0) || this.y)) {
            this.i.a(!this.y);
            this.i = null;
        }
        this.d.G();
    }

    private static WebResourceResponse p() {
        if (((Boolean) C2392voa.e().a(C2474x.ja)).booleanValue()) {
            return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a() {
        this.z--;
        o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(int i2, int i3) {
        C0376Hg hg = this.v;
        if (hg != null) {
            hg.a(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(int i2, int i3, boolean z2) {
        this.t.a(i2, i3);
        C0376Hg hg = this.v;
        if (hg != null) {
            hg.a(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(Uri uri) {
        this.e.b(uri);
    }

    public final void a(d dVar) {
        boolean k2 = this.d.k();
        a(new AdOverlayInfoParcel(dVar, (!k2 || this.d.H().e()) ? this.g : null, k2 ? null : this.h, this.s, this.d.q()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(Ona ona, AbstractC1472ic icVar, o oVar, AbstractC1609kc kcVar, t tVar, boolean z2, AbstractC0346Gc gc, c cVar, AbstractC0636Rg rg, AbstractC1761mj mjVar) {
        if (cVar == null) {
            cVar = new c(this.d.getContext(), mjVar, null);
        }
        this.v = new C0376Hg(this.d, rg);
        this.w = mjVar;
        if (((Boolean) C2392voa.e().a(C2474x.ua)).booleanValue()) {
            a("/adMetadata", new C1540jc(icVar));
        }
        a("/appEvent", new C1678lc(kcVar));
        a("/backButton", C1747mc.k);
        a("/refresh", C1747mc.l);
        a("/canOpenApp", C1747mc.f4964b);
        a("/canOpenURLs", C1747mc.f4963a);
        a("/canOpenIntents", C1747mc.f4965c);
        a("/click", C1747mc.d);
        a("/close", C1747mc.e);
        a("/customClose", C1747mc.f);
        a("/instrument", C1747mc.o);
        a("/delayPageLoaded", C1747mc.q);
        a("/delayPageClosed", C1747mc.r);
        a("/getLocationInfo", C1747mc.s);
        a("/httpTrack", C1747mc.g);
        a("/log", C1747mc.h);
        a("/mraid", new C0398Ic(cVar, this.v, rg));
        a("/mraidLoaded", this.t);
        a("/open", new C0372Hc(cVar, this.v));
        a("/precache", new C0695Tn());
        a("/touch", C1747mc.j);
        a("/video", C1747mc.m);
        a("/videoMeta", C1747mc.n);
        if (q.A().a(this.d.getContext())) {
            a("/logScionEvent", new C0320Fc(this.d.getContext()));
        }
        this.g = ona;
        this.h = oVar;
        this.k = icVar;
        this.l = kcVar;
        this.s = tVar;
        this.u = cVar;
        this.n = z2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(AbstractC0852Zo zo) {
        this.j = zo;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(AbstractC0878_o _oVar) {
        this.i = _oVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(AbstractC1564jo joVar, boolean z2) {
        C0584Pg pg = new C0584Pg(joVar, joVar.u(), new C1165e(joVar.getContext()));
        this.d = joVar;
        this.o = z2;
        this.t = pg;
        this.v = null;
        this.e.a(joVar);
    }

    @Override // com.google.android.gms.internal.ads.C1980pp
    public final void a(C1911op opVar) {
        this.x = true;
        AbstractC0852Zo zo = this.j;
        if (zo != null) {
            zo.a();
            this.j = null;
        }
        o();
    }

    public final void a(String str, p<AbstractC0268Dc<? super AbstractC1564jo>> pVar) {
        this.e.a(str, pVar);
    }

    public final void a(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        this.e.a(str, dc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(boolean z2) {
        synchronized (this.f) {
            this.p = true;
        }
    }

    public final void a(boolean z2, int i2) {
        Ona ona = (!this.d.k() || this.d.H().e()) ? this.g : null;
        o oVar = this.h;
        t tVar = this.s;
        AbstractC1564jo joVar = this.d;
        a(new AdOverlayInfoParcel(ona, oVar, tVar, joVar, z2, i2, joVar.q()));
    }

    public final void a(boolean z2, int i2, String str) {
        boolean k2 = this.d.k();
        Ona ona = (!k2 || this.d.H().e()) ? this.g : null;
        C1360gp gpVar = k2 ? null : new C1360gp(this.d, this.h);
        AbstractC1472ic icVar = this.k;
        AbstractC1609kc kcVar = this.l;
        t tVar = this.s;
        AbstractC1564jo joVar = this.d;
        a(new AdOverlayInfoParcel(ona, gpVar, icVar, kcVar, tVar, joVar, z2, i2, str, joVar.q()));
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean k2 = this.d.k();
        Ona ona = (!k2 || this.d.H().e()) ? this.g : null;
        C1360gp gpVar = k2 ? null : new C1360gp(this.d, this.h);
        AbstractC1472ic icVar = this.k;
        AbstractC1609kc kcVar = this.l;
        t tVar = this.s;
        AbstractC1564jo joVar = this.d;
        a(new AdOverlayInfoParcel(ona, gpVar, icVar, kcVar, tVar, joVar, z2, i2, str, str2, joVar.q()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void b() {
        this.y = true;
        o();
    }

    @Override // com.google.android.gms.internal.ads.C1980pp
    public final void b(C1911op opVar) {
        this.e.a(opVar.f5175b);
    }

    public final void b(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        this.e.b(str, dc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void b(boolean z2) {
        synchronized (this.f) {
            this.q = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void c() {
        AbstractC1761mj mjVar = this.w;
        if (mjVar != null) {
            WebView webView = this.d.getWebView();
            if (a.d.c.c.c(webView)) {
                a(webView, mjVar, 10);
                return;
            }
            n();
            this.B = new View$OnAttachStateChangeListenerC1429hp(this, mjVar);
            this.d.getView().addOnAttachStateChangeListener(this.B);
        }
    }

    public final void c(boolean z2) {
        this.n = z2;
    }

    @Override // com.google.android.gms.internal.ads.C1980pp
    public final boolean c(C1911op opVar) {
        String valueOf = String.valueOf(opVar.f5174a);
        C1763mk.f(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = opVar.f5175b;
        if (this.e.a(uri)) {
            return true;
        }
        if (this.n) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                Ona ona = this.g;
                if (ona != null) {
                    ona.e();
                    AbstractC1761mj mjVar = this.w;
                    if (mjVar != null) {
                        mjVar.a(opVar.f5174a);
                    }
                    this.g = null;
                }
                return false;
            }
        }
        if (!this.d.getWebView().willNotDraw()) {
            try {
                C1955pca f2 = this.d.f();
                if (f2 != null && f2.a(uri)) {
                    uri = f2.a(uri, this.d.getContext(), this.d.getView(), this.d.v());
                }
            } catch (Rba unused) {
                String valueOf2 = String.valueOf(opVar.f5174a);
                C0745Vl.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            c cVar = this.u;
            if (cVar == null || cVar.b()) {
                a(new d("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.u.a(opVar.f5174a);
            }
        } else {
            String valueOf3 = String.valueOf(opVar.f5174a);
            C0745Vl.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C1980pp
    public final WebResourceResponse d(C1911op opVar) {
        WebResourceResponse webResourceResponse;
        C1837nma a2;
        AbstractC1761mj mjVar = this.w;
        if (mjVar != null) {
            mjVar.a(opVar.f5174a, opVar.d, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(opVar.f5174a).getName())) {
            webResourceResponse = null;
        } else {
            e();
            String str = (String) C2392voa.e().a(this.d.H().e() ? C2474x.H : this.d.k() ? C2474x.G : C2474x.F);
            q.c();
            webResourceResponse = C2452wk.c(this.d.getContext(), this.d.q().f3587a, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!C0431Jj.a(opVar.f5174a, this.d.getContext(), this.A).equals(opVar.f5174a)) {
                return e(opVar);
            }
            C1906oma a3 = C1906oma.a(opVar.f5174a);
            if (a3 != null && (a2 = q.i().a(a3)) != null && a2.L()) {
                return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, a2.M());
            }
            if (!C0563Ol.a() || !C1674la.f4862b.a().booleanValue()) {
                return null;
            }
            return e(opVar);
        } catch (Exception | NoClassDefFoundError e2) {
            q.g().a(e2, "AdWebViewClient.interceptRequest");
            return p();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final c d() {
        return this.u;
    }

    public final void d(boolean z2) {
        this.A = z2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void e() {
        synchronized (this.f) {
            this.n = false;
            this.o = true;
            C0875_l.e.execute(new RunnableC1291fp(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void f() {
        synchronized (this.f) {
            this.r = true;
        }
        this.z++;
        o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final boolean g() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final AbstractC1761mj h() {
        return this.w;
    }

    public final void i() {
        AbstractC1761mj mjVar = this.w;
        if (mjVar != null) {
            mjVar.a();
            this.w = null;
        }
        n();
        this.e.b();
        this.e.a((AbstractC1564jo) null);
        synchronized (this.f) {
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.s = null;
            this.m = null;
            if (this.v != null) {
                this.v.a(true);
                this.v = null;
            }
        }
    }

    public final boolean j() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.p;
        }
        return z2;
    }

    public final boolean k() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.q;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener l() {
        synchronized (this.f) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener m() {
        synchronized (this.f) {
        }
        return null;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC1286fma s2 = this.d.s();
        if (s2 != null && webView == s2.getWebView()) {
            s2.a(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.d.a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
