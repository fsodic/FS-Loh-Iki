package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.Po  reason: case insensitive filesystem */
public final class C0592Po extends C0566Oo {
    public C0592Po(AbstractC1564jo joVar, Dma dma, boolean z) {
        super(joVar, dma, z);
    }

    @Override // com.google.android.gms.internal.ads.C1771mo, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, (Map<String, String>) null);
    }
}
