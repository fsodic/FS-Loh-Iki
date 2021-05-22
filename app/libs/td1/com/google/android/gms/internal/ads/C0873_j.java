package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads._j  reason: case insensitive filesystem */
public final class C0873_j {

    /* renamed from: a  reason: collision with root package name */
    private final long f3746a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f3747b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f3748c = new ArrayList();
    private final Map<String, C1546jf> d = new HashMap();
    private String e;
    private String f;
    private JSONObject g;
    private boolean h;

    public C0873_j(String str, long j) {
        JSONObject optJSONObject;
        this.h = false;
        this.f = str;
        this.f3746a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.g = new JSONObject(str);
                if (this.g.optInt("status", -1) != 1) {
                    this.h = false;
                    C0745Vl.d("App settings could not be fetched successfully.");
                    return;
                }
                this.h = true;
                this.e = this.g.optString("app_id");
                JSONArray optJSONArray = this.g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f3748c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject.optJSONObject("mediation_config")) != null) {
                                    this.d.put(optString2, new C1546jf(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f3747b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e2) {
                C0745Vl.c("Exception occurred while processing app setting json", e2);
                q.g().a(e2, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long a() {
        return this.f3746a;
    }

    public final boolean b() {
        return this.h;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final Map<String, C1546jf> e() {
        return this.d;
    }

    public final JSONObject f() {
        return this.g;
    }
}
