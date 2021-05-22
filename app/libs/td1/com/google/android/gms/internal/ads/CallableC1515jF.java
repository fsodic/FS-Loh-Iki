package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.jF  reason: case insensitive filesystem */
final /* synthetic */ class CallableC1515jF implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final CookieManager f4647a;

    CallableC1515jF(CookieManager cookieManager) {
        this.f4647a = cookieManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        CookieManager cookieManager = this.f4647a;
        if (cookieManager == null) {
            return BuildConfig.FLAVOR;
        }
        return cookieManager.getCookie((String) C2392voa.e().a(C2474x.qa));
    }
}
