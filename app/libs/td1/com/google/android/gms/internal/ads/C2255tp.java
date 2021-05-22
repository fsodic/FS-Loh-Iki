package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.o;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.tp  reason: case insensitive filesystem */
public final class C2255tp {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f5662a;

    private C2255tp() {
    }

    @TargetApi(19)
    static void a(WebView webView, String str) {
        if (!o.f() || !a(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    @TargetApi(19)
    private static boolean a(WebView webView) {
        boolean booleanValue;
        synchronized (C2255tp.class) {
            if (f5662a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f5662a = true;
                } catch (IllegalStateException unused) {
                    f5662a = false;
                }
            }
            booleanValue = f5662a.booleanValue();
        }
        return booleanValue;
    }
}
