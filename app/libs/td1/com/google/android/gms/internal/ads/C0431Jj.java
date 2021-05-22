package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Jj  reason: case insensitive filesystem */
public final class C0431Jj {
    private static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String a(Uri uri, Context context) {
        if (!q.A().a(context)) {
            return uri.toString();
        }
        String e = q.A().e(context);
        if (e == null) {
            return uri.toString();
        }
        if (((Boolean) C2392voa.e().a(C2474x.W)).booleanValue()) {
            String str = (String) C2392voa.e().a(C2474x.X);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                q.A().d(context, e);
                return a(uri2, context).replace(str, e);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String uri3 = a(a(uri.toString(), context), "fbs_aeid", e).toString();
            q.A().d(context, e);
            return uri3;
        }
        return uri.toString();
    }

    private static String a(String str, Context context) {
        String c2 = q.A().c(context);
        String d = q.A().d(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(c2)) {
            str = a(str, "gmp_app_id", c2).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(d)) ? str : a(str, "fbs_aiid", d).toString();
    }

    public static String a(String str, Context context, boolean z) {
        String e;
        if ((((Boolean) C2392voa.e().a(C2474x.ea)).booleanValue() && !z) || !q.A().a(context) || TextUtils.isEmpty(str) || (e = q.A().e(context)) == null) {
            return str;
        }
        if (((Boolean) C2392voa.e().a(C2474x.W)).booleanValue()) {
            String str2 = (String) C2392voa.e().a(C2474x.X);
            if (!str.contains(str2)) {
                return str;
            }
            if (q.c().c(str)) {
                q.A().d(context, e);
                return a(str, context).replace(str2, e);
            } else if (!q.c().d(str)) {
                return str;
            } else {
                q.A().e(context, e);
                return a(str, context).replace(str2, e);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (q.c().c(str)) {
                q.A().d(context, e);
                return a(a(str, context), "fbs_aeid", e).toString();
            } else if (!q.c().d(str)) {
                return str;
            } else {
                q.A().e(context, e);
                return a(a(str, context), "fbs_aeid", e).toString();
            }
        }
    }
}
