package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.p;
import com.google.android.gms.internal.ads.C0944ana;
import com.google.android.gms.internal.ads.Tma;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ao  reason: case insensitive filesystem */
public final class ViewTreeObserver$OnGlobalLayoutListenerC0202Ao extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, AbstractC1564jo {
    private boolean A;
    private boolean B;
    private AbstractC0526Na C;
    private AbstractC0396Ia D;
    private Xla E;
    private int F;
    private int G;
    private J H;
    private J I;
    private J J;
    private M K;
    private WeakReference<View.OnClickListener> L;
    private c M;
    private boolean N;
    private C0381Hl O;
    private int P = -1;
    private int Q = -1;
    private int R = -1;
    private int S = -1;
    private Map<String, AbstractC0565On> T;
    private final WindowManager U;
    private final Dma V;

    /* renamed from: a  reason: collision with root package name */
    private final C0947ap f1560a;

    /* renamed from: b  reason: collision with root package name */
    private final C1955pca f1561b;

    /* renamed from: c  reason: collision with root package name */
    private final C0823Yl f1562c;
    private final i d;
    private final a e;
    private final DisplayMetrics f;
    private final float g;
    private final AbstractC1286fma h;
    private final boolean i;
    private boolean j = false;
    private boolean k = false;
    private C1771mo l;
    private c m;
    private b.c.b.a.c.a n;
    private C1153dp o;
    private String p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private Boolean u;
    private int v;
    private boolean w = true;
    private boolean x = false;
    private String y = BuildConfig.FLAVOR;
    private BinderC0306Eo z;

