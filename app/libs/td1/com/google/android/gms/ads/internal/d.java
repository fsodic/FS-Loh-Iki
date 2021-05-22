package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0348Ge;
import com.google.android.gms.internal.ads.AbstractC0452Ke;
import com.google.android.gms.internal.ads.C0426Je;
import com.google.android.gms.internal.ads.C0556Oe;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C0823Yl;
import com.google.android.gms.internal.ads.C0873_j;
import com.google.android.gms.internal.ads.C0875_l;
import com.google.android.gms.internal.ads.C1148dm;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.C2474x;
import com.google.android.gms.internal.ads.JW;
import com.google.android.gms.internal.ads.SW;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private Context f1078a;

    /* renamed from: b  reason: collision with root package name */
    private long f1079b = 0;

    private final void a(Context context, C0823Yl yl, boolean z, C0873_j _jVar, String str, String str2, Runnable runnable) {
        if (q.j().b() - this.f1079b < 5000) {
            C0745Vl.d("Not retrying to fetch app settings");
            return;
        }
        this.f1079b = q.j().b();
        boolean z2 = true;
        if (_jVar != null) {
            if (!(q.j().a() - _jVar.a() > ((Long) C2392voa.e().a(C2474x.tc)).longValue()) && _jVar.b()) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                C0745Vl.d("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f1078a = applicationContext;
                C0556Oe b2 = q.p().b(this.f1078a, yl);
                AbstractC0452Ke<JSONObject> ke = C0426Je.f2334b;
                AbstractC0348Ge a2 = b2.a("google.afma.config.fetchAppSettings", ke, ke);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    SW a3 = a2.a(jSONObject);
                    SW a4 = JW.a(a3, f.f1080a, C0875_l.f);
                    if (runnable != null) {
                        a3.a(runnable, C0875_l.f);
                    }
                    C1148dm.a(a4, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    C0745Vl.b("Error requesting application settings", e);
                }
            } else {
                C0745Vl.d("App settings could not be fetched. Required parameters missing");
            }
        }
    }

    public final void a(Context context, C0823Yl yl, String str, C0873_j _jVar) {
        a(context, yl, false, _jVar, _jVar != null ? _jVar.d() : null, str, null);
    }

    public final void a(Context context, C0823Yl yl, String str, Runnable runnable) {
        a(context, yl, true, null, str, null, runnable);
    }
}
