package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.fma  reason: case insensitive filesystem */
public interface AbstractC1286fma {
    void a(Activity activity, WebView webView);

    void a(WebView webView, String str, Bitmap bitmap);

    void a(String str, String str2);

    View getView();

    WebView getWebView();
}
