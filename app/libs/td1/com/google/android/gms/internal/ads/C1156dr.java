package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dr  reason: case insensitive filesystem */
public final class C1156dr implements AbstractC0950ar {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4156a;

    public C1156dr(Context context) {
        this.f4156a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0950ar
    public final void a(Map<String, String> map) {
        CookieManager c2;
        String str = map.get("cookie");
        if (!TextUtils.isEmpty(str) && (c2 = q.e().c(this.f4156a)) != null) {
            c2.setCookie((String) C2392voa.e().a(C2474x.qa), str);
        }
    }
}
