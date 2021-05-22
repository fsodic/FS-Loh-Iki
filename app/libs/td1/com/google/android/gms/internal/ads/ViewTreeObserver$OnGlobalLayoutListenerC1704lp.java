package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
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
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.c.b.a.c.a;
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
import java.util.concurrent.atomic.AtomicReference;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lp  reason: case insensitive filesystem */
final class ViewTreeObserver$OnGlobalLayoutListenerC1704lp extends C2117rp implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, AbstractC0477Ld, AbstractC1564jo {
    private AbstractC0526Na A;
    private AbstractC0396Ia B;
    private Xla C;
    private int D;
    private int E;
    private J F;
    private J G;
    private J H;
    private M I;
    private WeakReference<View.OnClickListener> J;
    private c K;
    private C0381Hl L;
    private final AtomicReference<a> M = new AtomicReference<>();
    private int N = -1;
    private int O = -1;
    private int P = -1;
    private int Q = -1;
    private Map<String, AbstractC0565On> R;
    private final WindowManager S;
    private final C0947ap d;
    private final C1085cp e;
    private final C1955pca f;
    private final C0823Yl g;
    private final i h;
    private final com.google.android.gms.ads.internal.a i;
    private final DisplayMetrics j;
    private final Dma k;
    private final AbstractC1286fma l;
    private final boolean m;
    private c n;
    private C1153dp o;
    private String p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u = true;
    private boolean v = false;
    private String w = BuildConfig.FLAVOR;
    private BinderC0306Eo x;
    private boolean y;
    private boolean z;

    protected ViewTreeObserver$OnGlobalLayoutListenerC1704lp(C0947ap apVar, C1085cp cpVar, C1153dp dpVar, String str, boolean z2, boolean z3, C1955pca pca, C0823Yl yl, L l2, i iVar, com.google.android.gms.ads.internal.a aVar, Dma dma, AbstractC1286fma fma, boolean z4) {
        super(apVar, cpVar);
        this.d = apVar;
        this.e = cpVar;
        this.o = dpVar;
        this.p = str;
        this.r = z2;
        this.t = -1;
        this.f = pca;
        this.g = yl;
        this.h = iVar;
        this.i = aVar;
        this.S = (WindowManager) getContext().getSystemService("window");
        q.c();
        this.j = C2452wk.a(this.S);
        this.k = dma;
        this.l = fma;
        this.m = z4;
        this.L = new C0381Hl(this.d.b(), this, this, null);
        q.c().a(apVar, yl.f3587a, getSettings());
        setDownloadListener(this);
        Q();
        if (o.d()) {
            addJavascriptInterface(C0436Jo.a(this), "googleAdsJsInterface");
        }
        U();
        this.I = new M(new L(true, "make_wv", this.p));
        this.I.a().a(l2);
        this.G = G.a(this.I.a());
        this.I.a("native:view_create", this.G);
        this.H = null;
        this.F = null;
        q.e().b(apVar);
    }

