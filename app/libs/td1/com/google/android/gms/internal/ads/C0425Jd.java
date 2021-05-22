package com.google.android.gms.internal.ads;

import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.gms.internal.ads.Jd  reason: case insensitive filesystem */
final class C0425Jd {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0503Md f2329a;

    private C0425Jd(AbstractC0503Md md) {
        this.f2329a = md;
    }

    @JavascriptInterface
    public final void notify(String str) {
        this.f2329a.b(str);
    }
}
