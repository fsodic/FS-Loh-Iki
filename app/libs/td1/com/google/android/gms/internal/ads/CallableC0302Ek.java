package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ek  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC0302Ek implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1893a;

    /* renamed from: b  reason: collision with root package name */
    private final WebSettings f1894b;

    CallableC0302Ek(Context context, WebSettings webSettings) {
        this.f1893a = context;
        this.f1894b = webSettings;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f1893a;
        WebSettings webSettings = this.f1894b;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return true;
    }
}
