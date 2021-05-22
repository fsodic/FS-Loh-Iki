package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C1763mk;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.C2452wk;
import com.google.android.gms.internal.ads.C2474x;

public final class b {
    private static boolean a(Context context, Intent intent, t tVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            C1763mk.f(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            q.c();
            C2452wk.a(context, intent);
            if (tVar == null) {
                return true;
            }
            tVar.a();
            return true;
        } catch (ActivityNotFoundException e) {
            C0745Vl.d(e.getMessage());
            return false;
        }
    }

    public static boolean a(Context context, d dVar, t tVar) {
        String str;
        int i = 0;
        if (dVar == null) {
            str = "No intent data for launcher overlay.";
        } else {
            C2474x.a(context);
            Intent intent = dVar.h;
            if (intent != null) {
                return a(context, intent, tVar);
            }
            Intent intent2 = new Intent();
            if (TextUtils.isEmpty(dVar.f1103b)) {
                str = "Open GMSG did not contain a URL.";
            } else {
                if (!TextUtils.isEmpty(dVar.f1104c)) {
                    intent2.setDataAndType(Uri.parse(dVar.f1103b), dVar.f1104c);
                } else {
                    intent2.setData(Uri.parse(dVar.f1103b));
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(dVar.d)) {
                    intent2.setPackage(dVar.d);
                }
                if (!TextUtils.isEmpty(dVar.e)) {
                    String[] split = dVar.e.split("/", 2);
                    if (split.length < 2) {
                        String valueOf = String.valueOf(dVar.e);
                        C0745Vl.d(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                        return false;
                    }
                    intent2.setClassName(split[0], split[1]);
                }
                String str2 = dVar.f;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        C0745Vl.d("Could not parse intent flags.");
                    }
                    intent2.addFlags(i);
                }
                if (((Boolean) C2392voa.e().a(C2474x.Kc)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) C2392voa.e().a(C2474x.Jc)).booleanValue()) {
                        q.c();
                        C2452wk.b(context, intent2);
                    }
                }
                return a(context, intent2, tVar);
            }
        }
        C0745Vl.d(str);
        return false;
    }
}
