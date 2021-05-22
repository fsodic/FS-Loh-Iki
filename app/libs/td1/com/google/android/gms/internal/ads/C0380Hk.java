package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.Hk  reason: case insensitive filesystem */
public class C0380Hk extends C0406Ik {
    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final C1771mo a(AbstractC1564jo joVar, Dma dma, boolean z) {
        return new C0644Ro(joVar, dma, z);
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final CookieManager c(Context context) {
        if (C0224Bk.c()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C0745Vl.b("Failed to obtain CookieManager.", th);
            q.g().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final int d() {
        return 16974374;
    }
}
