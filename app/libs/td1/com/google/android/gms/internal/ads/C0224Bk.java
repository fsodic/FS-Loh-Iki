package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.Bk  reason: case insensitive filesystem */
public class C0224Bk {
    private C0224Bk() {
    }

    public static C0224Bk a(int i) {
        return i >= 28 ? new C0510Mk() : i >= 26 ? new C0432Jk() : i >= 24 ? new C0458Kk() : i >= 21 ? new C0380Hk() : i >= 19 ? new C0406Ik() : i >= 18 ? new C0328Fk() : i >= 17 ? new C0354Gk() : new C0224Bk();
    }

    public static boolean a(AbstractC1564jo joVar) {
        if (joVar == null) {
            return false;
        }
        joVar.onPause();
        return true;
    }

    public static boolean b(AbstractC1564jo joVar) {
        if (joVar == null) {
            return false;
        }
        joVar.onResume();
        return true;
    }

    public static boolean c() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public int a() {
        return 5;
    }

    public int a(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public Cna a(Context context, TelephonyManager telephonyManager) {
        return Cna.ENUM_UNKNOWN;
    }

    public C1771mo a(AbstractC1564jo joVar, Dma dma, boolean z) {
        return new C0592Po(joVar, dma, z);
    }

    public String a(Context context) {
        return BuildConfig.FLAVOR;
    }

    public void a(Activity activity) {
    }

    public boolean a(Activity activity, Configuration configuration) {
        return false;
    }

    public boolean a(Context context, WebSettings webSettings) {
        C0251Cl.a(context, new CallableC0302Ek(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public boolean a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int b(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public void b(Context context) {
    }

    public CookieManager c(Context context) {
        if (c()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C0745Vl.b("Failed to obtain CookieManager.", th);
            q.g().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public int d() {
        return 1;
    }

    public long e() {
        return -1;
    }
}
