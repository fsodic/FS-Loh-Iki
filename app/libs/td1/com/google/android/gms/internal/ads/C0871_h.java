package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads._h  reason: case insensitive filesystem */
public final class C0871_h {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f3735a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3736b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3737c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private String h;
    private final int i;
    private final boolean j;
    private final JSONObject k;
    private final String l;
    private final boolean m;
    private final String n;

    public C0871_h(JSONObject jSONObject) {
        this.h = jSONObject.optString("url");
        this.f3736b = jSONObject.optString("base_uri");
        this.f3737c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i2 = 1;
        this.e = optString != null && (optString.equals("1") || optString.equals("true"));
        this.f = jSONObject.optString("request_id");
        this.d = jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        this.f3735a = optString2 == null ? null : Arrays.asList(optString2.split(","));
        this.i = jSONObject.optInt("valid", 0) == 1 ? -2 : i2;
        this.g = jSONObject.optString("fetched_ad");
        this.j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.l = jSONObject.optString("analytics_query_ad_event_id");
        this.m = jSONObject.optBoolean("is_analytics_logging_enabled");
        this.n = jSONObject.optString("pool_key");
    }

    public final int a() {
        return this.i;
    }

    public final String b() {
        return this.h;
    }

    public final List<String> c() {
        return this.f3735a;
    }

    public final String d() {
        return this.f3736b;
    }

    public final String e() {
        return this.f3737c;
    }

    public final boolean f() {
        return this.e;
    }

    public final JSONObject g() {
        return this.k;
    }

    public final String h() {
        return this.n;
    }
}