    private final boolean O() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.e.g() && !this.e.j()) {
            return false;
        }
        C2392voa.a();
        DisplayMetrics displayMetrics = this.j;
        int b2 = C0459Kl.b(displayMetrics, displayMetrics.widthPixels);
        C2392voa.a();
        DisplayMetrics displayMetrics2 = this.j;
        int b3 = C0459Kl.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity b4 = this.d.b();
        if (b4 == null || b4.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            q.c();
            int[] a2 = C2452wk.a(b4);
            C2392voa.a();
            int b5 = C0459Kl.b(this.j, a2[0]);
            C2392voa.a();
            i2 = C0459Kl.b(this.j, a2[1]);
            i3 = b5;
        }
        if (this.O == b2 && this.N == b3 && this.P == i3 && this.Q == i2) {
            return false;
        }
        if (!(this.O == b2 && this.N == b3)) {
            z2 = true;
        }
        this.O = b2;
        this.N = b3;
        this.P = i3;
        this.Q = i2;
        new C0662Sg(this).a(b2, b3, i3, i2, this.j.density, this.S.getDefaultDisplay().getRotation());
        return z2;
    }

    private final void P() {
        G.a(this.I.a(), this.G, "aeh2");
    }

    private final synchronized void Q() {
        if (!this.r) {
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
        if (!this.s) {
            q.e();
            setLayerType(1, null);
        }
        this.s = true;
    }

    private final synchronized void S() {
        if (this.s) {
            q.e();
            setLayerType(0, null);
        }
        this.s = false;
    }

    private final synchronized void T() {
        if (this.R != null) {
            for (AbstractC0565On on : this.R.values()) {
                on.a();
            }
        }
        this.R = null;
    }

    private final void U() {
        L a2;
        M m2 = this.I;
        if (m2 != null && (a2 = m2.a()) != null && q.g().c() != null) {
            q.g().c().a(a2);
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

    private final void h(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        C0451Kd.a(this, "onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void A() {
        this.L.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized c B() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized AbstractC0526Na C() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized String D() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized BinderC0306Eo E() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized boolean F() {
        return this.q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void G() {
        if (this.H == null) {
            this.H = G.a(this.I.a());
            this.I.a("native:view_load", this.H);
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
        if (this.B != null) {
            this.B.Vb();
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
        return this.G;
    }

    @Override // com.google.android.gms.ads.internal.i
    public final synchronized void a() {
        this.v = true;
        if (this.h != null) {
            this.h.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(int i2) {
        if (i2 == 0) {
            G.a(this.I.a(), this.G, "aebb2");
        }
        P();
        if (this.I.a() != null) {
            this.I.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.g.f3587a);
        C0451Kd.a(this, "onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(Context context) {
        this.d.setBaseContext(context);
        this.L.a(this.d.b());
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
        this.l.a(activity, this);
        this.l.a(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.l.getView());
        } else {
            C0745Vl.b("The FrameLayout object cannot be null.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(a aVar) {
        this.M.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(c cVar) {
        this.n = cVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(d dVar) {
        this.e.a(dVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(BinderC0306Eo eo) {
        if (this.x != null) {
            C0745Vl.b("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.x = eo;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(AbstractC0396Ia ia) {
        this.B = ia;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(AbstractC0526Na na) {
        this.A = na;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(Xla xla) {
        this.C = xla;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(C1153dp dpVar) {
        this.o = dpVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        synchronized (this) {
            this.y = ola.m;
        }
        h(ola.m);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld, com.google.android.gms.internal.ads.C2117rp, com.google.android.gms.internal.ads.C1773mp, com.google.android.gms.internal.ads.AbstractC0925ae
    public final synchronized void a(String str) {
        if (!isDestroyed()) {
            super.a(str);
        } else {
            C0745Vl.d("The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(String str, p<AbstractC0268Dc<? super AbstractC1564jo>> pVar) {
        C1085cp cpVar = this.e;
        if (cpVar != null) {
            cpVar.a(str, pVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        C1085cp cpVar = this.e;
        if (cpVar != null) {
            cpVar.a(str, dc);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(String str, AbstractC0565On on) {
        if (this.R == null) {
            this.R = new HashMap();
        }
        this.R.put(str, on);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld
    public final void a(String str, String str2) {
        C0451Kd.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(String str, String str2, String str3) {
        super.loadDataWithBaseURL(str, C0696To.a(str2, C0696To.a()), "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, Map map) {
        C0451Kd.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld, com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, JSONObject jSONObject) {
        C0451Kd.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void a(boolean z2) {
        if (this.n != null) {
            this.n.a(this.e.g(), z2);
        } else {
            this.q = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(boolean z2, int i2, String str) {
        this.e.a(z2, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(boolean z2, int i2, String str, String str2) {
        this.e.a(z2, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void a(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        C0451Kd.a(this, "onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean a(boolean z2, int i2) {
        destroy();
        this.k.a(new C1635kp(z2, i2));
        this.k.a(Fma.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final synchronized AbstractC0565On b(String str) {
        if (this.R == null) {
            return null;
        }
        return this.R.get(str);
    }

    @Override // com.google.android.gms.ads.internal.i
    public final synchronized void b() {
        this.v = false;
        if (this.h != null) {
            this.h.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void b(c cVar) {
        this.K = cVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void b(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        C1085cp cpVar = this.e;
        if (cpVar != null) {
            cpVar.b(str, dc);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0925ae
    public final void b(String str, JSONObject jSONObject) {
        C0451Kd.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void b(boolean z2) {
        this.u = z2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void b(boolean z2, int i2) {
        this.e.a(z2, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void c() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void c(boolean z2) {
        this.D += z2 ? 1 : -1;
        if (this.D <= 0 && this.n != null) {
            this.n.bc();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final /* synthetic */ AbstractC0774Wo d() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void d(boolean z2) {
        boolean z3 = z2 != this.r;
        this.r = z2;
        Q();
        if (z3) {
            if (!((Boolean) C2392voa.e().a(C2474x.J)).booleanValue() || !this.o.e()) {
                new C0662Sg(this).c(z2 ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void e(boolean z2) {
        this.e.d(z2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0748Vo
    public final C1955pca f() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void f(boolean z2) {
        this.e.c(z2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void g() {
        C1763mk.f("Cannot add text view to inner AdWebView");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C2117rp
    public final synchronized void g(boolean z2) {
        if (!z2) {
            U();
            this.L.d();
            if (this.n != null) {
                this.n.Wb();
                this.n.onDestroy();
                this.n = null;
            }
        }
        this.M.set(null);
        this.e.i();
        q.y();
        C0487Ln.a(this);
        T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final synchronized String getRequestId() {
        return this.w;
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
    public final a h() {
        return this.M.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized Xla i() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void j() {
        if (this.F == null) {
            G.a(this.I.a(), this.G, "aes2");
            this.F = G.a(this.I.a());
            this.I.a("native:view_show", this.F);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.g.f3587a);
        C0451Kd.a(this, "onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0514Mo
    public final synchronized boolean k() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void l() {
        P();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.g.f3587a);
        C0451Kd.a(this, "onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final M m() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.C2117rp
    public final void o() {
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.L.a();
        }
        boolean z2 = this.y;
        if (this.e != null && this.e.j()) {
            if (!this.z) {
                this.e.l();
                this.e.m();
                this.z = true;
            }
            O();
            z2 = true;
        }
        h(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.L.b();
            }
            super.onDetachedFromWindow();
            if (this.z && this.e != null && this.e.j() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.e.l();
                this.e.m();
                this.z = false;
            }
        }
        h(false);
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
    @Override // com.google.android.gms.internal.ads.C2117rp
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            C1085cp cpVar = this.e;
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
        boolean O2 = O();
        c y2 = y();
        if (y2 != null && O2) {
            y2._b();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i2, int i3) {
        if (isDestroyed()) {
            setMeasuredDimension(0, 0);
        } else if (isInEditMode() || this.r || this.o.f()) {
            super.onMeasure(i2, i3);
        } else if (this.o.h()) {
            super.onMeasure(i2, i3);
        } else if (this.o.g()) {
            if (((Boolean) C2392voa.e().a(C2474x.gc)).booleanValue()) {
                super.onMeasure(i2, i3);
                return;
            }
            BinderC0306Eo E2 = E();
            float W = E2 != null ? E2.W() : 0.0f;
            if (W == 0.0f) {
                super.onMeasure(i2, i3);
                return;
            }
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i3);
            int i4 = (int) (((float) size2) * W);
            int i5 = (int) (((float) size) / W);
            if (size2 == 0 && i5 != 0) {
                i4 = (int) (((float) i5) * W);
                size2 = i5;
            } else if (size == 0 && i4 != 0) {
                i5 = (int) (((float) i4) / W);
                size = i4;
            }
            setMeasuredDimension(Math.min(i4, size), Math.min(i5, size2));
        } else if (this.o.a()) {
            if (((Boolean) C2392voa.e().a(C2474x.jc)).booleanValue() || !o.d()) {
                super.onMeasure(i2, i3);
                return;
            }
            a("/contentHeight", new C1842np(this));
            a("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
            setMeasuredDimension(View.MeasureSpec.getSize(i2), this.E != -1 ? (int) (((float) this.E) * this.j.density) : View.MeasureSpec.getSize(i3));
        } else if (this.o.e()) {
            setMeasuredDimension(this.j.widthPixels, this.j.heightPixels);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size3 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size4 = View.MeasureSpec.getSize(i3);
            int i6 = Integer.MAX_VALUE;
            int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i6 = size4;
            }
            boolean z2 = true;
            boolean z3 = this.o.f4151c > i7 || this.o.f4150b > i6;
            if (((Boolean) C2392voa.e().a(C2474x.qd)).booleanValue()) {
                if (((float) this.o.f4151c) / this.j.density > ((float) i7) / this.j.density || ((float) this.o.f4150b) / this.j.density > ((float) i6) / this.j.density) {
                    z2 = false;
                }
                if (z3) {
                    z3 = z2;
                }
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(103);
                sb.append("Not enough space to show ad. Needs ");
                sb.append((int) (((float) this.o.f4151c) / this.j.density));
                sb.append("x");
                sb.append((int) (((float) this.o.f4150b) / this.j.density));
                sb.append(" dp, but only has ");
                sb.append((int) (((float) size3) / this.j.density));
                sb.append("x");
                sb.append((int) (((float) size4) / this.j.density));
                sb.append(" dp.");
                C0745Vl.d(sb.toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                return;
            }
            if (getVisibility() != 8) {
                setVisibility(0);
            }
            setMeasuredDimension(this.o.f4151c, this.o.f4150b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.C2117rp
    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e2) {
            C0745Vl.b("Could not pause webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.C2117rp
    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e2) {
            C0745Vl.b("Could not resume webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.C2117rp
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.j() || this.e.k()) {
            C1955pca pca = this.f;
            if (pca != null) {
                pca.a(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.A != null) {
                    this.A.a(motionEvent);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void p() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(q.h().b()));
        hashMap.put("app_volume", String.valueOf(q.h().a()));
        hashMap.put("device_volume", String.valueOf(C0562Ok.a(getContext())));
        C0451Kd.a(this, "volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0722Uo
    public final C0823Yl q() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final com.google.android.gms.ads.internal.a r() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final AbstractC1286fma s() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.J = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized void setRequestedOrientation(int i2) {
        this.t = i2;
        if (this.n != null) {
            this.n.x(this.t);
        }
    }

    @Override // com.google.android.gms.internal.ads.C2117rp
    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e2) {
            C0745Vl.b("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized boolean t() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final Context u() {
        return this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0540No
    public final Activity v() {
        return this.d.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean w() {
        return ((Boolean) C2392voa.e().a(C2474x.ke)).booleanValue() && this.l != null && this.m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized boolean x() {
        return this.D > 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final synchronized c y() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final WebViewClient z() {
        return this.e;
    }
}
