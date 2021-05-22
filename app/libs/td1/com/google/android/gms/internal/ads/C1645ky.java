package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.ky  reason: case insensitive filesystem */
public final class C1645ky implements AbstractC1286fma {

    /* renamed from: a  reason: collision with root package name */
    private C1119dV f4825a;

    @Override // com.google.android.gms.internal.ads.AbstractC1286fma
    public final void a(Activity activity, WebView webView) {
        try {
            this.f4825a = new C1119dV(activity, webView);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(valueOf);
            C0745Vl.b(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1286fma
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f4825a != null) {
            C1119dV.a(webView, str, bitmap);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1286fma
    public final void a(String str, String str2) {
        if (this.f4825a == null) {
            C0745Vl.b("ArWebView is not initialized.");
        } else {
            C1119dV.getWebView().loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1286fma
    public final View getView() {
        return this.f4825a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1286fma
    public final WebView getWebView() {
        if (this.f4825a == null) {
            return null;
        }
        return C1119dV.getWebView();
    }
}
