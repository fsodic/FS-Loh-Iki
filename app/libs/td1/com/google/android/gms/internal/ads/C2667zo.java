package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.c.b.a.c.a;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.p;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zo  reason: case insensitive filesystem */
public final class C2667zo extends FrameLayout implements AbstractC1564jo {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f6212a;

    /* renamed from: b  reason: collision with root package name */
    private final C0590Pm f6213b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f6214c = new AtomicBoolean();

    public C2667zo(AbstractC1564jo joVar) {
        super(joVar.getContext());
        this.f6212a = joVar;
        this.f6213b = new C0590Pm(joVar.u(), this, this);
        if (!w()) {
            addView(this.f6212a.getView());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void A() {
        this.f6212a.A();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final c B() {
        return this.f6212a.B();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final AbstractC0526Na C() {
        return this.f6212a.C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final String D() {
        return this.f6212a.D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final BinderC0306Eo E() {
        return this.f6212a.E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean F() {
        return this.f6212a.F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void G() {
        this.f6212a.G();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0670So
    public final C1153dp H() {
        return this.f6212a.H();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final C0590Pm I() {
        return this.f6213b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void J() {
        this.f6212a.J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void K() {
        this.f6212a.K();
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
        return this.f6212a.N();
    }

    @Override // com.google.android.gms.ads.internal.i
    public final void a() {
        this.f6212a.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(int i) {
        this.f6212a.a(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(Context context) {
        this.f6212a.a(context);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.f6212a.a(this, activity, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(a aVar) {
        this.f6212a.a(aVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(c cVar) {
        this.f6212a.a(cVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(d dVar) {
        this.f6212a.a(dVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(BinderC0306Eo eo) {
        this.f6212a.a(eo);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(AbstractC0396Ia ia) {
        this.f6212a.a(ia);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(AbstractC0526Na na) {
        this.f6212a.a(na);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(Xla xla) {
        this.f6212a.a(xla);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(C1153dp dpVar) {
        this.f6212a.a(dpVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        this.f6212a.a(ola);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0925ae
    public final void a(String str) {
        this.f6212a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(String str, p<AbstractC0268Dc<? super AbstractC1564jo>> pVar) {
        this.f6212a.a(str, pVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        this.f6212a.a(str, dc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(String str, AbstractC0565On on) {
        this.f6212a.a(str, on);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(String str, String str2, String str3) {
        this.f6212a.a(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, Map<String, ?> map) {
        this.f6212a.a(str, map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, JSONObject jSONObject) {
        this.f6212a.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void a(boolean z) {
        this.f6212a.a(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(boolean z, int i, String str) {
        this.f6212a.a(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void a(boolean z, int i, String str, String str2) {
        this.f6212a.a(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void a(boolean z, long j) {
        this.f6212a.a(z, j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean a(boolean z, int i) {
        if (!this.f6214c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C2392voa.e().a(C2474x.ma)).booleanValue()) {
            return false;
        }
        if (this.f6212a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f6212a.getParent()).removeView(this.f6212a.getView());
        }
        return this.f6212a.a(z, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final AbstractC0565On b(String str) {
        return this.f6212a.b(str);
    }

    @Override // com.google.android.gms.ads.internal.i
    public final void b() {
        this.f6212a.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void b(c cVar) {
        this.f6212a.b(cVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void b(String str, AbstractC0268Dc<? super AbstractC1564jo> dc) {
        this.f6212a.b(str, dc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0925ae
    public final void b(String str, JSONObject jSONObject) {
        this.f6212a.b(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void b(boolean z) {
        this.f6212a.b(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0618Qo
    public final void b(boolean z, int i) {
        this.f6212a.b(z, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void c() {
        setBackgroundColor(0);
        this.f6212a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void c(boolean z) {
        this.f6212a.c(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final AbstractC0774Wo d() {
        return this.f6212a.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void d(boolean z) {
        this.f6212a.d(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void destroy() {
        a h = h();
        if (h != null) {
            C2452wk.f5921a.post(new RunnableC2598yo(h));
            C2452wk.f5921a.postDelayed(new RunnableC0228Bo(this), (long) ((Integer) C2392voa.e().a(C2474x.cd)).intValue());
            return;
        }
        this.f6212a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void e(boolean z) {
        this.f6212a.e(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0748Vo
    public final C1955pca f() {
        return this.f6212a.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final void f(boolean z) {
        this.f6212a.f(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void g() {
        TextView textView = new TextView(getContext());
        Resources b2 = q.g().b();
        textView.setText(b2 != null ? b2.getString(com.google.android.gms.ads.d.a.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    public final String getRequestId() {
        return this.f6212a.getRequestId();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0826Yo, com.google.android.gms.internal.ads.AbstractC1564jo
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final WebView getWebView() {
        return this.f6212a.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final a h() {
        return this.f6212a.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final Xla i() {
        return this.f6212a.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean isDestroyed() {
        return this.f6212a.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void j() {
        this.f6212a.j();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0514Mo
    public final boolean k() {
        return this.f6212a.k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void l() {
        this.f6212a.l();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void loadData(String str, String str2, String str3) {
        this.f6212a.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f6212a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void loadUrl(String str) {
        this.f6212a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final M m() {
        return this.f6212a.m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean n() {
        return this.f6214c.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void o() {
        this.f6213b.a();
        this.f6212a.o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void onPause() {
        this.f6213b.b();
        this.f6212a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void onResume() {
        this.f6212a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void p() {
        this.f6212a.p();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0722Uo
    public final C0823Yl q() {
        return this.f6212a.q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo
    public final com.google.android.gms.ads.internal.a r() {
        return this.f6212a.r();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final AbstractC1286fma s() {
        return this.f6212a.s();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6212a.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f6212a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void setRequestedOrientation(int i) {
        this.f6212a.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f6212a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f6212a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean t() {
        return this.f6212a.t();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final Context u() {
        return this.f6212a.u();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC1564jo, com.google.android.gms.internal.ads.AbstractC0540No
    public final Activity v() {
        return this.f6212a.v();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean w() {
        return this.f6212a.w();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final boolean x() {
        return this.f6212a.x();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final c y() {
        return this.f6212a.y();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1564jo
    public final WebViewClient z() {
        return this.f6212a.z();
    }
}
