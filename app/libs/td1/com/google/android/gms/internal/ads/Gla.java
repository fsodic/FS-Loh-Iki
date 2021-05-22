package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.cocos2dx.lib.BuildConfig;

final class Gla implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private ValueCallback<String> f2071a = new Jla(this);

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C2593yla f2072b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WebView f2073c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Ela e;

    Gla(Ela ela, C2593yla yla, WebView webView, boolean z) {
        this.e = ela;
        this.f2072b = yla;
        this.f2073c = webView;
        this.d = z;
    }

    public final void run() {
        if (this.f2073c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f2073c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f2071a);
            } catch (Throwable unused) {
                this.f2071a.onReceiveValue(BuildConfig.FLAVOR);
            }
        }
    }
}
