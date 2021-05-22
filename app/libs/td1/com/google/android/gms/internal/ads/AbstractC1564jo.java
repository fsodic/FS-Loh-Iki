package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.c.b.a.c.a;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.common.util.p;

/* renamed from: com.google.android.gms.internal.ads.jo  reason: case insensitive filesystem */
public interface AbstractC1564jo extends i, AbstractC0269Dd, AbstractC0925ae, AbstractC0798Xm, AbstractC0514Mo, AbstractC0540No, AbstractC0618Qo, AbstractC0722Uo, AbstractC0748Vo, AbstractC0826Yo, AbstractC1835nla {
    void A();

    c B();

    AbstractC0526Na C();

    String D();

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    BinderC0306Eo E();

    boolean F();

    void G();

    @Override // com.google.android.gms.internal.ads.AbstractC0670So
    C1153dp H();

    void a(int i);

    void a(Context context);

    void a(ViewGroup viewGroup, Activity activity, String str, String str2);

    void a(a aVar);

    void a(c cVar);

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    void a(BinderC0306Eo eo);

    void a(AbstractC0396Ia ia);

    void a(AbstractC0526Na na);

    void a(Xla xla);

    void a(C1153dp dpVar);

    void a(String str, p<AbstractC0268Dc<? super AbstractC1564jo>> pVar);

    void a(String str, AbstractC0268Dc<? super AbstractC1564jo> dc);

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    void a(String str, AbstractC0565On on);

    void a(String str, String str2, String str3);

    void a(boolean z);

    boolean a(boolean z, int i);

    void b(c cVar);

    void b(String str, AbstractC0268Dc<? super AbstractC1564jo> dc);

    void b(boolean z);

    void c();

    void c(boolean z);

    AbstractC0774Wo d();

    void d(boolean z);

    void destroy();

    void e(boolean z);

    @Override // com.google.android.gms.internal.ads.AbstractC0748Vo
    C1955pca f();

    void g();

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC0540No
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    @Override // com.google.android.gms.internal.ads.AbstractC0826Yo
    View getView();

    WebView getWebView();

    int getWidth();

    a h();

    Xla i();

    boolean isDestroyed();

    void j();

    @Override // com.google.android.gms.internal.ads.AbstractC0514Mo
    boolean k();

    void l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    M m();

    void measure(int i, int i2);

    boolean n();

    void o();

    void onPause();

    void onResume();

    void p();

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC0722Uo
    C0823Yl q();

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    com.google.android.gms.ads.internal.a r();

    AbstractC1286fma s();

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    boolean t();

    Context u();

    @Override // com.google.android.gms.internal.ads.AbstractC0798Xm, com.google.android.gms.internal.ads.AbstractC0540No
    Activity v();

    boolean w();

    boolean x();

    c y();

    WebViewClient z();
}
