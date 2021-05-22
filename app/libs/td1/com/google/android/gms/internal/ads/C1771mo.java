package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.mo  reason: case insensitive filesystem */
public class C1771mo extends WebViewClient implements AbstractC0774Wo {

    /* renamed from: a  reason: collision with root package name */
    protected AbstractC1564jo f4991a;

    /* renamed from: b  reason: collision with root package name */
    private final Dma f4992b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, List<AbstractC0268Dc<? super AbstractC1564jo>>> f4993c;
    private final Object d;
    private Ona e;
    private o f;
    private AbstractC0878_o g;
    private AbstractC0852Zo h;
    private AbstractC1472ic i;
    private AbstractC1609kc j;
    private AbstractC1016bp k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private t q;
    private final C0584Pg r;
    private c s;
    private C0376Hg t;
    protected AbstractC1761mj u;
    private boolean v;
    private boolean w;
    private int x;
    private boolean y;
    private View.OnAttachStateChangeListener z;

    public C1771mo(AbstractC1564jo joVar, Dma dma, boolean z2) {
        this(joVar, dma, z2, new C0584Pg(joVar, joVar.u(), new C1165e(joVar.getContext())), null);
    }

    private C1771mo(AbstractC1564jo joVar, Dma dma, boolean z2, C0584Pg pg, C0376Hg hg) {
        this.f4993c = new HashMap<>();
        this.d = new Object();
        this.l = false;
        this.f4992b = dma;
        this.f4991a = joVar;
        this.m = z2;
        this.r = pg;
        this.t = null;
    }

