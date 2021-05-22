package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class TO implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f3170a;

    /* renamed from: b  reason: collision with root package name */
    private String f3171b;

    public TO(String str, String str2) {
        this.f3170a = str;
        this.f3171b = str2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = C2041ql.a(jSONObject, "pii");
            a2.put("doritos", this.f3170a);
            a2.put("doritos_v2", this.f3171b);
        } catch (JSONException unused) {
            C1763mk.f("Failed putting doritos string.");
        }
    }
}
