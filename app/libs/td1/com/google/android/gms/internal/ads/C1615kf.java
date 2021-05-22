package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kf  reason: case insensitive filesystem */
public final class C1615kf {

    /* renamed from: a  reason: collision with root package name */
    private final String f4792a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4793b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f4794c;
    private final String d;
    private final String e;
    private final List<String> f;
    private final List<String> g;
    private final List<String> h;
    private final List<String> i;
    private final List<String> j;
    public final String k;
    private final List<String> l;
    private final List<String> m;
    private final List<String> n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final List<String> t;
    private final String u;
    public final String v;
    private final long w;

    public C1615kf(JSONObject jSONObject) {
        List<String> list;
        this.f4793b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.f4794c = Collections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", null);
        q.u();
        this.f = C1753mf.a(jSONObject, "clickurl");
        q.u();
        this.g = C1753mf.a(jSONObject, "imp_urls");
        q.u();
        this.h = C1753mf.a(jSONObject, "downloaded_imp_urls");
        q.u();
        this.j = C1753mf.a(jSONObject, "fill_urls");
        q.u();
        this.l = C1753mf.a(jSONObject, "video_start_urls");
        q.u();
        this.n = C1753mf.a(jSONObject, "video_complete_urls");
        q.u();
        this.m = C1753mf.a(jSONObject, "video_reward_urls");
        this.o = jSONObject.optString("transaction_id");
        this.p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            q.u();
            list = C1753mf.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.i = list;
        this.f4792a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.q = jSONObject.optString("html_template", null);
        this.r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        q.u();
        this.t = C1753mf.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.v = jSONObject.optString("response_type", null);
        this.w = jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