    /* access modifiers changed from: private */
    public final void a(View view, AbstractC1761mj mjVar, int i2) {
        if (mjVar.c() && i2 > 0) {
            mjVar.a(view);
            if (mjVar.c()) {
                C2452wk.f5921a.postDelayed(new RunnableC1840no(this, view, mjVar, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        d dVar;
        C0376Hg hg = this.t;
        boolean z2 = false;
        boolean a2 = hg != null ? hg.a() : false;
        q.b();
        Context context = this.f4991a.getContext();
        if (!a2) {
            z2 = true;
        }
        n.a(context, adOverlayInfoParcel, z2);
        if (this.u != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && (dVar = adOverlayInfoParcel.f1096a) != null) {
                str = dVar.f1103b;
            }
            this.u.a(str);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Map<String, String> map, List<AbstractC0268Dc<? super AbstractC1564jo>> list, String str) {
        if (C0745Vl.a(2)) {
            String valueOf = String.valueOf(str);
            C1763mk.f(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                C1763mk.f(sb.toString());
            }
        }
        for (AbstractC0268Dc<? super AbstractC1564jo> dc : list) {
            dc.a(this.f4991a, map);
        }
    }

    private final WebResourceResponse b(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    q.c().a(this.f4991a.getContext(), this.f4991a.q().f3587a, false, httpURLConnection);
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
        if (this.z != null) {
            this.f4991a.getView().removeOnAttachStateChangeListener(this.z);
        }
    }

    private final void o() {
        if (this.g != null && ((this.v && this.x <= 0) || this.w)) {
            this.g.a(!this.w);
            this.g = null;
        }
        this.f4991a.G();
    }

    private static WebResourceResponse p() {
        if (((Boolean) C2392voa.e().a(C2474x.ja)).booleanValue()) {
            return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(String str, Map<String, String> map) {
        C1837nma a2;
        try {
            String a3 = C0431Jj.a(str, this.f4991a.getContext(), this.y);
            if (!a3.equals(str)) {
                return b(a3, map);
            }
            C1906oma a4 = C1906oma.a(str);
            if (a4 != null && (a2 = q.i().a(a4)) != null && a2.L()) {
                return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, a2.M());
            }
            if (!C0563Ol.a() || !C1674la.f4862b.a().booleanValue()) {
                return null;
            }
            return b(str, map);
        } catch (Exception | NoClassDefFoundError e2) {
            q.g().a(e2, "AdWebViewClient.interceptRequest");
            return p();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a() {
        this.x--;
        o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(int i2, int i3) {
        C0376Hg hg = this.t;
        if (hg != null) {
            hg.a(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(int i2, int i3, boolean z2) {
        this.r.a(i2, i3);
        C0376Hg hg = this.t;
        if (hg != null) {
            hg.a(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(Uri uri) {
        String path = uri.getPath();
        List<AbstractC0268Dc<? super AbstractC1564jo>> list = this.f4993c.get(path);
        if (list != null) {
            if (!((Boolean) C2392voa.e().a(C2474x.Bd)).booleanValue()) {
                q.c();
                a(C2452wk.b(uri), list, path);
                return;
            }
            JW.a(q.c().a(uri), new C1978po(this, list, path), C0875_l.f);
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(valueOf);
        C1763mk.f(sb.toString());
        if (((Boolean) C2392voa.e().a(C2474x.Fe)).booleanValue() && q.g().c() != null) {
            C0875_l.f3755a.execute(new RunnableC1909oo(path));
        }
    }

    public final void a(d dVar) {
        boolean k2 = this.f4991a.k();
        a(new AdOverlayInfoParcel(dVar, (!k2 || this.f4991a.H().e()) ? this.e : null, k2 ? null : this.f, this.q, this.f4991a.q()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(Ona ona, AbstractC1472ic icVar, o oVar, AbstractC1609kc kcVar, t tVar, boolean z2, AbstractC0346Gc gc, c cVar, AbstractC0636Rg rg, AbstractC1761mj mjVar) {
        if (cVar == null) {
            cVar = new c(this.f4991a.getContext(), mjVar, null);
        }
        this.t = new C0376Hg(this.f4991a, rg);
        this.u = mjVar;
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
        a("/mraid", new C0398Ic(cVar, this.t, rg));
        a("/mraidLoaded", this.r);
        a("/open", new C0372Hc(cVar, this.t));
        a("/precache", new C0695Tn());
        a("/touch", C1747mc.j);
        a("/video", C1747mc.m);
        a("/videoMeta", C1747mc.n);
        if (q.A().a(this.f4991a.getContext())) {
            a("/logScionEvent", new C0320Fc(this.f4991a.getContext()));
        }
        this.e = ona;
        this.f = oVar;
        this.i = icVar;
        this.j = kcVar;
        this.q = tVar;
        this.s = cVar;
        this.l = z2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(AbstractC0852Zo zo) {
        this.h = zo;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(AbstractC0878_o _oVar) {
        this.g = _oVar;
    }

    public final void a(String str, p<AbstractC0268Dc<? super AbstractC1564jo>> pVar) {
        synchronized (this.d) {
            List<AbstractC0268Dc<? super AbstractC1564jo>> list = this.f4993c.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC0268Dc<? super AbstractC1564jo> dc : list) {
                    if (pVar.apply(dc)) {
                        arrayList.add(dc);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void a(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        synchronized (this.d) {
            List<AbstractC0268Dc<? super AbstractC1564jo>> list = this.f4993c.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f4993c.put(str, list);
            }
            list.add(dc);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void a(boolean z2) {
        synchronized (this.d) {
            this.n = true;
        }
    }

    public final void a(boolean z2, int i2) {
        Ona ona = (!this.f4991a.k() || this.f4991a.H().e()) ? this.e : null;
        o oVar = this.f;
        t tVar = this.q;
        AbstractC1564jo joVar = this.f4991a;
        a(new AdOverlayInfoParcel(ona, oVar, tVar, joVar, z2, i2, joVar.q()));
    }

    public final void a(boolean z2, int i2, String str) {
        boolean k2 = this.f4991a.k();
        Ona ona = (!k2 || this.f4991a.H().e()) ? this.e : null;
        C2184so soVar = k2 ? null : new C2184so(this.f4991a, this.f);
        AbstractC1472ic icVar = this.i;
        AbstractC1609kc kcVar = this.j;
        t tVar = this.q;
        AbstractC1564jo joVar = this.f4991a;
        a(new AdOverlayInfoParcel(ona, soVar, icVar, kcVar, tVar, joVar, z2, i2, str, joVar.q()));
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean k2 = this.f4991a.k();
        Ona ona = (!k2 || this.f4991a.H().e()) ? this.e : null;
        C2184so soVar = k2 ? null : new C2184so(this.f4991a, this.f);
        AbstractC1472ic icVar = this.i;
        AbstractC1609kc kcVar = this.j;
        t tVar = this.q;
        AbstractC1564jo joVar = this.f4991a;
        a(new AdOverlayInfoParcel(ona, soVar, icVar, kcVar, tVar, joVar, z2, i2, str, str2, joVar.q()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void b() {
        Dma dma = this.f4992b;
        if (dma != null) {
            dma.a(Fma.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.w = true;
        o();
        if (((Boolean) C2392voa.e().a(C2474x.Fd)).booleanValue()) {
            this.f4991a.destroy();
        }
    }

    public final void b(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        synchronized (this.d) {
            List<AbstractC0268Dc<? super AbstractC1564jo>> list = this.f4993c.get(str);
            if (list != null) {
                list.remove(dc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void b(boolean z2) {
        synchronized (this.d) {
            this.o = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void c() {
        AbstractC1761mj mjVar = this.u;
        if (mjVar != null) {
            WebView webView = this.f4991a.getWebView();
            if (a.d.c.c.c(webView)) {
                a(webView, mjVar, 10);
                return;
            }
            n();
            this.z = new View$OnAttachStateChangeListenerC2047qo(this, mjVar);
            this.f4991a.getView().addOnAttachStateChangeListener(this.z);
        }
    }

    public final void c(boolean z2) {
        this.l = z2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final c d() {
        return this.s;
    }

    public final void d(boolean z2) {
        this.y = z2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void e() {
        synchronized (this.d) {
            this.l = false;
            this.m = true;
            C0875_l.e.execute(new RunnableC1702lo(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final void f() {
        synchronized (this.d) {
            this.p = true;
        }
        this.x++;
        o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final boolean g() {
        boolean z2;
        synchronized (this.d) {
            z2 = this.m;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774Wo
    public final AbstractC1761mj h() {
        return this.u;
    }

    public final void i() {
        AbstractC1761mj mjVar = this.u;
        if (mjVar != null) {
            mjVar.a();
            this.u = null;
        }
        n();
        synchronized (this.d) {
            this.f4993c.clear();
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.l = false;
            this.m = false;
            this.n = false;
            this.p = false;
            this.q = null;
            this.k = null;
            if (this.t != null) {
                this.t.a(true);
                this.t = null;
            }
        }
    }

    public final boolean j() {
        boolean z2;
        synchronized (this.d) {
            z2 = this.n;
        }
        return z2;
    }

    public final boolean k() {
        boolean z2;
        synchronized (this.d) {
            z2 = this.o;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener l() {
        synchronized (this.d) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener m() {
        synchronized (this.d) {
        }
        return null;
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C1763mk.f(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.a();
        r0.h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.v = true;
        r1 = r0.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.jo r2 = r0.f4991a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.isDestroyed()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.C1763mk.f(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.jo r2 = r0.f4991a     // Catch:{ all -> 0x0029 }
            r2.o()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.v = r1
            com.google.android.gms.internal.ads.Zo r1 = r0.h
            if (r1 == 0) goto L_0x0025
            r1.a()
            r1 = 0
            r0.h = r1
        L_0x0025:
            r0.o()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1771mo.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC1286fma s2 = this.f4991a.s();
        if (s2 != null && webView == s2.getWebView()) {
            s2.a(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f4991a.a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(str, Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C1763mk.f(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.l && webView == this.f4991a.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    Ona ona = this.e;
                    if (ona != null) {
                        ona.e();
                        AbstractC1761mj mjVar = this.u;
                        if (mjVar != null) {
                            mjVar.a(str);
                        }
                        this.e = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f4991a.getWebView().willNotDraw()) {
                try {
                    C1955pca f2 = this.f4991a.f();
                    if (f2 != null && f2.a(parse)) {
                        parse = f2.a(parse, this.f4991a.getContext(), this.f4991a.getView(), this.f4991a.v());
                    }
                } catch (Rba unused) {
                    String valueOf2 = String.valueOf(str);
                    C0745Vl.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                c cVar = this.s;
                if (cVar == null || cVar.b()) {
                    a(new d("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
                } else {
                    this.s.a(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                C0745Vl.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            a(parse);
        }
        return true;
    }
}
