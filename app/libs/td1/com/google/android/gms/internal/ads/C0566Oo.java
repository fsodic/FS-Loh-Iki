package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.q;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.Oo  reason: case insensitive filesystem */
public class C0566Oo extends C1771mo {
    public C0566Oo(AbstractC1564jo joVar, Dma dma, boolean z) {
        super(joVar, dma, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof AbstractC1564jo)) {
            C0745Vl.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        AbstractC1564jo joVar = (AbstractC1564jo) webView;
        AbstractC1761mj mjVar = this.u;
        if (mjVar != null) {
            mjVar.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.a(str, map);
        }
        if (joVar.d() != null) {
            joVar.d().e();
        }
        String str2 = (String) C2392voa.e().a(joVar.H().e() ? C2474x.H : joVar.k() ? C2474x.G : C2474x.F);
        q.c();
        return C2452wk.c(joVar.getContext(), joVar.q().f3587a, str2);
    }
}
