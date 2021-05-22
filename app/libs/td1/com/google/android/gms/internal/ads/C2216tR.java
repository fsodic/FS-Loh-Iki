package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tR  reason: case insensitive filesystem */
public final class C2216tR implements AbstractC2109rl {

    /* renamed from: a  reason: collision with root package name */
    public final String f5609a = this.d.optString("ad_html", null);

    /* renamed from: b  reason: collision with root package name */
    public final String f5610b = this.d.optString("ad_base_url", null);

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f5611c = this.d.optJSONObject("ad_json");
    private final JSONObject d;

    C2216tR(JsonReader jsonReader) {
        this.d = C2041ql.c(jsonReader);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2109rl
    public final void a(JsonWriter jsonWriter) {
        C2041ql.a(jsonWriter, this.d);
    }
}