    private ViewTreeObserver$OnGlobalLayoutListenerC0202Ao(C0947ap apVar, C1153dp dpVar, String str, boolean z2, boolean z3, C1955pca pca, C0823Yl yl, L l2, i iVar, a aVar, Dma dma, AbstractC1286fma fma, boolean z4) {
        super(apVar);
        this.f1560a = apVar;
        this.o = dpVar;
        this.p = str;
        this.s = z2;
        this.v = -1;
        this.f1561b = pca;
        this.f1562c = yl;
        this.d = iVar;
        this.e = aVar;
        this.U = (WindowManager) getContext().getSystemService("window");
        q.c();
        this.f = C2452wk.a(this.U);
        this.g = this.f.density;
        this.V = dma;
        this.h = fma;
        this.i = z4;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            C0745Vl.b("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        q.c().a(apVar, yl.f3587a, settings);
        q.e().a(getContext(), settings);
        setDownloadListener(this);
        Q();
        if (o.d()) {
            addJavascriptInterface(C0436Jo.a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.O = new C0381Hl(this.f1560a.b(), this, this, null);
        U();
        this.K = new M(new L(true, "make_wv", this.p));
        this.K.a().a(l2);
        this.I = G.a(this.K.a());
        this.K.a("native:view_create", this.I);
        this.J = null;
        this.H = null;
        q.e().b(apVar);
        q.g().f();
    }

    private final synchronized void O() {
        this.u = q.g().d();
        if (this.u == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                a((Boolean) true);
            } catch (IllegalStateException unused) {
                a((Boolean) false);
            }
        }
    }

    private final void P() {
        G.a(this.K.a(), this.I, "aeh2");
    }

    private final synchronized void Q() {
        if (!this.s) {
            if (!this.o.e()) {
                if (Build.VERSION.SDK_INT < 18) {
                    C0745Vl.a("Disabling hardware acceleration on an AdView.");
                    R();
                    return;
                }
                C0745Vl.a("Enabling hardware acceleration on an AdView.");
                S();
                return;
            }
        }
        C0745Vl.a("Enabling hardware acceleration on an overlay.");
        S();
    }

    private final synchronized void R() {
        if (!this.t) {
            q.e();
            setLayerType(1, null);
        }
        this.t = true;
    }

    private final synchronized void S() {
        if (this.t) {
            q.e();
            setLayerType(0, null);
        }
        this.t = false;
    }

    private final synchronized void T() {
        if (this.T != null) {
            for (AbstractC0565On on : this.T.values()) {
                on.a();
            }
        }
        this.T = null;
    }

    private final void U() {
        L a2;
        M m2 = this.K;
        if (m2 != null && (a2 = m2.a()) != null && q.g().c() != null) {
            q.g().c().a(a2);
        }
    }

    private final synchronized Boolean V() {
        return this.u;
    }

    private final synchronized void W() {
        if (!this.N) {
            this.N = true;
            q.g().g();
        }
    }

    static ViewTreeObserver$OnGlobalLayoutListenerC0202Ao a(Context context, C1153dp dpVar, String str, boolean z2, boolean z3, C1955pca pca, C0823Yl yl, L l2, i iVar, a aVar, Dma dma, AbstractC1286fma fma, boolean z4) {
        return new ViewTreeObserver$OnGlobalLayoutListenerC0202Ao(new C0947ap(context), dpVar, str, z2, z3, pca, yl, l2, iVar, aVar, dma, fma, z4);
    }

    private final void a(Boolean bool) {
        synchronized (this) {
            this.u = bool;
        }
        q.g().a(bool);
    }

    @TargetApi(19)
    private final synchronized void a(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            evaluateJavascript(str, null);
        } else {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    static final /* synthetic */ void a(boolean z2, int i2, C0944ana.a aVar) {
        Tma.a o2 = Tma.o();
        if (o2.k() != z2) {
            o2.a(z2);
        }
        o2.a(i2);
        aVar.a((Tma) o2.j());
    }

    private final synchronized void c(String str) {
        if (!isDestroyed()) {
            loadUrl(str);
        } else {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void d(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            q.g().a(e2, "AdWebViewImpl.loadUrlUnsafe");
            C0745Vl.c("Could not call loadUrl. ", e2);
        }
    }

    private final void e(String str) {
        if (o.f()) {
            if (V() == null) {
                O();
            }
            if (V().booleanValue()) {
                a(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            c(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        c(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    private final boolean e() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.l.g() && !this.l.j()) {
            return false;
        }
        C2392voa.a();
        DisplayMetrics displayMetrics = this.f;
        int b2 = C0459Kl.b(displayMetrics, displayMetrics.widthPixels);
        C2392voa.a();
        DisplayMetrics displayMetrics2 = this.f;
        int b3 = C0459Kl.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity b4 = this.f1560a.b();
        if (b4 == null || b4.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            q.c();
            int[] a2 = C2452wk.a(b4);
            C2392voa.a();
            int b5 = C0459Kl.b(this.f, a2[0]);
            C2392voa.a();
            i2 = C0459Kl.b(this.f, a2[1]);
            i3 = b5;
        }
        if (this.Q == b2 && this.P == b3 && this.R == i3 && this.S == i2) {
            return false;
        }
        if (!(this.Q == b2 && this.P == b3)) {
            z2 = true;
        }
        this.Q = b2;
        this.P = b3;
        this.R = i3;
        this.S = i2;
        new C0662Sg(this).a(b2, b3, i3, i2, this.f.density, this.U.getDefaultDisplay().getRotation());
        return z2;
    }

    private final void g(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        a("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void A() {
        this.O.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized c B() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized AbstractC0526Na C() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized String D() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized BinderC0306Eo E() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized boolean F() {
        return this.q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void G() {
        if (this.J == null) {
            this.J = G.a(this.K.a());
            this.K.a("native:view_load", this.J);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0670So
    public final synchronized C1153dp H() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final C0590Pm I() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final synchronized void J() {
        if (this.D != null) {
            this.D.Vb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void K() {
        c y2 = y();
        if (y2 != null) {
            y2.ac();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final int L() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final int M() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final J N() {
        return this.I;
    }

    @Override // com.google.android.gms.ads.internal.i
    public final synchronized void a() {
        this.x = true;
        if (this.d != null) {
            this.d.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(int i2) {
        if (i2 == 0) {
            G.a(this.K.a(), this.I, "aebb2");
        }
        P();
        if (this.K.a() != null) {
            this.K.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.f1562c.f3587a);
        a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(Context context) {
        this.f1560a.setBaseContext(context);
        this.O.a(this.f1560a.b());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!w()) {
            C1763mk.f("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        C1763mk.f("Initializing ArWebView object.");
        this.h.a(activity, this);
        this.h.a(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.h.getView());
        } else {
            C0745Vl.b("The FrameLayout object cannot be null.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(b.c.b.a.c.a aVar) {
        this.n = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(c cVar) {
        this.m = cVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(d dVar) {
        this.l.a(dVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(BinderC0306Eo eo) {
        if (this.z != null) {
            C0745Vl.b("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.z = eo;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(AbstractC0396Ia ia) {
        this.D = ia;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(AbstractC0526Na na) {
        this.C = na;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(Xla xla) {
        this.E = xla;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(C1153dp dpVar) {
        this.o = dpVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        synchronized (this) {
            this.A = ola.m;
        }
        g(ola.m);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0925ae
    public final void a(String str) {
        e(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(String str, p<AbstractC0268Dc<? super AbstractC1564jo>> pVar) {
        C1771mo moVar = this.l;
        if (moVar != null) {
            moVar.a(str, pVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        C1771mo moVar = this.l;
        if (moVar != null) {
            moVar.a(str, dc);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(String str, AbstractC0565On on) {
        if (this.T == null) {
            this.T = new HashMap();
        }
        this.T.put(str, on);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, C0696To.a(str2, C0696To.a()), "text/html", "UTF-8", str3);
            return;
        }
        C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, Map<String, ?> map) {
        try {
            a(str, q.c().a(map));
        } catch (JSONException unused) {
            C0745Vl.d("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C0745Vl.a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        e(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(boolean z2) {
        if (this.m != null) {
            this.m.a(this.l.g(), z2);
        } else {
            this.q = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(boolean z2, int i2, String str) {
        this.l.a(z2, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(boolean z2, int i2, String str, String str2) {
        this.l.a(z2, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void a(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        a("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean a(boolean z2, int i2) {
        destroy();
        this.V.a(new C0280Do(z2, i2));
        this.V.a(Fma.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final synchronized AbstractC0565On b(String str) {
        if (this.T == null) {
            return null;
        }
        return this.T.get(str);
    }

    @Override // com.google.android.gms.ads.internal.i
    public final synchronized void b() {
        this.x = false;
        if (this.d != null) {
            this.d.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void b(c cVar) {
        this.M = cVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void b(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        C1771mo moVar = this.l;
        if (moVar != null) {
            moVar.b(str, dc);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0925ae
    public final void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        e(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void b(boolean z2) {
        this.w = z2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void b(boolean z2, int i2) {
        this.l.a(z2, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void c() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void c(boolean z2) {
        this.F += z2 ? 1 : -1;
        if (this.F <= 0 && this.m != null) {
            this.m.bc();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final /* synthetic */ AbstractC0774Wo d() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void d(boolean z2) {
        boolean z3 = z2 != this.s;
        this.s = z2;
        Q();
        if (z3) {
            if (!((Boolean) C2392voa.e().a(C2474x.J)).booleanValue() || !this.o.e()) {
                new C0662Sg(this).c(z2 ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void destroy() {
        U();
        this.O.d();
        if (this.m != null) {
            this.m.Wb();
            this.m.onDestroy();
            this.m = null;
        }
        this.n = null;
        this.l.i();
        if (!this.r) {
            q.y();
            C0487Ln.a(this);
            T();
            this.r = true;
            C1763mk.f("Initiating WebView self destruct sequence in 3...");
            C1763mk.f("Loading blank page in WebView, 2...");
            d("about:blank");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void e(boolean z2) {
        this.l.d(z2);
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            C0745Vl.e("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0748Vo
    public final C1955pca f() {
        return this.f1561b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void f(boolean z2) {
        this.l.c(z2);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.r) {
                    this.l.i();
                    q.y();
                    C0487Ln.a(this);
                    T();
                    W();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void g() {
        C1763mk.f("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final synchronized String getRequestId() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0826Yo
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized b.c.b.a.c.a h() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized Xla i() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized boolean isDestroyed() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void j() {
        if (this.H == null) {
            G.a(this.K.a(), this.I, "aes2");
            this.H = G.a(this.K.a());
            this.K.a("native:view_show", this.H);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f1562c.f3587a);
        a("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0514Mo
    public final synchronized boolean k() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void l() {
        P();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f1562c.f3587a);
        a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                q.g().a(e2, "AdWebViewImpl.loadUrl");
                C0745Vl.c("Could not call loadUrl. ", e2);
            }
        } else {
            C0745Vl.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final M m() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void o() {
        C1763mk.f("Destroying WebView!");
        W();
        C2452wk.f5921a.post(new RunnableC0332Fo(this));
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.O.a();
        }
        boolean z2 = this.A;
        if (this.l != null && this.l.j()) {
            if (!this.B) {
                this.l.l();
                this.l.m();
                this.B = true;
            }
            e();
            z2 = true;
        }
        g(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.O.b();
            }
            super.onDetachedFromWindow();
            if (this.B && this.l != null && this.l.j() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.l.l();
                this.l.m();
                this.B = false;
            }
        }
        g(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            q.c();
            C2452wk.a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            C0745Vl.a(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                C1771mo moVar = this.l;
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean e2 = e();
        c y2 = y();
        if (y2 != null && e2) {
            y2._b();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0164, code lost:
        if (r2 != false) goto L_0x0168;
     */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 514
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserver$OnGlobalLayoutListenerC0202Ao.onMeasure(int, int):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void onPause() {
        if (!isDestroyed()) {
            try {
                super.onPause();
            } catch (Exception e2) {
                C0745Vl.b("Could not pause webview.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void onResume() {
        if (!isDestroyed()) {
            try {
                super.onResume();
            } catch (Exception e2) {
                C0745Vl.b("Could not resume webview.", e2);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l.j() || this.l.k()) {
            C1955pca pca = this.f1561b;
            if (pca != null) {
                pca.a(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.C != null) {
                    this.C.a(motionEvent);
                }
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void p() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(q.h().b()));
        hashMap.put("app_volume", String.valueOf(q.h().a()));
        hashMap.put("device_volume", String.valueOf(C0562Ok.a(getContext())));
        a("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0722Uo
    public final C0823Yl q() {
        return this.f1562c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final a r() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final AbstractC1286fma s() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.L = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void setRequestedOrientation(int i2) {
        this.v = i2;
        if (this.m != null) {
            this.m.x(this.v);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C1771mo) {
            this.l = (C1771mo) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Exception e2) {
                C0745Vl.b("Could not stop loading webview.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized boolean t() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final Context u() {
        return this.f1560a.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0540No
    public final Activity v() {
        return this.f1560a.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean w() {
        return ((Boolean) C2392voa.e().a(C2474x.ke)).booleanValue() && this.h != null && this.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized boolean x() {
        return this.F > 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized c y() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final WebViewClient z() {
        return this.l;
    }
}
