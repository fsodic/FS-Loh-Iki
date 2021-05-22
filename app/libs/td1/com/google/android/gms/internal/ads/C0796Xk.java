package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Xk  reason: case insensitive filesystem */
public final class C0796Xk {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3519a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private String f3520b = BuildConfig.FLAVOR;

    /* renamed from: c  reason: collision with root package name */
    private String f3521c = BuildConfig.FLAVOR;
    private boolean d = false;
    private String e = BuildConfig.FLAVOR;

    private final String a(Context context) {
        String str;
        synchronized (this.f3519a) {
            if (TextUtils.isEmpty(this.f3520b)) {
                q.c();
                this.f3520b = C2452wk.c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f3520b)) {
                    q.c();
                    this.f3520b = C2452wk.a();
                    q.c();
                    C2452wk.b(context, "debug_signals_id.txt", this.f3520b);
                }
            }
            str = this.f3520b;
        }
        return str;
    }

    private final void a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            C0745Vl.c("Can not create dialog without Activity Context");
        } else {
            C2452wk.f5921a.post(new RunnableC0770Wk(this, context, str, z, z2));
        }
    }

    private final boolean b(Context context, String str, String str2) {
        String d2 = d(context, d(context, (String) C2392voa.e().a(C2474x.Nc), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            C0745Vl.a("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d2.trim());
            String optString = jSONObject.optString("gct");
            this.e = jSONObject.optString("status");
            synchronized (this.f3519a) {
                this.f3521c = optString;
            }
            return true;
        } catch (JSONException e2) {
            C0745Vl.c("Fail to get in app preview response json.", e2);
            return false;
        }
    }

    private final void c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = d(context, (String) C2392voa.e().a(C2474x.Pc), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        q.c();
        C2452wk.a(context, str, buildUpon.build().toString());
    }

    private final boolean c(Context context, String str, String str2) {
        String d2 = d(context, d(context, (String) C2392voa.e().a(C2474x.Oc), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            C0745Vl.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d2.trim()).optString("debug_mode"));
            synchronized (this.f3519a) {
                this.d = equals;
            }
            return equals;
        } catch (JSONException e2) {
            C0745Vl.c("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    private final Uri d(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private static String d(Context context, String str, String str2) {
        String str3;
        Throwable e2;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", q.c().b(context, str2));
        SW<String> a2 = new C1489il(context).a(str, hashMap);
        try {
            return a2.get((long) ((Integer) C2392voa.e().a(C2474x.Qc)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e3) {
            e2 = e3;
            str5 = "Timeout while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C0745Vl.b(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C0745Vl.b(str3, e2);
            a2.cancel(true);
            return null;
        } catch (InterruptedException e4) {
            e2 = e4;
            str5 = "Interrupted while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C0745Vl.b(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C0745Vl.b(str3, e2);
            a2.cancel(true);
            return null;
        } catch (Exception e5) {
            String valueOf = String.valueOf(str);
            C0745Vl.b(valueOf.length() != 0 ? "Error retriving a response from: ".concat(valueOf) : new String("Error retriving a response from: "), e5);
            return null;
        }
    }

    private final void e(Context context, String str, String str2) {
        q.c();
        C2452wk.a(context, d(context, (String) C2392voa.e().a(C2474x.Mc), str, str2));
    }

    public final String a() {
        String str;
        synchronized (this.f3519a) {
            str = this.f3521c;
        }
        return str;
    }

    public final void a(Context context, String str, String str2) {
        if (!b(context, str, str2)) {
            a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.e)) {
            C0745Vl.a("Creative is not pushed for this device.");
            a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.e)) {
            C0745Vl.a("The app is not linked for creative preview.");
            e(context, str, str2);
        } else if ("0".equals(this.e)) {
            C0745Vl.a("Device is linked for in app preview.");
            a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        boolean b2 = b();
        if (c(context, str, str2)) {
            if (!b2 && !TextUtils.isEmpty(str3)) {
                c(context, str2, str3, str);
            }
            C0745Vl.a("Device is linked for debug signals.");
            a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        e(context, str, str2);
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f3519a) {
            z = this.d;
        }
        return z;
    }

    public final boolean b(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !q.m().b()) {
            return false;
        }
        C0745Vl.a("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }
}
