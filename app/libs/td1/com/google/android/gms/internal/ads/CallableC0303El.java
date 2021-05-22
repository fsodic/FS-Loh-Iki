package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.r;
import java.util.concurrent.Callable;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.El  reason: case insensitive filesystem */
final class CallableC0303El implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f1898a;

    CallableC0303El(C0225Bl bl, Context context) {
        this.f1898a = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences = this.f1898a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            C1763mk.f("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f1898a);
            r.a(this.f1898a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        C1763mk.f("User agent is already initialized on Google Play Services.");
        return string;
    }
}
