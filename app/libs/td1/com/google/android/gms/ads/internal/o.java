package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C0823Yl;
import com.google.android.gms.internal.ads.C1330ga;
import com.google.android.gms.internal.ads.VN;
import com.google.android.gms.internal.ads.Zna;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* access modifiers changed from: package-private */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1093a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1094b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f1095c = new TreeMap();
    private String d;
    private String e;

    public o(Context context, String str) {
        this.f1093a = context.getApplicationContext();
        this.f1094b = str;
    }

    public final String a() {
        return this.d;
    }

    public final void a(Zna zna, C0823Yl yl) {
        this.d = zna.j.f4252a;
        Bundle bundle = zna.m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String a2 = C1330ga.f4399c.a();
            for (String str : bundle2.keySet()) {
                if (a2.equals(str)) {
                    this.e = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    this.f1095c.put(str.substring(4), bundle2.getString(str));
                }
            }
            this.f1095c.put("SDKVersion", yl.f3587a);
            if (C1330ga.f4397a.a().booleanValue()) {
                try {
                    Bundle a3 = VN.a(this.f1093a, new JSONArray(C1330ga.f4398b.a()));
                    for (String str2 : a3.keySet()) {
                        this.f1095c.put(str2, a3.get(str2).toString());
                    }
                } catch (JSONException e2) {
                    C0745Vl.b("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e2);
                }
            }
        }
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f1094b;
    }

    public final Map<String, String> d() {
        return this.f1095c;
    }
}
