package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jf  reason: case insensitive filesystem */
public final class C1546jf {

    /* renamed from: a  reason: collision with root package name */
    public final List<C1615kf> f4697a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4698b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f4699c;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private final List<String> g;
    private final boolean h;
    private final String i;
    private final long j;
    private final String k;
    private final int l;
    private final int m;
    private final long n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private int s;
    private int t;
    private boolean u;

    public C1546jf(JSONObject jSONObject) {
        if (C0745Vl.a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            C1763mk.f(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                C1615kf kfVar = new C1615kf(jSONArray.getJSONObject(i3));
                boolean z = true;
                if ("banner".equalsIgnoreCase(kfVar.v)) {
                    this.u = true;
                }
                arrayList.add(kfVar);
                if (i2 < 0) {
                    Iterator<String> it = kfVar.f4794c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i2 = i3;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.s = i2;
        this.t = jSONArray.length();
        this.f4697a = Collections.unmodifiableList(arrayList);
        this.i = jSONObject.optString("qdata");
        this.m = jSONObject.optInt("fs_model_type", -1);
        long j2 = -1;
        this.n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f4698b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            q.u();
            this.f4699c = C1753mf.a(optJSONObject, "click_urls");
            q.u();
            this.d = C1753mf.a(optJSONObject, "imp_urls");
            q.u();
            this.e = C1753mf.a(optJSONObject, "downloaded_imp_urls");
            q.u();
            this.f = C1753mf.a(optJSONObject, "nofill_urls");
            q.u();
            this.g = C1753mf.a(optJSONObject, "remote_ping_urls");
            this.h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.j = optLong > 0 ? 1000 * optLong : j2;
            C0456Ki a2 = C0456Ki.a(optJSONObject.optJSONArray("rewards"));
            if (a2 == null) {
                this.k = null;
                this.l = 0;
            } else {
                this.k = a2.f2422a;
                this.l = a2.f2423b;
            }
            this.o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.r = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f4698b = -1;
        this.f4699c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = -1;
        this.k = null;
        this.l = 0;
        this.o = false;
        this.h = false;
        this.p = false;
        this.q = false;
        this.r = false;
    }
}
