package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Dl  reason: case insensitive filesystem */
final class CallableC0277Dl implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f1810a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f1811b;

    CallableC0277Dl(C0225Bl bl, Context context, Context context2) {
        this.f1810a = context;
        this.f1811b = context2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f1810a != null) {
            C1763mk.f("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f1810a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C1763mk.f("Attempting to read user agent from local cache.");
            sharedPreferences = this.f1811b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            C1763mk.f("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f1811b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C1763mk.f("Persisting user agent.");
            }
        }
        return string;
    }
}
